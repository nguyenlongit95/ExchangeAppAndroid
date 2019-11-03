package com.example.exchangeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class XangDauActivity extends AppCompatActivity {

    // Khoi tao cac item tai menu
    private Button btnTyGia;
    private Button btnNgoaiTe;
    private Button btnGiaVang;
    private Button btnLaiSuat;
    private Button btnTienAo;
    private Button btnXangDau;

    private String htmlBrent = "<iframe style=\"height: 450px; width: 100%;\" id=\"tradingview_cbf8a\" src=\"https://s.tradingview.com/widgetembed/?frameElementId=tradingview_cbf8a&amp;symbol=TVC%3AUKOIL&amp;interval=1&amp;symboledit=1&amp;saveimage=1&amp;toolbarbg=f1f3f6&amp;studies=%5B%5D&amp;hideideas=1&amp;theme=White&amp;style=1&amp;timezone=Asia%2FBangkok&amp;studies_overrides=%7B%7D&amp;overrides=%7B%7D&amp;enabled_features=%5B%5D&amp;disabled_features=%5B%5D&amp;locale=vi_VN&amp;referral_id=1713&amp;utm_source=tygia.vn&amp;utm_medium=widget&amp;utm_campaign=chart&amp;utm_term=TVC%3AUKOIL\" frameborder=\"0\" allowtransparency=\"true\" scrolling=\"no\" allowfullscreen=\"\"></iframe>";
    private String htmlUSOIL = "<iframe style=\"height: 450px; width: 100%;\" id=\"tradingview_9a8db\" src=\"https://s.tradingview.com/widgetembed/?frameElementId=tradingview_9a8db&amp;symbol=TVC%3AUSOIL&amp;interval=1&amp;symboledit=1&amp;saveimage=1&amp;toolbarbg=f1f3f6&amp;studies=%5B%5D&amp;hideideas=1&amp;theme=White&amp;style=1&amp;timezone=Asia%2FBangkok&amp;studies_overrides=%7B%7D&amp;overrides=%7B%7D&amp;enabled_features=%5B%5D&amp;disabled_features=%5B%5D&amp;locale=vi&amp;referral_id=1713&amp;utm_source=tygia.vn&amp;utm_medium=widget&amp;utm_campaign=chart&amp;utm_term=TVC%3AUSOIL\" frameborder=\"0\" allowtransparency=\"true\" scrolling=\"no\" allowfullscreen=\"\"></iframe>";

    private WebView iframeBrent;
    private WebView iframeUSOIL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xang_dau);
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
                Intent intent = new Intent(XangDauActivity.this, NgoaiTeActivity.class);
                startActivity(intent);
            }
        });
        btnGiaVang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XangDauActivity.this, GiaVangActivity.class);
                startActivity(intent);
            }
        });
        btnLaiSuat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XangDauActivity.this, LaiSuatActivity.class);
                startActivity(intent);
            }
        });
        btnTyGia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XangDauActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnTienAo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(XangDauActivity.this, TienAoActivity.class);
                startActivity(intent);
            }
        });

        iframeBrent = (WebView) findViewById(R.id.iframeBrent);
        iframeBrent.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        iframeBrent.getSettings().setJavaScriptEnabled(true);
        iframeBrent.getSettings().setAllowContentAccess(true);
        iframeBrent.loadData(this.htmlBrent,"text/html","utf-8");

        iframeUSOIL = (WebView) findViewById(R.id.iframeUSOIL);
        iframeUSOIL.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        iframeUSOIL.getSettings().setJavaScriptEnabled(true);
        iframeUSOIL.getSettings().setAllowContentAccess(true);
        iframeUSOIL.loadData(this.htmlUSOIL,"text/html","utf-8");
    }
}
