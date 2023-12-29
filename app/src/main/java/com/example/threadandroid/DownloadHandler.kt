package com.example.threadandroid

import android.os.Handler;
import android.os.Message
import android.util.Log

class DownloadHandler: Handler() {
    var TAG:String = this@DownloadHandler.javaClass.simpleName;
    override fun handleMessage(msg: Message) {
        downloadSong(msg.obj.toString())
    }

    fun downloadSong(song:String){
        var endTime = System.currentTimeMillis() + 10 * 1000;

        while(System.currentTimeMillis() < endTime){
            try{
                Thread.sleep(1000);
            } catch (e:InterruptedException){
                e.printStackTrace();
            }
        }
        Log.d(TAG,song + "Song download");
    }

}