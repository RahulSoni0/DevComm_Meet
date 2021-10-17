package com.monstertechno.bluryloginpagedesign2019;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ForgetPass extends AppCompatActivity {
    private TextView RTtnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);

        RTtnlogin = findViewById(R.id.RTNLOGIN);

        RTtnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ForgetPass.this , Signinacc.class);
                startActivity(intent);
            }
        });

    }
}