package com.example.exchangeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

public class MainActivity extends AppCompatActivity {

    // Khoi tao cac item tai menu
    private Button btnTyGia;
    private Button btnNgoaiTe;
    private Button btnGiaVang;
    private Button btnLaiSuat;
    private Button btnTienAo;

    // Khoi tao cac nut bam
    private Button btnCallTyGiaVietcomBank;
    private Button btnCallTyGiaArgiBank;
    private Button btnCallTyGiaTechcomBank;
    private Button btnCallTyGiaDongA;
    private Button btnCallTyVietinBank;
    private Button btnCallTySHB;
    private Button btnCallTySacomBank;
    private Button btnCallTyBIDV;

    private Button btnMuaTienMat;
    private Button btnMuaChuyenKhoan;
    private Button btnBanTienMat;
    private Button btnBanChuyenKhoan;

    private String urlApi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        CallAPi callAPI = new CallAPi();
        // Get link host API add more link before '/'
        this.urlApi = callAPI.urlAPI("get-exchange");

        // Lay gia tri cua nut bam tai menu
        btnTyGia = findViewById(R.id.btnTyGia);
        btnNgoaiTe = findViewById(R.id.btnNgoaiTe);
        btnGiaVang = findViewById(R.id.btnGiaVang);
        btnLaiSuat = findViewById(R.id.btnLaiSuat);
        btnTienAo = findViewById(R.id.btnTienAo);

        btnNgoaiTe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NgoaiTeActivity.class);
                startActivity(intent);
            }
        });
        btnGiaVang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GiaVangActivity.class);
                startActivity(intent);
            }
        });
        btnLaiSuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LaiSuatActivity.class);
                startActivity(intent);
            }
        });
        btnTienAo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TienAoActivity.class);
                startActivity(intent);
            }
        });

        // Lay gia tri cua nut bam
        btnCallTyGiaVietcomBank = findViewById(R.id.btnVCB);
        btnCallTyGiaArgiBank = findViewById(R.id.btnArgiBank);
        btnCallTyGiaTechcomBank = findViewById(R.id.btnTechcomBank);
        btnCallTyGiaDongA = findViewById(R.id.btnDongA);
        btnCallTyVietinBank = findViewById(R.id.btnVietinBank);
        btnCallTySHB = findViewById(R.id.btnSHB);
        btnCallTySacomBank = findViewById(R.id.btnSacomBank);
        btnCallTyBIDV = findViewById(R.id.btnBIDV);

        btnCallTyGiaVietcomBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TyGiaActivity.class);
                startActivity(intent);
            }
        });

        // Call API and get JSON data
        this.CallAPi();
    }

    /**
     * Function call API
     *
     * @Param: String url API
     * @return String Json data
     */
    public void CallAPi() {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        // using Volley library
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, this.urlApi, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) { // response JSON
                Toast.makeText(MainActivity.this, response.toString(), Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) { // response Error
                Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(jsonArrayRequest); // Day array vao Queue
    }

}
