package com.example.exchangeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TyGiaActivity extends AppCompatActivity {
    // Khoi tao cac item tai menu
    private Button btnTyGia;
    private Button btnNgoaiTe;
    private Button btnGiaVang;
    private Button btnLaiSuat;
    private Button btnTienAo;

//    // Khoi tao cac nut bam
    private Button btnCallTyGiaVietcomBank;
    private Button btnCallTyGiaArgiBank;
    private Button btnCallTyGiaTechcomBank;
    private Button btnCallTyGiaDongA;
    private Button btnCallTyVietinBank;
    private Button btnCallTySHB;
    private Button btnCallTySacomBank;
    private Button btnCallTyBIDV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ty_gia);
        getSupportActionBar().hide();
        btnTyGia = (Button) findViewById(R.id.btnTyGia);
        btnNgoaiTe = (Button) findViewById(R.id.btnNgoaiTe);
        btnGiaVang = (Button) findViewById(R.id.btnGiaVang);
        btnLaiSuat = (Button) findViewById(R.id.btnLaiSuat);
        btnTienAo = (Button) findViewById(R.id.btnTienAo);
        btnTyGia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TyGiaActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnNgoaiTe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TyGiaActivity.this, NgoaiTeActivity.class);
                startActivity(intent);
            }
        });
        btnGiaVang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TyGiaActivity.this, GiaVangActivity.class);
                startActivity(intent);
            }
        });
        btnLaiSuat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TyGiaActivity.this, LaiSuatActivity.class);
                startActivity(intent);
            }
        });
        btnTienAo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TyGiaActivity.this, TienAoActivity.class);
                startActivity(intent);
            }
        });

        // Lay gia tri cua nut bam
        btnCallTyGiaVietcomBank = (Button) findViewById(R.id.btnVCB);
        btnCallTyGiaArgiBank = (Button) findViewById(R.id.btnArgiBank);
        btnCallTyGiaTechcomBank = (Button) findViewById(R.id.btnTechcomBank);
        btnCallTyGiaDongA = (Button) findViewById(R.id.btnDongA);
        btnCallTyVietinBank = (Button) findViewById(R.id.btnVietinBank);
        btnCallTySHB = (Button) findViewById(R.id.btnSHB);
        btnCallTySacomBank = (Button) findViewById(R.id.btnSacomBank);
        btnCallTyBIDV = (Button) findViewById(R.id.btnBIDV);
    }
}
