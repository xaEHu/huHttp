package com.xaehu.httplib;

import android.util.Log;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author : xaeHu
 * e-mail : hsfemail@qq.com
 * date   : 2019/9/18 11:41
 * desc   : 线程池管理类
 */
public class ThreadPoolMananger {

    private static ThreadPoolMananger threadPoolMananger = new ThreadPoolMananger();
    private ThreadPoolExecutor threadPoolExecutor;

    public static ThreadPoolMananger getInstance() {
        return threadPoolMananger;
    }

    /**
     * 正常队列
     */
    private LinkedBlockingQueue<Runnable> mQueue = new LinkedBlockingQueue<>();

    /**
     * 添加一个线程
     *
     * @param runnable 线程
     */
    public void addTask(Runnable runnable) {
        if (runnable != null) {
            try {
                mQueue.put(runnable);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private ThreadPoolMananger() {
        threadPoolExecutor = new ThreadPoolExecutor(3, 10, 15, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(4), new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                addTask(r);
            }
        });
        threadPoolExecutor.execute(coreThread);
        threadPoolExecutor.execute(delayThread);
    }

    /**
     * 核心线程
     */
    private Runnable coreThread = new Runnable() {
        @Override
        public void run() {
            Runnable runn = null;
            while (true) {
                try {
                    runn = mQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                threadPoolExecutor.execute(runn);
            }
        }
    };

    /************************ 重试机制 *****************************/

    /**
     * 延迟队列
     */
    private DelayQueue<HttpTask> delayQueue = new DelayQueue();

    /**
     * 添加一个延迟线程
     *
     * @param httpTask 线程
     */
    void addDelayTask(HttpTask httpTask) {
        if (httpTask != null) {
            httpTask.setRetryTime(3000);
            delayQueue.offer(httpTask);
        }
    }

    /**
     * 专门处理延迟队列的线程
     */
    private Runnable delayThread = new Runnable() {
        @Override
        public void run() {
            HttpTask httpTask = null;
            while (true) {
                try {
                    httpTask = delayQueue.take();
                    if (httpTask.getRetryCount() < 3) {
                        threadPoolExecutor.execute(httpTask);
                        httpTask.setRetryCount(httpTask.getRetryCount() + 1);
                        Log.e("myout", "run: 请求失败次数："+ httpTask.getRetryCount());
                    }else{
                        Log.e("myout", "run: 失败太多，停止请求。");
                        delayQueue.remove(httpTask);
                        httpTask.onFail();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
}
