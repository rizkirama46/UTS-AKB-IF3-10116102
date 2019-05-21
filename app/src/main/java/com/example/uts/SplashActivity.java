package com.example.uts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

//Tanggal Pengerjaaan = 19-mei-2019
//10116102
//Mohammad Rizki Ramadhan/
//IF-3

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(){
            public void run(){
                try {
                    sleep(4000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }
            }
        };
        thread.start();
    }


}
