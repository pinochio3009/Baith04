package com.phuongduyen.chuyendoinhietdo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt_SoA, txt_SoB;
    EditText edt_SoA, edt_SoB, edt_kq;
    Button btnTong, btnHieu, btnTich, btnThuong, btnUoc, btnThoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initControl(){
        txt_SoA = findViewById(R.id.txt_SoA);
        txt_SoB = findViewById(R.id.txt_SoB);
        edt_SoA = findViewById(R.id.edt_SoA);
        edt_SoB = findViewById(R.id.edt_SoB);
        edt_kq = findViewById(R.id.edt_Kq);
        btnTong = findViewById(R.id.btnTong);
        btnHieu = findViewById(R.id.btnHieu);
        btnTich = findViewById(R.id.btnTich);
        btnThuong = findViewById(R.id.btnThuong);
        btnUoc = findViewById(R.id.btnUoc);
        btnThoat = findViewById(R.id.btnThoat);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt_SoA.getText().toString());
                int b = Integer.parseInt(edt_SoB.getText().toString());
                int kq = a+b;
                edt_kq.setText(String.valueOf(kq)); //hthi kq tại đây
            }
        });

        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt_SoA.getText().toString());
                int b = Integer.parseInt(edt_SoB.getText().toString());
                int kq = Math.abs(a-b);
                edt_kq.setText(String.valueOf(kq));
            }
        });

        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt_SoA.getText().toString());
                int b = Integer.parseInt(edt_SoB.getText().toString());
                int kq = a*b;
                edt_kq.setText(String.valueOf(kq));
            }
        });

        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a = Double.parseDouble(edt_SoA.getText().toString());
                Double b = Double.parseDouble(edt_SoB.getText().toString());
                double kq = a/b;
                edt_kq.setText(String.valueOf(kq));
            }
        });

        btnUoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(edt_SoA.getText().toString());
                int b = Integer.parseInt(edt_SoB.getText().toString());
                int ucln = gcd(a,b);
                edt_kq.setText(String.valueOf(ucln));
            }
            private int gcd(int a, int b) {
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                return a;
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_SoA.setText("");
                edt_SoB.setText("");
                edt_kq.setText("");
            }
        });
    }
}