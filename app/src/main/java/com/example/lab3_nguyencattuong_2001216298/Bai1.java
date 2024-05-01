package com.example.lab3_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Bai1 extends AppCompatActivity {
    EditText txtA, txtB;
    Button btnKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        addControl();
        addEvent();
    }
    void addControl()
    {
        txtA = (EditText) findViewById(R.id.txtA);
        txtB = (EditText) findViewById(R.id.txtB);
        btnKetQua = (Button) findViewById(R.id.btnKetQua);
    }
    void addEvent()
    {

        btnKetQua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplicationContext(),Bai1b.class);
                //Khai báo Bundle
                Bundle bundle = new Bundle();
                int a = Integer.parseInt(txtA.getText().toString());
                int b = Integer.parseInt(txtB.getText().toString());
//                đưa dữ liệu riêng lẻ vào Bundle
                bundle.putInt("soa", a);
                bundle.putInt("sob",b);
//                Đưa bundle vào intent
                intent.putExtra("Mypackage", bundle);
//                Mở activity Bài1b
                startActivity(intent);
            }
        });
    }
}