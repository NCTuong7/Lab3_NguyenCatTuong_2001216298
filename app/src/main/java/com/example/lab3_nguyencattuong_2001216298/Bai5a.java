package com.example.lab3_nguyencattuong_2001216298;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bai5a extends AppCompatActivity {
EditText txtNhapso5a, txtDayso5a;
Button btnAdd5a, btnCreate5a, btnSort5a, btnMaxmin5a, btnXuatxuoi5a, btnXuatnguoc5a, btnDaorandom5a;
CheckBox chkChan5a, chkLe5a, chkRandom5a, chkSoam5a;
RadioButton radTang5a, radGiam5a;
    String cmd = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5a);
        addControl();
        addEvent();

    }
    void addControl()
    {
        txtNhapso5a = (EditText) findViewById(R.id.txtNhapso5a);
        txtDayso5a = (EditText)  findViewById(R.id.txtDayso5a);
        btnAdd5a = (Button) findViewById(R.id.btnAdd5a);
        btnCreate5a = (Button) findViewById(R.id.btnCreate5a);
        btnSort5a = (Button) findViewById(R.id.btnSort5a);
        btnMaxmin5a = (Button) findViewById(R.id.btnMaxmin5a);
        btnXuatxuoi5a = (Button) findViewById(R.id.btnXuatxuoi5a);
        btnXuatnguoc5a = (Button) findViewById(R.id.btnXuatnguoc5a);
        btnDaorandom5a = (Button) findViewById(R.id.btnDaorandom5a);
        chkChan5a = (CheckBox) findViewById(R.id.chkChan5a);
        chkLe5a = (CheckBox) findViewById(R.id.chkLe5a);
        chkRandom5a= (CheckBox) findViewById(R.id.chkRandom5a);
        chkSoam5a= (CheckBox) findViewById(R.id.chkSoam5a);
        radTang5a = (RadioButton) findViewById(R.id.radTang5a);
        radGiam5a = (RadioButton) findViewById(R.id.radGiam5a);

    }

    void addEvent()
    {
        List<Integer> list = new ArrayList<Integer>();
        btnAdd5a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtDayso5a.append(txtNhapso5a.getText().toString() + " ");
                txtNhapso5a.setText("");

            }
        });
      btnCreate5a.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(chkChan5a.isChecked())
              {
                  String [] arrDayso = new String[10];
                  Random r = new Random();


                      for(int i = 0 ; i< 10;i++)
                      {
                          int num = r.nextInt(100 / 2 + 1) * 2;

                          arrDayso[i] = String.valueOf(num);
                          list.add(num);
                      }

                  for(String x : arrDayso)
                  {
                      txtDayso5a.append(" " + x);
                  }

              }
              if (chkLe5a.isChecked())
              {
                  list.clear();
                  String[] arrDayso = new String[10];
                  Random r = new Random();
                  for(int i = 0; i< 10; i++)
                  {
                      int num = 0;
                     do {
                          num = r.nextInt(100) ;
                     }while (num % 2 ==0);
                      if (num % 2 != 0)
                      {
                          arrDayso[i] = String.valueOf(num);
                          list.add(num);
                      }

                  }
                  for (String x : arrDayso)
                  {
                      txtDayso5a.append(" " + x);
                  }

              }
              if (chkRandom5a.isChecked())
              {
                  list.clear();
                  String[] arrDayso = new String[10];
                  Random r = new Random();
                  for(int i = 0; i< 10; i++)
                  {
                      int num = 0;
                          num = r.nextInt(100) ;
                          arrDayso[i] = String.valueOf(num);
                          list.add(num);

                  }
                  for (String x : arrDayso)
                  {
                      txtDayso5a.append(" " + x);
                  }
              }
              if(chkSoam5a.isChecked())
              {
                  list.clear();
                  String[] arrDayso = new String[10];
                  Random r = new Random();

                  for(int i = 0; i< 10; i++)
                  {
                      int num = 0;
                          num = r.nextInt((100 - (-100)) + 1) + (-100) ;
                          arrDayso[i] = String.valueOf(num);
                          list.add(num);
                  }

                  for (String x : arrDayso)
                  {
                      txtDayso5a.append(" " + x);
                  }
              }

          }

      });
      chkChan5a.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              txtDayso5a.setText("");
              chkLe5a.setChecked(false);
              chkRandom5a.setChecked(false);
              chkSoam5a.setChecked(false);
          }
      });
chkLe5a.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        txtDayso5a.setText("");
        chkChan5a.setChecked(false);
        chkRandom5a.setChecked(false);
        chkSoam5a.setChecked(false);
    }
});
chkRandom5a.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        txtDayso5a.setText("");
        chkLe5a.setChecked(false);
        chkChan5a.setChecked(false);
        chkSoam5a.setChecked(false);
    }
});
chkSoam5a.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        txtDayso5a.setText("");
        chkLe5a.setChecked(false);
        chkRandom5a.setChecked(false);
        chkChan5a.setChecked(false);
    }
});
btnSort5a.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(radTang5a.isChecked())
        {
//            String dayso = txtDayso5a.getText().toString();
//            List<String> myList = new ArrayList<String>();
//            String [] arrDayso = dayso.split(" ");
//            for( String x : arrDayso)
//            {
//                myList.add(x);
//            }
//
//            List<Integer> intList = new ArrayList<Integer>();
//            for (String x: myList)
//                intList.add(Integer.parseInt(x));
//           Collections.sort(intList);
            Collections.sort(list);

            txtDayso5a.setText("");

         for(int x : list)
         {
             txtDayso5a.append(String.valueOf(x) + " ");
         }

        }
        if(radGiam5a.isChecked())
        {
            Collections.sort(list);
            Collections.reverse(list);
            txtDayso5a.setText("");

            for(int x : list)
            {
                txtDayso5a.append(String.valueOf(x) + " ");
            }

        }
    }
});
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
btnMaxmin5a.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        builder.setTitle("Tìm max min");
        builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        String so = "Số lớn nhất: "+ Collections.max(list).toString() + "\n";
        so+= "Số nhỏ nhất: " + Collections.min(list).toString() + "\n";
        builder.setMessage(so);
        builder.create().show();

    }
});
btnXuatxuoi5a.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        builder.setTitle("Xuất xuôi");
        builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        Collections.sort(list);
        String so  = "";
        StringBuilder sp = new StringBuilder();
        for( int x : list)
        {
           sp.append(x).append(" ");
        }
        if (sp.length() > 0)
        {
            sp.deleteCharAt(sp.length()-1);
        }
        so += sp.toString();
        builder.setMessage(so);
        builder.create().show();
    }
});
btnXuatnguoc5a.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        builder.setTitle("Xuất ngược");
        builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        Collections.sort(list);
        Collections.reverse(list);
        String so  = "";
        StringBuilder sp = new StringBuilder();
        for( int x : list)
        {
            sp.append(x).append(" ");
        }
        if (sp.length() > 0)
        {
            sp.deleteCharAt(sp.length()-1);
        }
        so += sp.toString();
        builder.setMessage(so);
        builder.create().show();


    }
});
btnDaorandom5a.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        builder.setTitle("Xuất ngẫu nhiên");
        builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        Collections.shuffle(list);
        String so  = "";
        StringBuilder sp = new StringBuilder();
        for( int x : list)
        {
            sp.append(x).append(" ");
        }
        if (sp.length() > 0)
        {
            sp.deleteCharAt(sp.length()-1);
        }
        so += sp.toString();
        builder.setMessage(so);
        builder.create().show();
    }
});

    }

}