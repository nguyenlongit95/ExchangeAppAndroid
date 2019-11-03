package com.example.exchangeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class GiaVangTheGioiActivity extends AppCompatActivity {
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
    private Button btnXangDauTG;
    private WebView iframeKitco;
    private String htmlKitco = "<iframe style=\"height: 650px; width: 100%;\" id=\"tradingview_5b9f7\" src=\"https://s.tradingview.com/widgetembed/?frameElementId=tradingview_5b9f7&amp;symbol=FX_IDC%3AXAUUSD&amp;interval=1&amp;symboledit=1&amp;saveimage=1&amp;toolbarbg=f1f3f6&amp;details=1&amp;studies=%5B%5D&amp;hideideas=1&amp;theme=White&amp;style=1&amp;timezone=Asia%2FBangkok&amp;studies_overrides=%7B%7D&amp;overrides=%7B%7D&amp;enabled_features=%5B%5D&amp;disabled_features=%5B%5D&amp;locale=vi_VN&amp;referral_id=1713&amp;utm_source=tygia.vn&amp;utm_medium=widget&amp;utm_campaign=chart&amp;utm_term=FX_IDC%3AXAUUSD\" frameborder=\"0\" allowtransparency=\"true\" scrolling=\"no\" allowfullscreen=\"\"></iframe>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gia_vang_the_gioi);
        getSupportActionBar().hide();
        // Lay gia tri cua nut bam tai menu
        btnTyGia = (Button) findViewById(R.id.btnTyGia);
        btnNgoaiTe = (Button) findViewById(R.id.btnNgoaiTe);
        btnGiaVang = (Button) findViewById(R.id.btnGiaVang);
        btnLaiSuat = (Button) findViewById(R.id.btnLaiSuat);
        btnTienAo = (Button) findViewById(R.id.btnTienAo);
        btnXangDauTG = (Button) findViewById(R.id.btnXangDauTG);
        btnXangDauTG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaVangTheGioiActivity.this, XangDauActivity.class);
                startActivity(intent);
            }
        });
        btnNgoaiTe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaVangTheGioiActivity.this, NgoaiTeActivity.class);
                startActivity(intent);
            }
        });
        btnTyGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaVangTheGioiActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnLaiSuat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaVangTheGioiActivity.this, LaiSuatActivity.class);
                startActivity(intent);
            }
        });
        btnTienAo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GiaVangTheGioiActivity.this, TienAoActivity.class);
                startActivity(intent);
            }
        });

        btnSJC = (Button) findViewById(R.id.btnSJC);
        btnPNG = (Button) findViewById(R.id.btnPNG);
        btnDOJI = (Button) findViewById(R.id.btnDOJI);
        btnBTMC = (Button) findViewById(R.id.btnBTMC);
        btnPhuQuy = (Button) findViewById(R.id.btnPhuQuy);
        btnTheGioi = (Button) findViewById(R.id.btnTheGioi);

        iframeKitco = (WebView) findViewById(R.id.iframeKitco);
        iframeKitco.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        iframeKitco.getSettings().setJavaScriptEnabled(true);
        iframeKitco.getSettings().setAllowContentAccess(true);
        iframeKitco.loadData(this.htmlKitco,"text/html","utf-8");
    }
}
