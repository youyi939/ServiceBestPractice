package com.example.servicebestpractice;

public interface DownloadListener {

    void onProgress (int progress);         //通知当前的下载进度

    void onSuccess();

    void onFailed();            //失败

    void onPaused();            //暂停

    void onCanceled();

}
