package com.example.lab3_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Bai3b extends AppCompatActivity {
EditText txtName3b, txtEmail3b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3b);

        addControl();

        addEvent();
        Intent caller = getIntent();
        Bundle callerBundleExtra = caller.getBundleExtra("infor");
        String name = callerBundleExtra.getString("name");
        String email = callerBundleExtra.getString("email");
        txtName3b.setText(name.toString());
        txtEmail3b.setText(email.toString());

    }

    void addControl()
    {
        txtName3b = (EditText) findViewById(R.id.txtName3b);
        txtEmail3b = (EditText) findViewById(R.id.txtEmail3b);
    }

    void addEvent()
    {

    }
}