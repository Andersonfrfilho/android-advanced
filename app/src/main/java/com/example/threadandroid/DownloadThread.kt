package com.example.threadandroid

import android.util.Log;
import android.os.Looper;

class DownloadThread: Thread() {
    val TAG:String = this@DownloadThread.javaClass.simpleName;
    lateinit var mHandler:DownloadHandler

    override fun run(){
        Looper.prepare();
        mHandler = DownloadHandler();
        Looper.loop();
    }
}