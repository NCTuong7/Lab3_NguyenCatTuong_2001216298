package com.example.lab3_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai1b extends AppCompatActivity {

Button btnBack;
TextView txtKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1b);
        addControl();
        addEvent();
        Intent callIntent = getIntent();
        Bundle packageFromCaller = callIntent.getBundleExtra("Mypackage");
        int a = packageFromCaller.getInt("soa");
        int b= packageFromCaller.getInt("sob");
        txtKetQua.setText(giaipt(a,b).toString());


    }
    void addControl()
    {
        txtKetQua = (TextView) findViewById(R.id.txtKetQua);
        btnBack = (Button) findViewById(R.id.btnBack);

    }

    void addEvent()
    {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),Bai1.class);
                startActivity(intent);
            }
        });
    }
    static String giaipt(int a, int b)
    {
        if (a == 0)
        {
            if (b == 0)
                return "Phương trình vô số nghiệm";
            else
                return "Phương trình vô nghiệm";
        }
        else
        return " " + ((float)-b/a);
    }

}