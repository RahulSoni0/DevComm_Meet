package com.monstertechno.bluryloginpagedesign2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class signupacc extends AppCompatActivity {
  private TextView loginbtnrd ;
  private Button Signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupacc);


        loginbtnrd = findViewById(R.id.loginbtnrd);
        loginbtnrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(signupacc.this,Signinacc.class);
                startActivity(it);
            }
        });

    }










}