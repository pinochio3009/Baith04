package com.phuongduyen.bt2_chuyendoinhietdo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    // khai báo biến giao diện
    EditText txtFar, txtCel;
    Button btnFar, btnCel, btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ id
        txtFar = findViewById(R.id.txtFar);
        txtCel = findViewById(R.id.txtCel);
        btnFar = findViewById(R.id.btnFar);
        btnCel = findViewById(R.id.btnCel);
        btnClear = findViewById(R.id.btnClear);

        // Xử lý tương tác Click
        btnFar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat dcf = new DecimalFormat("0.00");  // làm tròn đến 2 chữ số thập phân
                int F = Integer.parseInt(txtFar.getText().toString());
                Double C = (F-32)/1.8;
                txtCel.setText(dcf.format(F)+"");   //txtCel.setText(C+""); ko làm tròn
            }
        });
        btnCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat dcf = new DecimalFormat("0.00");
                int C = Integer.parseInt(txtCel.getText().toString());
                Double F = C*1.8+32;
                txtFar.setText(dcf.format(F)+"");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtFar.setText("");
                txtCel.setText("");
            }
        });

    }
}