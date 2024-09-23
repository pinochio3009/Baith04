package com.phuongduyen.bt3_tinhchisobmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //EditText edtTen,edtChieuCao, edtCanNang, edtBMI, edtChuanDoan;
    //Button btnTinhBMI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btntinhBMI(View arg0){
        Button btnTinhBMI = (Button) findViewById(R.id.btnTinhBMI);
        EditText edtTen, edtChieuCao, edtCanNang, edtBMI, edtChuanDoan;
        edtTen = (EditText) findViewById(R.id.edtTen);
        edtChieuCao = (EditText) findViewById(R.id.edtChieuCao);
        edtCanNang = (EditText) findViewById(R.id.edtCanNang);
        edtBMI = (EditText) findViewById(R.id.edtBMI);
        edtChuanDoan = (EditText) findViewById(R.id.edtChuanDoan);

        double H = Double.parseDouble(edtChieuCao.getText()+"");
        double W = Double.parseDouble(edtCanNang.getText()+"");
        double BMI = W/Math.pow(H,2);
        String chuandoan = "";

        if(BMI<18){
            chuandoan = "Bạn gầy";
        }
        else if(BMI<=24.9){
            chuandoan = "Bạn bình thường";
        }
        else if(BMI<=29.9){
            chuandoan = "Bạn béo phì cấp độ 1";
        }
        else if(BMI<=34.9){
            chuandoan = "Bạn béo phì cấp độ 2";
        }
        else {
            chuandoan = "Bạn béo phì cấp độ 3";
        }

        DecimalFormat dcf = new DecimalFormat("#.0");
        edtBMI.setText(dcf.format(BMI));
        edtChuanDoan.setText(chuandoan);

    }
}