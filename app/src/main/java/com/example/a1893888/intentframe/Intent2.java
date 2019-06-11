package com.example.a1893888.intentframe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Intent2 extends AppCompatActivity {

    TextView tvName1, tvName2, tvPass1, tvPass2;

    String un, ps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);



        Intent intent = getIntent();
       un= intent.getStringExtra("UserName");
       ps= intent.getStringExtra("Password");


        tvName2=findViewById(R.id.tvName2);
        tvPass2= findViewById(R.id.tvPass2);

       tvName2.setText(un);
       tvPass2.setText(ps);



    }
}
