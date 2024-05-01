package com.example.lab3_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Bai3a extends AppCompatActivity {
EditText txtYourName3a, txtEmail3a;
Button btnSend3a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3a);
       addControl();
       addEvent();
    }
    void addControl()
    {
        txtYourName3a = (EditText) findViewById(R.id.txtYourName3a);
        txtEmail3a = (EditText) findViewById(R.id.txtEmail3a);
        btnSend3a = (Button) findViewById(R.id.btnSend3a);
    }
    void addEvent()
    {
        btnSend3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Bai3b.class);

                Bundle bundle = new Bundle();

                String Name = txtYourName3a.getText().toString();
                String Email = txtEmail3a.getText().toString();

                bundle.putString("name",Name);
                bundle.putString("email", Email);

                intent.putExtra("infor", bundle);

                startActivity(intent);
            }
        });
    }
}