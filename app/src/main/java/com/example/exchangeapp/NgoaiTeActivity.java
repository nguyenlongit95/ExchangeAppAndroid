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

    private TextView txtMuaChuyenKhoan1, txtMuaChuyenKhoan2, txtMuaChuyenKhoan3, txtMuaChuyenKhoan4, txtMuaChuyenKhoan5,
        txtMuaChuyenKhoan6, txtMuaChuyenKhoan7, txtMuaChuyenKhoan8, txtMuaChuyenKhoan9, txtMuaChuyenKhoan10, txtMuaChuyenKhoan11;

    private TextView txtBanTienMat1, txtBanTienMat2, txtBanTienMat3, txtBanTienMat4, txtBanTienMat5, txtBanTienMat6,
    txtBanTienMat7, txtBanTienMat8, txtBanTienMat9, txtBanTienMat10, txtBanTienMat11;

    private TextView txtBanChuyenKhoan1, txtBanChuyenKhoan2, txtBanChuyenKhoan3, txtBanChuyenKhoan4, txtBanChuyenKhoan5,
            txtBanChuyenKhoan6, txtBanChuyenKhoan7, txtBanChuyenKhoan8, txtBanChuyenKhoan9, txtBanChuyenKhoan10, txtBanChuyenKhoan11;

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
         * Param string link
         * return JSON data
         */
        CallAPi callAPI = new CallAPi();

        /**
         * init button currency
         * Set event button here
         */
        btnUSD = (Button) findViewById(R.id.btnUSD);
        btnEUR = (Button) findViewById(R.id.btnEUR);
        btnJPY = (Button) findViewById(R.id.btnJPY);
        btnKRW = (Button) findViewById(R.id.btnKRW);
        btnCNY = (Button) findViewById(R.id.btnCNY);
        btnGDP = (Button) findViewById(R.id.btnGDP);
        btnSGD = (Button) findViewById(R.id.btnSGD);
        btnCAD = (Button) findViewById(R.id.btnCAD);
        btnTHB = (Button) findViewById(R.id.btnTHB);
        btnRUB = (Button) findViewById(R.id.btnRUB);
    }
}
