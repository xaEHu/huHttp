# huHttp
含请求队列、重试机制的网络请求封装框架

[![](https://jitpack.io/v/xaEHu/huHttp.svg)](https://jitpack.io/#xaEHu/huHttp)
#### 如何使用：

## 依赖：
在根目录的`build.gradle`添加这一句代码：
```java
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
在app目录下的`build.gradle`添加依赖使用：
```java
dependencies {
        implementation 'com.github.xaEHu:huHttp:1.0'
}
```

## 使用
HuHttp.sendJsonRequest(url, null ,null, UserBean.class, new ResponseListener<UserBean>() {
            @Override
            public void onSuccess(UserBean userBean) {
                //成功处理
            }

            @Override
            public void onFail() {
                //失败处理
            }
        });
```
