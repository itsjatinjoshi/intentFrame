package com.example.a1893888.intentframe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
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

        final AlertDialog.Builder alertdialog = new AlertDialog.Builder(this);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            alertdialog.setMessage(R.string.alert);
            alertdialog.setTitle("Demo! ");


            alertdialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

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

            alertdialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    Toast.makeText(MainActivity.this, "No" ,Toast.LENGTH_LONG).show();
                }
            });
                alertdialog.show();

            }
        });


    }
}
