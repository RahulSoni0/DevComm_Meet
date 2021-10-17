package com.monstertechno.bluryloginpagedesign2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Signinacc extends AppCompatActivity {
  private TextView forgetpasstv;
  private TextView signuprd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinacc);
        forgetpasstv  = findViewById(R.id.forgetPasswordTv);
        signuprd = findViewById(R.id.signuprd);



        forgetpasstv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signinacc.this,ForgetPass.class);
                startActivity(intent);
            }
        });

        signuprd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signinacc.this , signupacc.class);
                startActivity(intent);
            }
        });

    }
}