package com.example.exchangeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GiaVangActivity extends AppCompatActivity {

    // Khoi tao cac item tai menu
    private Button btnTyGia;
    private Button btnNgoaiTe;
    private Button btnGiaVang;
    private Button btnLaiSuat;
    private Button btnTienAo;
    private Button btnXangDau;

    private Button btnSJC;
    private Button btnPNG;
    private Button btnDOJI;
    private Button btnTheGioi;
    private Button btnPhuQuy;
    private Button btnBTMC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gia_vang);
        getSupportActionBar().hide();
        // Lay gia tri cua nut bam tai menu
        btnTyGia = (Button) findViewById(R.id.btnTyGia);
        btnNgoaiTe = (Button) findViewById(R.id.btnNgoaiTe);
        btnGiaVang = (Button) findViewById(R.id.btnGiaVang);
        btnLaiSuat = (Button) findViewById(R.id.btnLaiSuat);
        btnTienAo = (Button) findViewById(R.id.btnTienAo);

        btnNgoaiTe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaVangActivity.this, NgoaiTeActivity.class);
                startActivity(intent);
            }
        });
        btnTyGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaVangActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnLaiSuat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaVangActivity.this, LaiSuatActivity.class);
                startActivity(intent);
            }
        });
        btnTienAo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaVangActivity.this, TienAoActivity.class);
                startActivity(intent);
            }
        });

        btnSJC = (Button) findViewById(R.id.btnSJC);
        btnPNG = (Button) findViewById(R.id.btnPNG);
        btnDOJI = (Button) findViewById(R.id.btnDOJI);
        btnBTMC = (Button) findViewById(R.id.btnBTMC);
        btnPhuQuy = (Button) findViewById(R.id.btnPhuQuy);

        btnTheGioi = (Button) findViewById(R.id.btnTheGioi);
        btnTheGioi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaVangActivity.this, GiaVangTheGioiActivity.class);
                startActivity(intent);
            }
        });
    }
}
