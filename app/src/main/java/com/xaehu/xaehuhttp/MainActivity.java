package com.xaehu.xaehuhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.xaehu.httplib.HuHttp;
import com.xaehu.httplib.RequestHeader;
import com.xaehu.httplib.ResponseListener;
import com.xaehu.httplib.ThreadPoolMananger;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.tv);
        textView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String url = "http://www.kugou.com/yy/index.php?r=play/getdata&hash=CB7EE97F4CC11C4EA7A1FA4B516A5D97";
        List<RequestHeader> list = new ArrayList<>();
        list.add(new RequestHeader("Cookie","kg_mid=053b878290d8caa21c9d0d0ffeb091fa"));
        HuHttp.sendJsonRequest(url, list,null, KugouBean.class, new ResponseListener<KugouBean>() {
            @Override
            public void onSuccess(KugouBean kugouBean) {
                if (kugouBean.getData() != null){
                    textView.setText(kugouBean.getData().getPlay_url());
                }else{
                    textView.setText(kugouBean.getErr_code());
                }
            }

            @Override
            public void onFail() {
                textView.setText("请求失败");
            }
        });
    }
}
