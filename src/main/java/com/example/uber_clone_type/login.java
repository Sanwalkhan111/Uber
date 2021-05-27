package com.example.uber_clone_type;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText num;
        Button nex;
        nex = findViewById(R.id.button2);
        num = findViewById(R.id.editTextPhone);
        nex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nu = num.getText().toString();
                if(TextUtils.isEmpty(nu))
                {
                    Toast.makeText(login.this,"Please Enter a Number!!!", Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                {
                    openMa();
                }
            }
        });


    }
    public void openMa()
    {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}