package com.lzy.demo.okserver;

import com.lzy.okgo.model.Progress;
import com.lzy.okserver.download.DownloadListener;

import java.io.File;

/**
 * ================================================
 * 作    者：jeasonlzy（廖子尧）Github地址：https://github.com/jeasonlzy
 * 版    本：1.0
 * 创建日期：2017/6/7
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class LogDownloadListener extends DownloadListener {

    public LogDownloadListener(Object tag) {
        super(tag);
    }

    @Override
    public void onStart(Progress progress) {
        System.out.println("onStart: " + progress);
    }

    @Override
    public void onProgress(Progress progress) {
        System.out.println("onProgress: " + progress);
    }

    @Override
    public void onError(Progress progress) {
        System.out.println("onError: " + progress);
        progress.exception.printStackTrace();
    }

    @Override
    public void onFinish(File file, Progress progress) {
        System.out.println("onFinish: " + progress);
    }
}