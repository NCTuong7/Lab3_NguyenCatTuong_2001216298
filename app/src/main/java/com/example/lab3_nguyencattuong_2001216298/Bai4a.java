package com.example.lab3_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Bai4a extends AppCompatActivity {
EditText txtHoTen4a, txtCmnd4a;
TextView tvThongTin4a;
Button btnSend4a;
RadioButton radTrungCap4a, radCaoDang4a, radDaiHoc4a;
CheckBox chkDocSach4a, chkDocBao4a, chkDocCode4a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4a);
        addControl();
        addEvent();
    }
    void addControl()
    {
        txtHoTen4a = (EditText) findViewById(R.id.txtHoTen4a);
        txtCmnd4a = (EditText) findViewById(R.id.txtCmnd4a);
        radTrungCap4a = (RadioButton) findViewById(R.id.radTrungCap4a);
        radCaoDang4a = (RadioButton) findViewById(R.id.radCaoDang4a);
        radDaiHoc4a = (RadioButton) findViewById(R.id.radDaiHoc4a);
        chkDocSach4a = (CheckBox) findViewById(R.id.chkDocSach4a);
        chkDocBao4a = (CheckBox) findViewById(R.id.chkDocBao4a);
        chkDocCode4a = (CheckBox) findViewById(R.id.chkDocCode4a);
        tvThongTin4a = (TextView) findViewById(R.id.tvThongtin4a);
        btnSend4a = (Button) findViewById(R.id.btnSend4a);
    }
    void addEvent()
    {
        btnSend4a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bai4b.class);
                Bundle bundle  = new Bundle();

                String ten = txtHoTen4a.getText().toString();
                String cmnd = txtCmnd4a.getText().toString();
                String bangcap = radEvent().toString();
                String sothich = chkEvent().toString();
                String thongTinBoSung = tvThongTin4a.getText().toString();

                bundle.putString("hoten", ten);
                bundle.putString("chungminh",cmnd);
                bundle.putString("trinhdo",bangcap);
                bundle.putString("damme",sothich);
                bundle.putString("thongtin",thongTinBoSung);

                intent.putExtra("canhan",bundle);

                startActivity(intent);
            }
        });
    }
    String radEvent()
    {
        if (radTrungCap4a.isChecked())
            return "Trung cấp";
        if (radCaoDang4a.isChecked())
            return "Cao đẳng";
        return "Đại học";
    }

    String chkEvent()
    {
        String chk = "";
        if (chkDocBao4a.isChecked())
            chk += "Đọc báo";

        if (chkDocSach4a.isChecked())
        {
            if (chk == "")
                 chk += "Đọc sách";
            else
                chk+= " - Đọc sách";

        }

        if(chkDocCode4a.isChecked())
        {
            if (chk == "")
            {
                chk += "Đọc Coding";
            }
            else
                chk += " - Đọc Coding";

        }

        return chk;
    }


}