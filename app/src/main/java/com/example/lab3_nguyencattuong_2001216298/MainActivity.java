package com.example.lab3_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btnMau, btnBai1, btnBai2, btnBai3, btnBai4,btnBai5,btnBai6,btnBai7,btnBai8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addEvent();
    }
    void addControl()
    {
        btnMau = (Button) findViewById(R.id.btnMau);
        btnBai1  =(Button) findViewById(R.id.btnBai1);
        btnBai2 = (Button) findViewById(R.id.btnBai2);
        btnBai3 = (Button) findViewById(R.id.btnBai3);
        btnBai4 = (Button) findViewById(R.id.btnBai4);
        btnBai5 = (Button) findViewById(R.id.btnBai5);
        btnBai6 = (Button) findViewById(R.id.btnBai6);
        btnBai7 = (Button) findViewById(R.id.btnBai7);
        btnBai8 = (Button) findViewById(R.id.btnBai8);
    }
    void addEvent()
    {
        btnMau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),BaiMau.class);
                startActivity(intent);
            }
        });

        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(getApplicationContext(), Bai1.class);
            startActivity(intent);
            }
        });
        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai2.class);
                startActivity(intent);
            }
        });

        btnBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai3a.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Mở thành công bài 3", Toast.LENGTH_SHORT).show();

            }
        });
        btnBai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai4a.class);
                startActivity(intent);
            }
        });
        btnBai5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Bai5a.class);
                startActivity(intent);
            }
        });
        btnBai6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Bai6.class);
                startActivity(intent);

            }
        });
        btnBai7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Bai7.class);
                startActivity(intent);

            }
        });
        btnBai8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}