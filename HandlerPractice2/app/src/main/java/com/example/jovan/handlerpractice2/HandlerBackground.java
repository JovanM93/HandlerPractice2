package com.example.jovan.handlerpractice2;

import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

/**
 * Created by Delirium on 6/25/2017.
 */

public class HandlerBackground {
    public volatile boolean isPlaying = true;
    Handler handler = new Handler(Looper.getMainLooper());
    int i = 0;


    public void handle(final TextView textView){
        isPlaying = true;
        new Thread(new Runnable() {
            @Override
            public void run() {

                while(isPlaying){
                    try {
                        Thread.sleep(1000);
                        i++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                           textView.setText(""+i);
                        }
                    });
                }

            }
        }).start();
    }

    public void stopHandling(){
        isPlaying = false;


    }
}
