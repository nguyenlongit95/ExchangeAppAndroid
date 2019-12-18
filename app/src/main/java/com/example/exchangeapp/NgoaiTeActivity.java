package com.example.exchangeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NgoaiTeActivity extends AppCompatActivity {

    // Khoi tao cac item tai menu
    private Button btnTyGia;
    private Button btnNgoaiTe;
    private Button btnGiaVang;
    private Button btnLaiSuat;
    private Button btnTienAo;

    private Button btnUSD, btnEUR, btnJPY, btnKRW, btnCNY, btnGDP, btnSGD, btnCAD, btnTHB, btnRUB;
    private TextView txtMuaTienMat1, txtMuaTienMat2, txtMuaTienMat3, txtMuaTienMat4, txtMuaTienMat5,
        txtMuaTienMat6, txtMuaTienMat7, txtMuaTienMat8, txtMuaTienMat9, txtMuaTienMat10, txtMuaTienMat11;
    private TextView txtMuaChuyenKhoan1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngoai_te);
        getSupportActionBar().hide();
        // Lay gia tri cua nut bam tai menu
        btnTyGia = (Button) findViewById(R.id.btnTyGia);
        btnNgoaiTe = (Button) findViewById(R.id.btnNgoaiTe);
        btnGiaVang = (Button) findViewById(R.id.btnGiaVang);
        btnLaiSuat = (Button) findViewById(R.id.btnLaiSuat);
        btnTienAo = (Button) findViewById(R.id.btnTienAo);

        btnTyGia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NgoaiTeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnGiaVang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NgoaiTeActivity.this, GiaVangActivity.class);
                startActivity(intent);
            }
        });
        btnLaiSuat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NgoaiTeActivity.this, LaiSuatActivity.class);
                startActivity(intent);
            }
        });
        btnTienAo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NgoaiTeActivity.this, TienAoActivity.class);
                startActivity(intent);
            }
        });

        /**
         * Call API this here
         */
        CallAPi callAPI = new CallAPi();

        /**
         * init button currency
         */

    }
}
