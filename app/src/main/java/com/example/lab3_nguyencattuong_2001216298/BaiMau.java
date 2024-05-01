package com.example.lab3_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class BaiMau extends AppCompatActivity {
Button btnNew;
ImageView imgHinhMau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_mau);
        addControl();
        addEvent();

    }
    void addControl()
    {
        btnNew = (Button) findViewById(R.id.btnNew);
        imgHinhMau = (ImageView) findViewById(R.id.imgHinhMau);
    }

    void addEvent()
    {
        int id[] = {R.drawable.battien, R.drawable.camchuong,
                R.drawable.dongtien, R.drawable.hoahong,
                R.drawable.hoalan, R.drawable.hoaly,
                R.drawable.sen, R.drawable.thuyvu, R.drawable.trinhnu, R.drawable.tulip, R.drawable.violet};
        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int n = r.nextInt(id.length);
                imgHinhMau.setImageResource(id[n]);
            }
        });
    }
}
