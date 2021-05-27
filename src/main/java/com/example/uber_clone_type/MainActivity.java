package com.example.uber_clone_type;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ge;
        ge = findViewById(R.id.button);
        ge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlo();
            }
        });
    }
    public void openlo()
    {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}