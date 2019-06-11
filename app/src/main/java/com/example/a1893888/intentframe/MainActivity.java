package com.example.a1893888.intentframe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etName, etPass;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName= findViewById(R.id.etName);
        etPass= findViewById(R.id.etPass);
        btnSubmit= findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String uname, upass;

                uname =etName.getText().toString().trim();
                upass= etPass.getText().toString().trim();

                Intent intent = new Intent(MainActivity.this, Intent2.class);

                intent.putExtra("UserName", uname);
                intent.putExtra("Password", upass);

                startActivity(intent);

                Toast.makeText(MainActivity.this, "Thank You !", Toast.LENGTH_LONG).show();


            }
        });
    }
}
