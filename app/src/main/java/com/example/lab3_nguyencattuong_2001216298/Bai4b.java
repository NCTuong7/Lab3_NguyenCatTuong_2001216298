package com.example.lab3_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class Bai4b extends AppCompatActivity {
TextView tvName4b, tvCmnd4b, tvBangCap4b, tvSoThich4b, tvThongTin4b;
Button btnDong4b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4b);
        addControl();
        addEvent();

        Intent caller = getIntent();
        Bundle paste = caller.getBundleExtra("canhan");
        String  name = paste.getString("hoten");
        String cmnd = paste.getString("chungminh");
        String bangCap = paste.getString("trinhdo");
        String soThich = paste.getString("damme");
        String thongTin = paste.getString("thongtin");
        tvName4b.setText(name.toString());
        tvCmnd4b.setText(cmnd.toString());
        tvBangCap4b.setText(bangCap.toString());
        tvSoThich4b.setText(soThich.toString());
        tvThongTin4b.setText(thongTin.toString());
    }
    void addControl()
    {
        tvName4b = (TextView) findViewById(R.id.tvName4b);
        tvCmnd4b = (TextView) findViewById(R.id.tvCmnd4b);
        tvBangCap4b = (TextView) findViewById(R.id.tvBangCap4b);
        tvSoThich4b = (TextView) findViewById(R.id.tvSoThich4b);
        tvThongTin4b = (TextView) findViewById(R.id.tvThongTin4b);
        btnDong4b = (Button) findViewById(R.id.btnDong4b);

    }

    void addEvent()
    {


        btnDong4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startActivity(startMain);
                finish();
            }
        });


    }

}