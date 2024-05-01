package com.example.lab3_nguyencattuong_2001216298;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Bai7 extends AppCompatActivity {
    ImageView imgLa17 ,imgLa27, imgLa37;
    Button btnDone7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai7);
        addControl();
        addEvent();
    }
    void addControl()
    {
        imgLa17 = (ImageView) findViewById(R.id.imgLa17);
        imgLa27 = (ImageView) findViewById(R.id.imgLa27);
        imgLa37 = (ImageView) findViewById(R.id.imgLa37);
        btnDone7 = (Button) findViewById(R.id.btnDone7);
    }
    void addEvent()
    {
        int[] id = {R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,
                R.drawable.a9,R.drawable.a10,R.drawable.a11,R.drawable.a12,R.drawable.a13,R.drawable.a14,R.drawable.a15,R.drawable.a16,
                R.drawable.a17, R.drawable.a8,R.drawable.a19,R.drawable.a20,R.drawable.a21,R.drawable.a22,R.drawable.a23,R.drawable.a24,
                R.drawable.a25,R.drawable.a26,R.drawable.a27,R.drawable.a28,R.drawable.a29,R.drawable.a30,R.drawable.a31,R.drawable.a32,
                R.drawable.a33,R.drawable.a34,R.drawable.a35,R.drawable.a36,R.drawable.a37,R.drawable.a38,R.drawable.a39,R.drawable.a40,
                R.drawable.a41,R.drawable.a42,R.drawable.a43,R.drawable.a44,R.drawable.a45,R.drawable.a46,R.drawable.a47,R.drawable.a48,
                R.drawable.a49,R.drawable.a50,R.drawable.a51,R.drawable.a52
        };
        btnDone7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int l1,l2,l3, d1 = 0, d2 = 0, d3 = 0, sum = 0;
                    l1    = r.nextInt(id.length);

                    do {
                        l2 = r.nextInt(id.length);
                    }while (l2 == l1);

                    do {
                        l3 =r.nextInt(id.length);
                    }while (l3 == l2 || l3 == l1);
                    int [] so = new int[id.length];
                    for (int i = 0; i < id.length;i ++)
                    {
                        so[i] = id[i];
                    }
                    for(int x : so)
                        Toast.makeText(Bai7.this, String.valueOf(x), Toast.LENGTH_SHORT).show();
//                Toast.makeText(Bai7.this, String.valueOf(l1), Toast.LENGTH_SHORT).show();
//                Toast.makeText(Bai7.this, String.valueOf(l2), Toast.LENGTH_SHORT).show();
//                Toast.makeText(Bai7.this, String.valueOf(l3), Toast.LENGTH_SHORT).show();

                    imgLa17.setImageResource(id[l1]-1);
                    imgLa27.setImageResource(id[l2]-1);
                    imgLa37.setImageResource(id[l3]-1);
//
//                    switch (l1)
//                    {
//                        case 1:
//                        case 2:
//                        case 3:
//                        case 4:
//                            d1 = 1;
//                        break;
//                        case 5:
//                        case 6:
//                        case 7:
//                        case 8:
//                            d1 = 13;
//                            break;
//                        case 9:
//                        case 10:
//                        case 11:
//                        case 12:
//                            d1 = 12;
//                            break;
//                        case 13:
//                        case 14:
//                        case 15:
//                        case 16:
//                            d1 = 11;
//                            break;
//                        case 17:
//                        case 18:
//                        case 19:
//                        case 20:
//                            d1 = 10;
//                            break;
//                        case 21:
//                        case 22:
//                        case 23:
//                        case 24:
//                            d1 = 9;
//                            break;
//                            case 25 :
//                            case 26:
//                            case 27:
//                            case 28:
//
//                            d1 = 8;
//                            break;
//                        case 29:
//                        case 30:
//                        case 31:
//                        case 32:
//                            d1 = 7;
//                            break;
//                        case 33:
//                        case 34:
//                        case 35:
//                        case 36:
//                            d1 = 6;
//                            break;
//                        case 37:
//                        case 38:
//                        case 39:
//                        case 40:
//                            d1 = 5;
//                            break;
//                        case 41:
//                        case 42:
//                        case 43:
//                        case 44:
//                            d1 = 4;
//                            break;
//                        case 45:
//                        case 46:
//                        case 47:
//                        case 48:
//                            d1 = 3;
//                            break;
//                        case 49:
//                        case 50:
//                        case 51:
//                        case 52:
//                            d1 = 2;
//                            break;
//
//                    }
//
//                    switch (l2)
//                    {
//                        case 1:
//                        case 2:
//                        case 3:
//                        case 4:
//                            d2 = 1;
//                            break;
//                        case 5:
//                        case 6:
//                        case 7:
//                        case 8:
//                            d2 = 13;
//                            break;
//                        case 9:
//                        case 10:
//                        case 11:
//                        case 12:
//                            d2 = 12;
//                            break;
//                        case 13:
//                        case 14:
//                        case 15:
//                        case 16:
//                            d2 = 11;
//                            break;
//                        case 17:
//                        case 18:
//                        case 19:
//                        case 20:
//                            d2 = 10;
//                            break;
//                        case 21:
//                        case 22:
//                        case 23:
//                        case 24:
//                            d2 = 9;
//                            break;
//                        case 25 :
//                        case 26:
//                        case 27:
//                        case 28:
//
//                            d2 = 8;
//                            break;
//                        case 29:
//                        case 30:
//                        case 31:
//                        case 32:
//                            d2 = 7;
//                            break;
//                        case 33:
//                        case 34:
//                        case 35:
//                        case 36:
//                            d2 = 6;
//                            break;
//                        case 37:
//                        case 38:
//                        case 39:
//                        case 40:
//                            d2 = 5;
//                            break;
//                        case 41:
//                        case 42:
//                        case 43:
//                        case 44:
//                            d2 = 4;
//                            break;
//                        case 45:
//                        case 46:
//                        case 47:
//                        case 48:
//                            d2 = 3;
//                            break;
//                        case 49:
//                        case 50:
//                        case 51:
//                        case 52:
//                            d2 = 2;
//                            break;
//                    }
//
//                    switch (l3)
//                    {
//                        case 1:
//                        case 2:
//                        case 3:
//                        case 4:
//                            d3 = 1;
//                            break;
//                        case 5:
//                        case 6:
//                        case 7:
//                        case 8:
//                            d3 = 13;
//                            break;
//                        case 9:
//                        case 10:
//                        case 11:
//                        case 12:
//                            d3 = 12;
//                            break;
//                        case 13:
//                        case 14:
//                        case 15:
//                        case 16:
//                            d3 = 11;
//                            break;
//                        case 17:
//                        case 18:
//                        case 19:
//                        case 20:
//                            d3 = 10;
//                            break;
//                        case 21:
//                        case 22:
//                        case 23:
//                        case 24:
//                            d3 = 9;
//                            break;
//                        case 25 :
//                        case 26:
//                        case 27:
//                        case 28:
//
//                            d3 = 8;
//                            break;
//                        case 29:
//                        case 30:
//                        case 31:
//                        case 32:
//                            d3 = 7;
//                            break;
//                        case 33:
//                        case 34:
//                        case 35:
//                        case 36:
//                            d3 = 6;
//                            break;
//                        case 37:
//                        case 38:
//                        case 39:
//                        case 40:
//                            d3 = 5;
//                            break;
//                        case 41:
//                        case 42:
//                        case 43:
//                        case 44:
//                            d3 = 4;
//                            break;
//                        case 45:
//                        case 46:
//                        case 47:
//                        case 48:
//                            d3 = 3;
//                            break;
//                        case 49:
//                        case 50:
//                        case 51:
//                        case 52:
//                            d3 = 2;
//                            break;
//                    }
//
//                    if(d1 > 10 && d1 < 14)
//                    {
//                        if(d2 >= 10 && d2 <= 13)
//                        {
//                            if(d3 >= 10 && d3 <= 13)
//                            {
//                                Toast.makeText(Bai7.this, "Ba tây cào", Toast.LENGTH_SHORT).show();
//                                return;
//                            }
//                        }
//                    }
//                    else
//                        d1 = d2 = d3 = 10;
//
//                    sum = d1 + d2 + d3;
//                Toast.makeText(Bai7.this, String.valueOf(sum) + " nút", Toast.LENGTH_SHORT).show();
//


            }
        });
    }
}