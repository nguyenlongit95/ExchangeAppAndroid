package com.example.exchangeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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

    private TextView txtMuaTienMat1;
    private TextView txtMuaTienMat2;
    private TextView txtMuaTienMat3;
    private TextView txtMuaTienMat4;
    private TextView txtMuaTienMat5;
    private TextView txtMuaTienMat6;
    private TextView txtMuaTienMat7;
    private TextView txtMuaTienMat8;
    private TextView txtMuaTienMat9;
    private TextView txtMuaTienMat10;
    private TextView txtMuaTienMat11;

    private TextView txtMuaChuyenKhoan1;
    private TextView txtMuaChuyenKhoan2;
    private TextView txtMuaChuyenKhoan3;
    private TextView txtMuaChuyenKhoan4;
    private TextView txtMuaChuyenKhoan5;
    private TextView txtMuaChuyenKhoan6;
    private TextView txtMuaChuyenKhoan7;
    private TextView txtMuaChuyenKhoan8;
    private TextView txtMuaChuyenKhoan9;
    private TextView txtMuaChuyenKhoan10;
    private TextView txtMuaChuyenKhoan11;

    private TextView txtBanTienMat1;
    private TextView txtBanTienMat2;
    private TextView txtBanTienMat3;
    private TextView txtBanTienMat4;
    private TextView txtBanTienMat5;
    private TextView txtBanTienMat6;
    private TextView txtBanTienMat7;
    private TextView txtBanTienMat8;
    private TextView txtBanTienMat9;
    private TextView txtBanTienMat10;
    private TextView txtBanTienMat11;

    private TextView txtBanChuyenKhoan1;
    private TextView txtBanChuyenKhoan2;
    private TextView txtBanChuyenKhoan3;
    private TextView txtBanChuyenKhoan4;
    private TextView txtBanChuyenKhoan5;
    private TextView txtBanChuyenKhoan6;
    private TextView txtBanChuyenKhoan7;
    private TextView txtBanChuyenKhoan8;
    private TextView txtBanChuyenKhoan9;
    private TextView txtBanChuyenKhoan10;
    private TextView txtBanChuyenKhoan11;

    private String urlApi;
    private String bankCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ty_gia);
        getSupportActionBar().hide();

        txtMuaChuyenKhoan1 = (TextView) findViewById(R.id.txtMuaChuyenKhoan1);
        txtMuaChuyenKhoan2 = (TextView) findViewById(R.id.txtMuaChuyenKhoan2);
        txtMuaChuyenKhoan3 = (TextView) findViewById(R.id.txtMuaChuyenKhoan3);
        txtMuaChuyenKhoan4 = (TextView) findViewById(R.id.txtMuaChuyenKhoan4);
        txtMuaChuyenKhoan5 = (TextView) findViewById(R.id.txtMuaChuyenKhoan5);
        txtMuaChuyenKhoan6 = (TextView) findViewById(R.id.txtMuaChuyenKhoan6);
        txtMuaChuyenKhoan7 = (TextView) findViewById(R.id.txtMuaChuyenKhoan7);
        txtMuaChuyenKhoan8 = (TextView) findViewById(R.id.txtMuaChuyenKhoan8);
        txtMuaChuyenKhoan9 = (TextView) findViewById(R.id.txtMuaChuyenKhoan9);
        txtMuaChuyenKhoan10 = (TextView) findViewById(R.id.txtMuaChuyenKhoan10);
        txtMuaChuyenKhoan11 = (TextView) findViewById(R.id.txtMuaChuyenKhoan11);

        txtMuaTienMat1 = (TextView) findViewById(R.id.txtMuaTienMat1);
        txtMuaTienMat2 = (TextView) findViewById(R.id.txtMuaTienMat2);
        txtMuaTienMat3 = (TextView) findViewById(R.id.txtMuaTienMat3);
        txtMuaTienMat4 = (TextView) findViewById(R.id.txtMuaTienMat4);
        txtMuaTienMat5 = (TextView) findViewById(R.id.txtMuaTienMat5);
        txtMuaTienMat6 = (TextView) findViewById(R.id.txtMuaTienMat6);
        txtMuaTienMat7 = (TextView) findViewById(R.id.txtMuaTienMat7);
        txtMuaTienMat8 = (TextView) findViewById(R.id.txtMuaTienMat8);
        txtMuaTienMat9 = (TextView) findViewById(R.id.txtMuaTienMat9);
        txtMuaTienMat10 = (TextView) findViewById(R.id.txtMuaTienMat10);
        txtMuaTienMat11 = (TextView) findViewById(R.id.txtMuaTienMat11);

        txtBanTienMat1 = (TextView) findViewById(R.id.txtBanTienMat1);
        txtBanTienMat2 = (TextView) findViewById(R.id.txtBanTienMat2);
        txtBanTienMat3 = (TextView) findViewById(R.id.txtBanTienMat3);
        txtBanTienMat4 = (TextView) findViewById(R.id.txtBanTienMat4);
        txtBanTienMat5 = (TextView) findViewById(R.id.txtBanTienMat5);
        txtBanTienMat6 = (TextView) findViewById(R.id.txtBanTienMat6);
        txtBanTienMat7 = (TextView) findViewById(R.id.txtBanTienMat7);
        txtBanTienMat8 = (TextView) findViewById(R.id.txtBanTienMat8);
        txtBanTienMat9 = (TextView) findViewById(R.id.txtBanTienMat9);
        txtBanTienMat10 = (TextView) findViewById(R.id.txtBanTienMat10);
        txtBanTienMat11 = (TextView) findViewById(R.id.txtBanTienMat11);

        txtBanChuyenKhoan1 = (TextView) findViewById(R.id.txtBanChuyenKhoan1);
        txtBanChuyenKhoan2 = (TextView) findViewById(R.id.txtBanChuyenKhoan2);
        txtBanChuyenKhoan3 = (TextView) findViewById(R.id.txtBanChuyenKhoan3);
        txtBanChuyenKhoan4 = (TextView) findViewById(R.id.txtBanChuyenKhoan4);
        txtBanChuyenKhoan5 = (TextView) findViewById(R.id.txtBanChuyenKhoan5);
        txtBanChuyenKhoan6 = (TextView) findViewById(R.id.txtBanChuyenKhoan6);
        txtBanChuyenKhoan7 = (TextView) findViewById(R.id.txtBanChuyenKhoan7);
        txtBanChuyenKhoan8 = (TextView) findViewById(R.id.txtBanChuyenKhoan8);
        txtBanChuyenKhoan9 = (TextView) findViewById(R.id.txtBanChuyenKhoan9);
        txtBanChuyenKhoan10 = (TextView) findViewById(R.id.txtBanChuyenKhoan10);
        txtBanChuyenKhoan11 = (TextView) findViewById(R.id.txtBanChuyenKhoan11);

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

        Intent intent = getIntent();
        bankCode = intent.getStringExtra("bank_code");

        // Lay gia tri cua nut bam
        btnCallTyGiaVietcomBank = (Button) findViewById(R.id.btnVCB);
        btnCallTyGiaArgiBank = (Button) findViewById(R.id.btnArgiBank);
        btnCallTyGiaTechcomBank = (Button) findViewById(R.id.btnTechcomBank);
        btnCallTyGiaDongA = (Button) findViewById(R.id.btnDongA);
        btnCallTyVietinBank = (Button) findViewById(R.id.btnVietinBank);
        btnCallTySHB = (Button) findViewById(R.id.btnSHB);
        btnCallTySacomBank = (Button) findViewById(R.id.btnSacomBank);
        btnCallTyBIDV = (Button) findViewById(R.id.btnBIDV);

        CallAPi callAPI = new CallAPi();
        if (bankCode != null) {
            // Get link host API add more link before '/'
            urlApi = callAPI.urlAPI("get-exchange/" + bankCode);
            CallAPI(urlApi, bankCode);
        }

        btnCallTyGiaVietcomBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallAPi callAPI = new CallAPi();
                urlApi = callAPI.urlAPI("get-exchange/" + "vietcombank");
                CallAPI(urlApi, "vietcombank");
            }
        });
        btnCallTyGiaTechcomBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallAPi callAPI = new CallAPi();
                urlApi = callAPI.urlAPI("get-exchange/" + "techcom");
                CallAPI(urlApi, "techcom");
            }
        });
        btnCallTyGiaArgiBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallAPi callAPI = new CallAPi();
                urlApi = callAPI.urlAPI("get-exchange/" + "agribank");
                CallAPI(urlApi, "agribank");
            }
        });
        btnCallTyGiaDongA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallAPi callAPI = new CallAPi();
                urlApi = callAPI.urlAPI("get-exchange/" + "dab");
                CallAPI(urlApi, "dab");
            }
        });
        btnCallTyVietinBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallAPi callAPI = new CallAPi();
                urlApi = callAPI.urlAPI("get-exchange/" + "vietin");
                CallAPI(urlApi, "vietin");
            }
        });
        btnCallTySHB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallAPi callAPI = new CallAPi();
                urlApi = callAPI.urlAPI("get-exchange/" + "shb");
                CallAPI(urlApi, "shb");
            }
        });
        btnCallTySacomBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallAPi callAPI = new CallAPi();
                urlApi = callAPI.urlAPI("get-exchange/" + "sacombank");
                CallAPI(urlApi, "sacombank");
            }
        });
        btnCallTyBIDV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CallAPi callAPI = new CallAPi();
                urlApi = callAPI.urlAPI("get-exchange/" + "bidv");
                CallAPI(urlApi, "bidv");
            }
        });

    }

    /**
     *
     */
    public void CallAPI(final String urlApi, String bankCode) {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        // using Volley library
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, urlApi, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) { // response JSON
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject object = response.getJSONObject(i);
                        /**
                         * Fill dữ liệu text view cho label
                         * Mỗi lần sẽ xét 1 đối tượng trong mảng JSON
                         * Gán cho đối tượng tương ứng
                         */
                        int result = fillData(object);
                        if (result == 0) {
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) { // response Error
                Toast.makeText(TyGiaActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(jsonArrayRequest); // Day array vao Queue
    }

    public int fillData (JSONObject object) {
        try {
            if (object.getString("code").equals("JPY")) {
                txtMuaTienMat1.setText(object.getString("muatienmat"));
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtBanTienMat1.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muatienmat_diff") < 0) {
                    txtBanTienMat1.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanTienMat1.setText(object.getString("bantienmat"));
                if (object.getDouble("bantienmat_diff") > 0) {
                    txtBanTienMat1.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("bantienmat_diff") < 0) {
                    txtBanTienMat1.setTextColor(Color.parseColor("#ff0000"));
                }

                txtMuaChuyenKhoan1.setText(object.getString("muachuyenkhoan"));
                if (object.getDouble("muachuyenkhoan_diff") > 0) {
                    txtMuaChuyenKhoan1.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muachuyenkhoan_diff") < 0) {
                    txtMuaChuyenKhoan1.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanChuyenKhoan1.setText(object.getString("banchuyenkhoan"));
                if (object.getDouble("banchuyenkhoan_diff") > 0) {
                    txtBanChuyenKhoan1.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("banchuyenkhoan_diff") < 0) {
                    txtBanChuyenKhoan1.setTextColor(Color.parseColor("#ff0000"));
                }
            }
            if (object.getString("code").equals("SEK")) {
                txtMuaTienMat2.setText(object.getString("muatienmat"));
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtMuaTienMat2.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muatienmat_diff") < 0) {
                    txtMuaTienMat2.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanTienMat2.setText(object.getString("bantienmat"));
                if (object.getDouble("bantienmat_diff") > 0) {
                    txtBanTienMat2.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("bantienmat_diff") < 0) {
                    txtBanTienMat2.setTextColor(Color.parseColor("#ff0000"));
                }

                txtMuaChuyenKhoan2.setText(object.getString("muachuyenkhoan"));
                if (object.getDouble("muachuyenkhoan_diff") > 0) {
                    txtMuaChuyenKhoan2.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muachuyenkhoan_diff") < 0) {
                    txtMuaChuyenKhoan2.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanChuyenKhoan2.setText(object.getString("banchuyenkhoan"));
                if (object.getDouble("banchuyenkhoan_diff") > 0) {
                    txtBanChuyenKhoan2.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("banchuyenkhoan_diff") < 0) {
                    txtBanChuyenKhoan2.setTextColor(Color.parseColor("#ff0000"));
                }
            }
            if (object.getString("code").equals("CHF")) {
                txtMuaTienMat3.setText(object.getString("muatienmat"));
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtMuaTienMat3.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muatienmat_diff") < 0) {
                    txtMuaTienMat3.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanTienMat3.setText(object.getString("bantienmat"));
                if (object.getDouble("bantienmat_diff") > 0) {
                    txtBanTienMat3.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("bantienmat_diff") < 0) {
                    txtBanTienMat3.setTextColor(Color.parseColor("#ff0000"));
                }

                txtMuaChuyenKhoan3.setText(object.getString("muachuyenkhoan"));
                if (object.getDouble("muachuyenkhoan_diff") > 0) {
                    txtMuaChuyenKhoan3.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muachuyenkhoan_diff") < 0) {
                    txtMuaChuyenKhoan3.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanChuyenKhoan3.setText(object.getString("banchuyenkhoan"));
                if (object.getDouble("banchuyenkhoan_diff") > 0) {
                    txtBanChuyenKhoan3.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("banchuyenkhoan_diff") < 0) {
                    txtBanChuyenKhoan3.setTextColor(Color.parseColor("#ff0000"));
                }
            }
            if (object.getString("code").equals("AUD")) {
                txtMuaTienMat4.setText(object.getString("muatienmat"));
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtMuaTienMat4.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muatienmat_diff") < 0) {
                    txtMuaTienMat4.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanTienMat4.setText(object.getString("bantienmat"));
                if (object.getDouble("bantienmat_diff") > 0) {
                    txtBanTienMat4.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("bantienmat_diff") < 0) {
                    txtBanTienMat4.setTextColor(Color.parseColor("#ff0000"));
                }

                txtMuaChuyenKhoan4.setText(object.getString("muachuyenkhoan"));
                if (object.getDouble("muachuyenkhoan_diff") > 0) {
                    txtMuaChuyenKhoan4.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muachuyenkhoan_diff") < 0) {
                    txtMuaChuyenKhoan4.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanChuyenKhoan4.setText(object.getString("banchuyenkhoan"));
                if (object.getDouble("banchuyenkhoan_diff") > 0) {
                    txtBanChuyenKhoan4.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("banchuyenkhoan_diff") < 0) {
                    txtBanChuyenKhoan4.setTextColor(Color.parseColor("#ff0000"));
                }
            }
            if (object.getString("code").equals("GBP")) {
                txtMuaTienMat5.setText(object.getString("muatienmat"));
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtMuaTienMat5.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muatienmat_diff") < 0) {
                    txtMuaTienMat5.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanTienMat5.setText(object.getString("bantienmat"));
                if (object.getDouble("bantienmat_diff") > 0) {
                    txtBanTienMat5.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("bantienmat_diff") < 0) {
                    txtBanTienMat5.setTextColor(Color.parseColor("#ff0000"));
                }

                txtMuaChuyenKhoan5.setText(object.getString("muachuyenkhoan"));
                if (object.getDouble("muachuyenkhoan_diff") > 0) {
                    txtMuaChuyenKhoan5.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muachuyenkhoan_diff") < 0) {
                    txtMuaChuyenKhoan5.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanChuyenKhoan5.setText(object.getString("banchuyenkhoan"));
                if (object.getDouble("banchuyenkhoan_diff") > 0) {
                    txtBanChuyenKhoan5.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("banchuyenkhoan_diff") < 0) {
                    txtBanChuyenKhoan5.setTextColor(Color.parseColor("#ff0000"));
                }
            }
            if (object.getString("code").equals("HKD")) {
                txtMuaTienMat6.setText(object.getString("muatienmat"));
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtMuaTienMat6.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muatienmat_diff") < 0) {
                    txtMuaTienMat6.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanTienMat6.setText(object.getString("bantienmat"));
                if (object.getDouble("bantienmat_diff") > 0) {
                    txtBanTienMat6.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("bantienmat_diff") < 0) {
                    txtBanTienMat6.setTextColor(Color.parseColor("#ff0000"));
                }

                txtMuaChuyenKhoan6.setText(object.getString("muachuyenkhoan"));
                if (object.getDouble("muachuyenkhoan_diff") > 0) {
                    txtMuaChuyenKhoan6.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muachuyenkhoandiff") < 0) {
                    txtMuaChuyenKhoan6.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanChuyenKhoan6.setText(object.getString("banchuyenkhoan"));
                if (object.getDouble("banchuyenkhoan_diff") > 0) {
                    txtBanChuyenKhoan6.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("banchuyenkhoan_diff") < 0) {
                    txtBanChuyenKhoan6.setTextColor(Color.parseColor("#ff0000"));
                }
            }
            if (object.getString("code").equals("SGD")) {
                txtMuaTienMat7.setText(object.getString("muatienmat"));
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtMuaTienMat7.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muatienmat_diff") < 0) {
                    txtMuaTienMat7.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanTienMat7.setText(object.getString("bantienmat"));
                if (object.getDouble("bantienmat_diff") > 0) {
                    txtBanTienMat7.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("bantienmat_diff") < 0) {
                    txtBanTienMat7.setTextColor(Color.parseColor("#ff0000"));
                }

                txtMuaChuyenKhoan7.setText(object.getString("muachuyenkhoan"));
                if (object.getDouble("muachuyenkhoan_diff") > 0) {
                    txtMuaChuyenKhoan7.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muachuyenkhoan_diff") < 0) {
                    txtMuaChuyenKhoan7.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanChuyenKhoan7.setText(object.getString("banchuyenkhoan"));
                if (object.getDouble("banchuyenkhoan_diff") > 0) {
                    txtBanChuyenKhoan7.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("banchuyenkhoan_diff") < 0) {
                    txtBanChuyenKhoan7.setTextColor(Color.parseColor("#ff0000"));
                }
            }
            if (object.getString("code").equals("THB")) {
                txtMuaTienMat8.setText(object.getString("muatienmat"));
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtMuaTienMat8.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muatienmat_diff") < 0) {
                    txtMuaTienMat8.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanTienMat8.setText(object.getString("bantienmat"));
                if (object.getDouble("bantienmat_diff") > 0) {
                    txtBanTienMat8.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("bantienmat_diff") < 0) {
                    txtBanTienMat8.setTextColor(Color.parseColor("#ff0000"));
                }

                txtMuaChuyenKhoan8.setText(object.getString("muachuyenkhoan"));
                if (object.getDouble("muachuyenkhoan_diff") > 0) {
                    txtMuaChuyenKhoan8.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muachuyenkhoan_diff") < 0) {
                    txtMuaChuyenKhoan8.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanChuyenKhoan8.setText(object.getString("banchuyenkhoan"));
                if (object.getDouble("banchuyenkhoan_diff") > 0) {
                    txtBanChuyenKhoan8.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("banchuyenkhoan_diff") < 0) {
                    txtBanChuyenKhoan8.setTextColor(Color.parseColor("#ff0000"));
                }
            }
            if (object.getString("code").equals("CAD")) {
                txtMuaTienMat9.setText(object.getString("muatienmat"));
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtMuaTienMat9.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muatienmat_diff") < 0) {
                    txtMuaTienMat9.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanTienMat9.setText(object.getString("bantienmat"));
                if (object.getDouble("bantienmat_diff") > 0) {
                    txtBanTienMat9.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("bantienmat_diff") < 0) {
                    txtBanTienMat9.setTextColor(Color.parseColor("#ff0000"));
                }

                txtMuaChuyenKhoan9.setText(object.getString("muachuyenkhoan"));
                if (object.getDouble("muachuyenkhoan_diff") > 0) {
                    txtMuaChuyenKhoan9.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muachuyenkhoan_diff") < 0) {
                    txtMuaChuyenKhoan9.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanChuyenKhoan9.setText(object.getString("banchuyenkhoan"));
                if (object.getDouble("banchuyenkhoan_diff") > 0) {
                    txtBanChuyenKhoan9.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("banchuyenkhoan_diff") < 0) {
                    txtBanChuyenKhoan9.setTextColor(Color.parseColor("#ff0000"));
                }
            }
            if (object.getString("code").equals("KRW")) {
                txtMuaTienMat10.setText(object.getString("muatienmat"));
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtMuaTienMat10.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muatienmat_diff") < 0) {
                    txtMuaTienMat10.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanTienMat10.setText(object.getString("bantienmat"));
                if (object.getDouble("bantienmat_diff") > 0) {
                    txtBanTienMat10.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("bantienmat_diff") < 0) {
                    txtBanTienMat10.setTextColor(Color.parseColor("#ff0000"));
                }

                txtMuaChuyenKhoan10.setText(object.getString("muachuyenkhoan"));
                if (object.getDouble("muachuyenkhoan_diff") > 0) {
                    txtMuaChuyenKhoan10.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muachuyenkhoan_diff") < 0) {
                    txtMuaChuyenKhoan10.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanChuyenKhoan10.setText(object.getString("banchuyenkhoan"));
                if (object.getDouble("banchuyenkhoan_diff") > 0) {
                    txtBanChuyenKhoan10.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("banchuyenkhoan_diff") < 0) {
                    txtBanChuyenKhoan10.setTextColor(Color.parseColor("#ff0000"));
                }
            }
            if (object.getString("code").equals("RUB")) {
                txtMuaTienMat11.setText(object.getString("muatienmat"));
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtMuaTienMat11.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muatienmat_diff") < 0) {
                    txtMuaTienMat11.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanTienMat11.setText(object.getString("bantienmat"));
                if (object.getDouble("bantienmat_diff") > 0) {
                    txtBanTienMat11.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("bantienmat_diff") < 0) {
                    txtBanTienMat11.setTextColor(Color.parseColor("#ff0000"));
                }

                txtMuaChuyenKhoan11.setText(object.getString("muachuyenkhoan"));
                if (object.getDouble("muachuyenkhoan_diff") > 0) {
                    txtMuaChuyenKhoan11.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("muachuyenkhoan_diff") < 0) {
                    txtMuaChuyenKhoan11.setTextColor(Color.parseColor("#ff0000"));
                }

                txtBanChuyenKhoan11.setText(object.getString("banchuyenkhoan"));
                if (object.getDouble("banchuyenkhoan_diff") > 0) {
                    txtBanChuyenKhoan11.setTextColor(Color.parseColor("green"));
                }
                if (object.getDouble("banchuyenkhoan_diff") < 0) {
                    txtBanChuyenKhoan11.setTextColor(Color.parseColor("#ff0000"));
                }
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
