package com.example.exchangeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TienAoActivity extends AppCompatActivity {

    // Khoi tao cac item tai menu
    private Button btnTyGia;
    private Button btnNgoaiTe;
    private Button btnGiaVang;
    private Button btnLaiSuat;
    private Button btnTienAo;

    private Button btnBitcoin;
    private Button btnLiteCoin;
    private Button btnEthereum;
    private Button btnCardano;
    private Button btnXRP;
    private Button btnTRON;
    private Button btnTether;
    private Button btnDASH;
    private Button btnBitcoinCash;
    private Button btnIOTA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tien_ao);
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
                Intent intent = new Intent(TienAoActivity.this, NgoaiTeActivity.class);
                startActivity(intent);
            }
        });
        btnGiaVang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoActivity.this, GiaVangActivity.class);
                startActivity(intent);
            }
        });
        btnLaiSuat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoActivity.this, LaiSuatActivity.class);
                startActivity(intent);
            }
        });
        btnTyGia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoActivity.this, TyGiaActivity.class);
                startActivity(intent);
            }
        });

        btnBitcoin = (Button) findViewById(R.id.btnBitcoin);
        btnLiteCoin = (Button) findViewById(R.id.btnLiteCoin);
        btnEthereum = (Button) findViewById(R.id.btnEthereum);
        btnCardano = (Button) findViewById(R.id.btnCardano);
        btnXRP = (Button) findViewById(R.id.btnXRP);
        btnTRON = (Button) findViewById(R.id.btnTRON);
        btnTether = (Button) findViewById(R.id.btnTether);
        btnDASH = (Button) findViewById(R.id.btnDASH);
        btnBitcoinCash = (Button) findViewById(R.id.btnBitcoinCash);
        btnIOTA = (Button) findViewById(R.id.btnIOTA);

        btnBitcoin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoActivity.this, TienAoDetailActivity.class);
                startActivity(intent);
            }
        });
        btnLiteCoin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoActivity.this, TienAoDetailActivity.class);
                startActivity(intent);
            }
        });
        btnEthereum.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoActivity.this, TienAoDetailActivity.class);
                startActivity(intent);
            }
        });
        btnCardano.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoActivity.this, TienAoDetailActivity.class);
                startActivity(intent);
            }
        });
        btnXRP.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoActivity.this, TienAoDetailActivity.class);
                startActivity(intent);
            }
        });
        btnTRON.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoActivity.this, TienAoDetailActivity.class);
                startActivity(intent);
            }
        });
        btnTether.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoActivity.this, TienAoDetailActivity.class);
                startActivity(intent);
            }
        });
        btnDASH.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoActivity.this, TienAoDetailActivity.class);
                startActivity(intent);
            }
        });
        btnBitcoinCash.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoActivity.this, TienAoDetailActivity.class);
                startActivity(intent);
            }
        });
        btnIOTA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoActivity.this, TienAoDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}
