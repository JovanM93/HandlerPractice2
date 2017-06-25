package com.example.jovan.handlerpractice2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    HandlerBackground handlerBackground = new HandlerBackground();
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
    }
    public void handle(View view){
        handlerBackground.handle(textView);


    }

    public void stopHandling(View view){
        handlerBackground.stopHandling();

    }
}
