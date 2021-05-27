package com.office.uber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.office.uber.helpers.Helper;

public class SplashActivity extends AppCompatActivity {



    private Handler handler;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textView=findViewById(R.id.tv_splash);
        handler=new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(Helper.isInternetAvailable(SplashActivity.this))
                {
                    //Helper.isUserAvailable()
                    if(true)
                    {
                        Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }else {
                        Helper.showSnackBar(findViewById(android.R.id.content),"Login please");
                        //intent
                    }
                }else {
                    Helper.showSnackBar(findViewById(android.R.id.content),"Check your internet connection");
                }

            }
        },2000);






    }
}