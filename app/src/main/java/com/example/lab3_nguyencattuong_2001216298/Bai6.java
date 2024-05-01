package com.example.lab3_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Bai6 extends AppCompatActivity {

    ImageView imgAnh;
    Button btnNew6a,btnFind6;
    ImageButton imbTop, imbLeft, imbRight, imbDown;

    EditText edtFind6;

    private  int viTriTruoc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai6);

addControl();
addEvent();
    }
    void addControl()
    {
btnNew6a = (Button) findViewById(R.id.btnNew6a);
btnFind6 = (Button) findViewById(R.id.btnFind6);
imgAnh = (ImageView) findViewById(R.id.imgAnh);
imbTop = (ImageButton) findViewById(R.id.imbTop);
imbDown = (ImageButton) findViewById(R.id.imbDown);
imbLeft = (ImageButton) findViewById(R.id.imbLeft);
imbRight = (ImageButton) findViewById(R.id.imbRight);
edtFind6 = (EditText) findViewById(R.id.edtFind6);
    }
    void addEvent()
    {
        int []id = {R.drawable.battien, R.drawable.camchuong,
                R.drawable.dongtien, R.drawable.hoahong,
                R.drawable.hoalan, R.drawable.hoaly,
                R.drawable.sen, R.drawable.thuyvu, R.drawable.trinhnu, R.drawable.tulip, R.drawable.violet};
        imbTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viTriTruoc = (viTriTruoc + 1 ) % id.length;
                imgAnh.setImageResource(id[viTriTruoc]);
            }
        });
        imbDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viTriTruoc = (viTriTruoc - 1 + id.length) % id.length;
                imgAnh.setImageResource(id[viTriTruoc]);
            }
        });
        imbLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viTriTruoc = (viTriTruoc + 1 ) % id.length;
                imgAnh.setImageResource(id[viTriTruoc]);
            }
        });
        imbRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viTriTruoc = (viTriTruoc - 1 + id.length) % id.length;
                imgAnh.setImageResource(id[viTriTruoc]);
            }
        });
        btnFind6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tenHoa = edtFind6.getText().toString().trim();
                int imgResource = 0;
                if(!tenHoa.isEmpty())
                {

                    imgResource = getResources().getIdentifier(tenHoa, "drawable", getPackageName());

                    if (imgResource != 0)
                        imgAnh.setImageResource(imgResource);

                    else
                        Toast.makeText(Bai6.this, "Không tìm thấy ảnh", Toast.LENGTH_SHORT).show();
                }

                else
                    Toast.makeText(Bai6.this, "Bạn chưa nhập tên ảnh cần tìm", Toast.LENGTH_SHORT).show();
            }
        });
    }



}