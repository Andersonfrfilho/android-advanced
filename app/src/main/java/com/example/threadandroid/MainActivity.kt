package com.example.threadandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.os.Message

class MainActivity : AppCompatActivity() {
    var TAG:String = this@MainActivity.javaClass.simpleName;
    lateinit var mDownloadButton:Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var thread:DownloadThread = DownloadThread();
        thread.name = ("DownloadThread");
        thread.start();
        findViewById<Button>(R.id.downloadButton)
            .setOnClickListener {
                Toast.makeText(this@MainActivity,"Downbloading", Toast.LENGTH_SHORT)

                for (song in Playlist.songs){
                    var message:Message = Message.obtain()
                    message.obj = song;
                    thread.mHandler.sendMessage(message);
                }
            }
    }
}