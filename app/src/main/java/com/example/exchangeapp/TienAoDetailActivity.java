package com.example.exchangeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class TienAoDetailActivity extends AppCompatActivity {

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

    private WebView iframeTienAo;
    private String html = "<iframe style=\"height:250px; width: 100%;\" id=\"tradingview_b92c2\" src=\"https://s.tradingview.com/widgetembed/?frameElementId=tradingview_b92c2&amp;symbol=BTCUSD&amp;interval=1&amp;symboledit=0&amp;saveimage=1&amp;toolbarbg=f1f3f6&amp;details=1&amp;studies=%5B%5D&amp;hideideas=1&amp;theme=White&amp;style=3&amp;timezone=Asia%2FBangkok&amp;studies_overrides=%7B%7D&amp;overrides=%7B%7D&amp;enabled_features=%5B%5D&amp;disabled_features=%5B%5D&amp;locale=en_US&amp;referral_id=1713&amp;utm_source=tygia.vn&amp;utm_medium=widget&amp;utm_campaign=chart&amp;utm_term=ETHUSD\" frameborder=\"0\" allowtransparency=\"true\" scrolling=\"no\" allowfullscreen=\"\"></iframe>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tien_ao_detail);
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
                Intent intent = new Intent(TienAoDetailActivity.this, NgoaiTeActivity.class);
                startActivity(intent);
            }
        });
        btnGiaVang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoDetailActivity.this, GiaVangActivity.class);
                startActivity(intent);
            }
        });
        btnLaiSuat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoDetailActivity.this, LaiSuatActivity.class);
                startActivity(intent);
            }
        });
        btnTyGia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnTienAo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienAoDetailActivity.this, TienAoActivity.class);
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

        iframeTienAo = (WebView) findViewById(R.id.iframeTienAo);
        iframeTienAo.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        iframeTienAo.getSettings().setJavaScriptEnabled(true);
        iframeTienAo.getSettings().setAllowContentAccess(true);
        iframeTienAo.loadData(this.html,"text/html","utf-8");
    }
}
