package com.example.lab3_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class Bai2 extends AppCompatActivity {
RadioButton rad_a, rad_b,rad_c;
Button btnKetQua2;
TextView txtmgs;

    CompoundButton.OnCheckedChangeListener listenerRadio = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            btnKetQua2.setEnabled(true);
            if(b)
                txtmgs.setText("Bạn chọn "+ compoundButton.getText());
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        addConTrol();
        addEvent();

    }
    void addConTrol()
    {
        rad_a = (RadioButton) findViewById(R.id.rad_a);
        rad_b = (RadioButton) findViewById(R.id.rad_b);
        rad_c = (RadioButton) findViewById(R.id.rad_c);
        btnKetQua2 = (Button) findViewById(R.id.btnKetQua2);
        txtmgs  = (TextView) findViewById(R.id.txtmgs);
    }
    void addEvent()
    {
        rad_a.setOnCheckedChangeListener(listenerRadio);
        rad_b.setOnCheckedChangeListener(listenerRadio);
        rad_c.setOnCheckedChangeListener(listenerRadio);
        btnKetQua2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rad_b.isChecked())
                {
                    txtmgs.setText("Đúng rồi");
                }
                else
                    txtmgs.setText("Sai rồi");
            }
        });
    }


}