package com.example.exchangeapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<TyGia> arrayTyGia;
    TyGiaAdapter adapter;
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
    // All txt
    private TextView txtVietcombank2;
    private TextView txtVietcombank3;
    private TextView txtVietcombank4;
    private TextView txtVietcombank5;
    private TextView txtVietcombank6;
    private TextView txtVietcombank7;
    private TextView txtVietcombank8;
    private TextView txtVietcombank9;
    private TextView txtVietcombank10;
    private TextView txtVietcombank11;
    private TextView txtVietcombank12;
    private TextView txtTechcomBank1;
    private TextView txtTechcomBank2;
    private TextView txtTechcomBank3;
    private TextView txtTechcomBank4;
    private TextView txtTechcomBank5;
    private TextView txtTechcomBank6;
    private TextView txtTechcomBank7;
    private TextView txtTechcomBank8;
    private TextView txtTechcomBank9;
    private TextView txtTechcomBank10;
    private TextView txtTechcomBank11;
    private TextView txtTechcomBank12;
    private TextView txtTPB1;
    private TextView txtTPB2;
    private TextView txtTPB3;
    private TextView txtTPB4;
    private TextView txtTPB5;
    private TextView txtTPB6;
    private TextView txtTPB7;
    private TextView txtTPB8;
    private TextView txtTPB9;
    private TextView txtTPB10;
    private TextView txtTPB11;
    private TextView txtTPB12;
    private TextView txtDongA1;
    private TextView txtDongA2;
    private TextView txtDongA3;
    private TextView txtDongA4;
    private TextView txtDongA5;
    private TextView txtDongA6;
    private TextView txtDongA7;
    private TextView txtDongA8;
    private TextView txtDongA9;
    private TextView txtDongA10;
    private TextView txtDongA11;
    private TextView txtDongA12;
    private TextView txtVietinBank1;
    private TextView txtVietinBank2;
    private TextView txtVietinBank3;
    private TextView txtVietinBank4;
    private TextView txtVietinBank5;
    private TextView txtVietinBank6;
    private TextView txtVietinBank7;
    private TextView txtVietinBank8;
    private TextView txtVietinBank9;
    private TextView txtVietinBank10;
    private TextView txtVietinBank11;
    private TextView txtVietinBank12;
    private TextView txtSHB1;
    private TextView txtSHB2;
    private TextView txtSHB3;
    private TextView txtSHB4;
    private TextView txtSHB5;
    private TextView txtSHB6;
    private TextView txtSHB7;
    private TextView txtSHB8;
    private TextView txtSHB9;
    private TextView txtSHB10;
    private TextView txtSHB11;
    private TextView txtSHB12;
    private TextView txtSacomBank1;
    private TextView txtSacomBank2;
    private TextView txtSacomBank3;
    private TextView txtSacomBank4;
    private TextView txtSacomBank5;
    private TextView txtSacomBank6;
    private TextView txtSacomBank7;
    private TextView txtSacomBank8;
    private TextView txtSacomBank9;
    private TextView txtSacomBank10;
    private TextView txtSacomBank11;
    private TextView txtSacomBank12;
    private TextView txtBIDV1;
    private TextView txtBIDV2;
    private TextView txtBIDV3;
    private TextView txtBIDV4;
    private TextView txtBIDV5;
    private TextView txtBIDV6;
    private TextView txtBIDV7;
    private TextView txtBIDV8;
    private TextView txtBIDV9;
    private TextView txtBIDV10;
    private TextView txtBIDV11;
    private TextView txtBIDV12;
    private String urlApi;
    private TableLayout contentLayoutMain;
    private TextView txtVietcombank1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        CallAPi callAPI = new CallAPi();
        // Get link host API add more link before '/'
        this.urlApi = callAPI.urlAPI("get-exchange");
        arrayTyGia = new ArrayList<TyGia>();

        adapter = new TyGiaAdapter(this, R.layout.activity_main, arrayTyGia);
        contentLayoutMain = findViewById(R.id.contentLayoutMain);

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

        /**
         * Xét textview tương ứng
         */
        txtTechcomBank1 = findViewById(R.id.txtTechcomBank1);
        txtTechcomBank2 = findViewById(R.id.txtTechcomBank2);
        txtTechcomBank3 = findViewById(R.id.txtTechcomBank3);
        txtTechcomBank4 = findViewById(R.id.txtTechcomBank4);
        txtTechcomBank5 = findViewById(R.id.txtTechcomBank5);
        txtTechcomBank6 = findViewById(R.id.txtTechcomBank6);
        txtTechcomBank7 = findViewById(R.id.txtTechcomBank7);
        txtTechcomBank8 = findViewById(R.id.txtTechcomBank8);
        txtTechcomBank9 = findViewById(R.id.txtTechcomBank9);
        txtTechcomBank10 = findViewById(R.id.txtTechcomBank10);
        txtTechcomBank11 = findViewById(R.id.txtTechcomBank11);
        txtTechcomBank12 = findViewById(R.id.txtTechcomBank12);

        // VietcomBank
        txtVietcombank1 = findViewById(R.id.txtVietcomBank1);
        txtVietcombank2 = findViewById(R.id.txtVietcomBank2);
        txtVietcombank3 = findViewById(R.id.txtVietcomBank3);
        txtVietcombank4 = findViewById(R.id.txtVietcomBank4);
        txtVietcombank5 = findViewById(R.id.txtVietcomBank5);
        txtVietcombank6 = findViewById(R.id.txtVietcomBank6);
        txtVietcombank7 = findViewById(R.id.txtVietcomBank7);
        txtVietcombank8 = findViewById(R.id.txtVietcomBank8);
        txtVietcombank9 = findViewById(R.id.txtVietcomBank9);
        txtVietcombank10 = findViewById(R.id.txtVietcomBank10);
        txtVietcombank11 = findViewById(R.id.txtVietcomBank11);
        txtVietcombank12 = findViewById(R.id.txtVietcomBank12);

        // TPB
        txtTPB1 = findViewById(R.id.txtTPB1);
        txtTPB2 = findViewById(R.id.txtTPB2);
        txtTPB3 = findViewById(R.id.txtTPB3);
        txtTPB4 = findViewById(R.id.txtTPB4);
        txtTPB5 = findViewById(R.id.txtTPB5);
        txtTPB6 = findViewById(R.id.txtTPB6);
        txtTPB7 = findViewById(R.id.txtTPB7);
        txtTPB8 = findViewById(R.id.txtTPB8);
        txtTPB9 = findViewById(R.id.txtTPB9);
        txtTPB10 = findViewById(R.id.txtTPB10);
        txtTPB11 = findViewById(R.id.txtTPB11);
        txtTPB12 = findViewById(R.id.txtTPB12);

        // DongABank
        txtDongA1 = findViewById(R.id.txtDongA1);
        txtDongA2 = findViewById(R.id.txtDongA2);
        txtDongA3 = findViewById(R.id.txtDongA3);
        txtDongA4 = findViewById(R.id.txtDongA4);
        txtDongA5 = findViewById(R.id.txtDongA5);
        txtDongA6 = findViewById(R.id.txtDongA6);
        txtDongA7 = findViewById(R.id.txtDongA7);
        txtDongA8 = findViewById(R.id.txtDongA8);
        txtDongA9 = findViewById(R.id.txtDongA9);
        txtDongA10 = findViewById(R.id.txtDongA10);
        txtDongA11 = findViewById(R.id.txtDongA11);
        txtDongA12 = findViewById(R.id.txtDongA12);

        // VietinBank
        txtVietinBank1 = findViewById(R.id.txtVietinBank1);
        txtVietinBank2 = findViewById(R.id.txtVietinBank2);
        txtVietinBank3 = findViewById(R.id.txtVietinBank3);
        txtVietinBank4 = findViewById(R.id.txtVietinBank4);
        txtVietinBank5 = findViewById(R.id.txtVietinBank5);
        txtVietinBank6 = findViewById(R.id.txtVietinBank6);
        txtVietinBank7 = findViewById(R.id.txtVietinBank7);
        txtVietinBank8 = findViewById(R.id.txtVietinBank8);
        txtVietinBank9 = findViewById(R.id.txtVietinBank9);
        txtVietinBank10 = findViewById(R.id.txtVietinBank10);
        txtVietinBank11 = findViewById(R.id.txtVietinBank11);
        txtVietinBank12 = findViewById(R.id.txtVietinBank12);

        // SHB
        txtSHB1 = findViewById(R.id.txtSHB1);
        txtSHB2 = findViewById(R.id.txtSHB2);
        txtSHB3 = findViewById(R.id.txtSHB3);
        txtSHB4 = findViewById(R.id.txtSHB4);
        txtSHB5 = findViewById(R.id.txtSHB5);
        txtSHB6 = findViewById(R.id.txtSHB6);
        txtSHB7 = findViewById(R.id.txtSHB7);
        txtSHB8 = findViewById(R.id.txtSHB8);
        txtSHB9 = findViewById(R.id.txtSHB9);
        txtSHB10 = findViewById(R.id.txtSHB10);
        txtSHB11 = findViewById(R.id.txtSHB11);
        txtSHB12 = findViewById(R.id.txtSHB12);

        // SacomBank
        txtSacomBank1 = findViewById(R.id.txtSacomBank1);
        txtSacomBank2 = findViewById(R.id.txtSacomBank2);
        txtSacomBank3 = findViewById(R.id.txtSacomBank3);
        txtSacomBank4 = findViewById(R.id.txtSacomBank4);
        txtSacomBank5 = findViewById(R.id.txtSacomBank5);
        txtSacomBank6 = findViewById(R.id.txtSacomBank6);
        txtSacomBank7 = findViewById(R.id.txtSacomBank7);
        txtSacomBank8 = findViewById(R.id.txtSacomBank8);
        txtSacomBank9 = findViewById(R.id.txtSacomBank9);
        txtSacomBank10 = findViewById(R.id.txtSacomBank10);
        txtSacomBank11 = findViewById(R.id.txtSacomBank11);
        txtSacomBank12 = findViewById(R.id.txtSacomBank12);

        // BIDV
        txtBIDV1 = findViewById(R.id.txtBIDV1);
        txtBIDV2 = findViewById(R.id.txtBIDV2);
        txtBIDV3 = findViewById(R.id.txtBIDV3);
        txtBIDV4 = findViewById(R.id.txtBIDV4);
        txtBIDV5 = findViewById(R.id.txtBIDV5);
        txtBIDV6 = findViewById(R.id.txtBIDV6);
        txtBIDV7 = findViewById(R.id.txtBIDV7);
        txtBIDV8 = findViewById(R.id.txtBIDV8);
        txtBIDV9 = findViewById(R.id.txtBIDV9);
        txtBIDV10 = findViewById(R.id.txtBIDV10);
        txtBIDV11 = findViewById(R.id.txtBIDV11);
        txtBIDV12 = findViewById(R.id.txtBIDV12);

        // Call API and get JSON data
        this.CallAPi();
    }

    /**
     * Function call API
     *
     * @return String Json data
     * @Param: String url API
     */
    public void CallAPi() {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        // using Volley library
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, this.urlApi, null, new Response.Listener<JSONArray>() {
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
                        if (object.getString("bank_code").equalsIgnoreCase("vietcombank")) {
                            int fillData = fillDataVietcomBank(object);
                        }
                        if (object.getString("bank_code").equalsIgnoreCase("techcom")) {
                            int fillData = fillDataTechcomBank(object);
                        }
                        if (object.getString("bank_code").equalsIgnoreCase("tpb")) {
                            int fillData = fillDataTPBank(object);
                        }
                        if (object.getString("bank_code").equalsIgnoreCase("dab")) {
                            int fillData = fillDataDongA(object);
                        }
                        if (object.getString("bank_code").equalsIgnoreCase("vietin")) {
                            int fillData = fillDataVietinBank(object);
                        }
                        if (object.getString("bank_code").equalsIgnoreCase("shb")) {
                            int fillData = fillDataSHB(object);
                        }
                        if (object.getString("bank_code").equalsIgnoreCase("sacombank")) {
                            int fillData = fillDataSacomBank(object);
                        }
                        if (object.getString("bank_code").equalsIgnoreCase("bidv")) {
                            int fillData = fillDataBIDV(object);
                        }

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                adapter.notifyDataSetChanged();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) { // response Error
                Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        requestQueue.add(jsonArrayRequest); // Day array vao Queue
    }

    /**
     * Fill data to VietcomBank
     *
     * @param object
     * @return int
     */
    private int fillDataVietcomBank(JSONObject object) {
        try {
            if (object.getString("code").equals("JPY")) {
                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietcombank1.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietcombank1.setTextColor(Color.parseColor("green"));
                }
                txtVietcombank1.setText("" + object.getDouble("muatienmat"));
            }
            if (object.getString("code").equals("CNY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietcombank2.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietcombank2.setTextColor(Color.parseColor("green"));
                }
                txtVietcombank2.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CHF")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietcombank3.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietcombank3.setTextColor(Color.parseColor("green"));
                }
                txtVietcombank3.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("AUD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietcombank4.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietcombank4.setTextColor(Color.parseColor("green"));
                }
                txtVietcombank4.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("GBP")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietcombank5.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietcombank5.setTextColor(Color.parseColor("green"));
                }
                txtVietcombank5.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("HKD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietcombank6.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietcombank6.setTextColor(Color.parseColor("green"));
                }
                txtVietcombank6.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("SGD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietcombank7.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietcombank7.setTextColor(Color.parseColor("green"));
                }
                txtVietcombank7.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("THB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietcombank8.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietcombank8.setTextColor(Color.parseColor("green"));
                }
                txtVietcombank8.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("CAD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietcombank9.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietcombank9.setTextColor(Color.parseColor("green"));
                }
                txtVietcombank9.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("KRW")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietcombank10.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietcombank10.setTextColor(Color.parseColor("green"));
                }
                txtVietcombank10.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("RUB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietcombank11.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietcombank11.setTextColor(Color.parseColor("green"));
                }
                txtVietcombank11.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("DKK")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietcombank12.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietcombank12.setTextColor(Color.parseColor("green"));
                }
                txtVietcombank12.setText("" + object.getString("muatienmat"));

            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private int fillDataTechcomBank(JSONObject object) {
        try {
            if (object.getString("code").equals("JPY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTechcomBank1.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTechcomBank1.setTextColor(Color.parseColor("green"));
                }
                txtTechcomBank1.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CNY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTechcomBank2.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTechcomBank2.setTextColor(Color.parseColor("green"));
                }
                txtTechcomBank2.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CHF")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTechcomBank3.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTechcomBank3.setTextColor(Color.parseColor("green"));
                }
                txtTechcomBank3.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("AUD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTechcomBank4.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTechcomBank4.setTextColor(Color.parseColor("green"));
                }
                txtTechcomBank4.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("GBP")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTechcomBank4.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTechcomBank4.setTextColor(Color.parseColor("green"));
                }
                txtTechcomBank4.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("HKD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTechcomBank6.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTechcomBank6.setTextColor(Color.parseColor("green"));
                }
                txtTechcomBank6.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("SGD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTechcomBank7.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTechcomBank7.setTextColor(Color.parseColor("green"));
                }
                txtTechcomBank7.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("THB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTechcomBank8.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTechcomBank8.setTextColor(Color.parseColor("green"));
                }
                txtTechcomBank8.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("CAD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTechcomBank9.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTechcomBank9.setTextColor(Color.parseColor("green"));
                }
                txtTechcomBank9.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("KRW")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTechcomBank10.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTechcomBank10.setTextColor(Color.parseColor("green"));
                }
                txtTechcomBank10.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("RUB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTechcomBank11.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTechcomBank11.setTextColor(Color.parseColor("green"));
                }
                txtTechcomBank11.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("DKK")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTechcomBank12.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTechcomBank12.setTextColor(Color.parseColor("green"));
                }
                txtTechcomBank12.setText("" + object.getString("muatienmat"));

            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Fill data TPB
     *
     * @param object
     * @return
     */
    private int fillDataTPBank(JSONObject object) {
        try {
            if (object.getString("code").equals("JPY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTPB1.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTPB1.setTextColor(Color.parseColor("green"));
                }
                txtTPB1.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CNY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTPB2.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTPB2.setTextColor(Color.parseColor("green"));
                }
                txtTPB2.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CHF")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTPB3.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTPB3.setTextColor(Color.parseColor("green"));
                }
                txtTPB3.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("AUD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTPB4.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTPB4.setTextColor(Color.parseColor("green"));
                }
                txtTPB4.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("GBP")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTPB5.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTPB5.setTextColor(Color.parseColor("green"));
                }
                txtTPB5.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("HKD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTPB6.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTPB6.setTextColor(Color.parseColor("green"));
                }
                txtTPB6.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("SGD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTPB7.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTPB7.setTextColor(Color.parseColor("green"));
                }
                txtTPB7.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("THB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTPB8.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTPB8.setTextColor(Color.parseColor("green"));
                }
                txtTPB8.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("CAD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTPB9.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTPB9.setTextColor(Color.parseColor("green"));
                }
                txtTPB9.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("KRW")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTPB10.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTPB10.setTextColor(Color.parseColor("green"));
                }
                txtTPB10.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("RUB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTPB11.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTPB11.setTextColor(Color.parseColor("green"));
                }
                txtTPB11.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("DKK")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtTPB12.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtTPB12.setTextColor(Color.parseColor("green"));
                }
                txtTPB12.setText("" + object.getString("muatienmat"));

            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Fill data DongA
     *
     * @param object
     * @return 1 or 0
     */
    private int fillDataDongA(JSONObject object) {
        try {
            if (object.getString("code").equals("JPY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtDongA1.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtDongA1.setTextColor(Color.parseColor("green"));
                }
                txtDongA1.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CNY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtDongA2.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtDongA2.setTextColor(Color.parseColor("green"));
                }
                txtDongA2.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CHF")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtDongA3.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtDongA3.setTextColor(Color.parseColor("green"));
                }
                txtDongA3.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("AUD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtDongA4.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtDongA4.setTextColor(Color.parseColor("green"));
                }
                txtDongA4.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("GBP")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtDongA5.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtDongA5.setTextColor(Color.parseColor("green"));
                }
                txtDongA5.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("HKD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtDongA6.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtDongA6.setTextColor(Color.parseColor("green"));
                }
                txtDongA6.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("SGD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtDongA7.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtDongA7.setTextColor(Color.parseColor("green"));
                }
                txtDongA7.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("THB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtDongA8.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtDongA8.setTextColor(Color.parseColor("green"));
                }
                txtDongA8.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("CAD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtDongA9.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtDongA9.setTextColor(Color.parseColor("green"));
                }
                txtDongA9.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("KRW")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtDongA10.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtDongA10.setTextColor(Color.parseColor("green"));
                }
                txtDongA10.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("RUB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtDongA11.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtDongA11.setTextColor(Color.parseColor("green"));
                }
                txtDongA11.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("DKK")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtDongA12.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtDongA12.setTextColor(Color.parseColor("green"));
                }
                txtDongA12.setText("" + object.getString("muatienmat"));

            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Fill data VietinBank
     *
     * @param object
     * @return 1 or 0
     */
    private int fillDataVietinBank(JSONObject object) {
        try {
            if (object.getString("code").equals("JPY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietinBank1.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietinBank1.setTextColor(Color.parseColor("green"));
                }
                txtVietinBank1.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CNY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietinBank2.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietinBank2.setTextColor(Color.parseColor("green"));
                }
                txtVietinBank2.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CHF")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietinBank2.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietinBank2.setTextColor(Color.parseColor("green"));
                }
                txtVietinBank2.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("AUD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietinBank4.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietinBank4.setTextColor(Color.parseColor("green"));
                }
                txtVietinBank4.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("GBP")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietinBank5.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietinBank5.setTextColor(Color.parseColor("green"));
                }
                txtVietinBank5.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("HKD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietinBank6.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietinBank6.setTextColor(Color.parseColor("green"));
                }
                txtVietinBank6.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("SGD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietinBank7.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietinBank7.setTextColor(Color.parseColor("green"));
                }
                txtVietinBank7.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("THB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietinBank8.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietinBank8.setTextColor(Color.parseColor("green"));
                }
                txtVietinBank8.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("CAD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietinBank9.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietinBank9.setTextColor(Color.parseColor("green"));
                }
                txtVietinBank9.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("KRW")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietinBank10.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietinBank10.setTextColor(Color.parseColor("green"));
                }
                txtVietinBank10.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("RUB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietinBank11.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietinBank11.setTextColor(Color.parseColor("green"));
                }
                txtVietinBank11.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("DKK")) {
                if (object.getDouble("muatienmat_diff") < 0) {
                    txtVietinBank12.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtVietinBank12.setTextColor(Color.parseColor("green"));
                }
                txtVietinBank12.setText("" + object.getString("muatienmat"));

            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Fill data SHB
     *
     * @param object
     * @return 1 or 0
     */
    private int fillDataSHB(JSONObject object) {
        try {
            if (object.getString("code").equals("JPY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSHB1.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSHB1.setTextColor(Color.parseColor("green"));
                }
                txtSHB1.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CNY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSHB2.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSHB2.setTextColor(Color.parseColor("green"));
                }
                txtSHB2.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CHF")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSHB3.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSHB3.setTextColor(Color.parseColor("green"));
                }
                txtSHB3.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("AUD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSHB4.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSHB4.setTextColor(Color.parseColor("green"));
                }
                txtSHB4.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("GBP")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSHB5.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSHB5.setTextColor(Color.parseColor("green"));
                }
                txtSHB5.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("HKD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSHB6.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSHB6.setTextColor(Color.parseColor("green"));
                }
                txtSHB6.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("SGD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSHB7.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSHB7.setTextColor(Color.parseColor("green"));
                }
                txtSHB7.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("THB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSHB8.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSHB8.setTextColor(Color.parseColor("green"));
                }
                txtSHB8.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("CAD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSHB9.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSHB9.setTextColor(Color.parseColor("green"));
                }
                txtSHB9.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("KRW")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSHB10.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSHB10.setTextColor(Color.parseColor("green"));
                }
                txtSHB10.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("RUB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSHB11.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSHB11.setTextColor(Color.parseColor("green"));
                }
                txtSHB11.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("DKK")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSHB12.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSHB12.setTextColor(Color.parseColor("green"));
                }
                txtSHB12.setText("" + object.getString("muatienmat"));

            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Fill data sacombank
     *
     * @param object
     * @return 1 or 0
     */
    private int fillDataSacomBank(JSONObject object) {
        try {
            if (object.getString("code").equals("JPY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSacomBank1.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSacomBank1.setTextColor(Color.parseColor("green"));
                }
                txtSacomBank1.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CNY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSacomBank2.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSacomBank2.setTextColor(Color.parseColor("green"));
                }
                txtSacomBank2.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CHF")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSacomBank3.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSacomBank3.setTextColor(Color.parseColor("green"));
                }
                txtSacomBank3.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("AUD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSacomBank4.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSacomBank4.setTextColor(Color.parseColor("green"));
                }
                txtSacomBank4.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("GBP")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSacomBank5.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSacomBank5.setTextColor(Color.parseColor("green"));
                }
                txtSacomBank5.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("HKD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSacomBank6.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSacomBank6.setTextColor(Color.parseColor("green"));
                }
                txtSacomBank6.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("SGD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSacomBank7.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSacomBank7.setTextColor(Color.parseColor("green"));
                }
                txtSacomBank7.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("THB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSacomBank8.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSacomBank8.setTextColor(Color.parseColor("green"));
                }
                txtSacomBank8.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("CAD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSacomBank9.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSacomBank9.setTextColor(Color.parseColor("green"));
                }
                txtSacomBank9.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("KRW")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSacomBank10.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSacomBank10.setTextColor(Color.parseColor("green"));
                }
                txtSacomBank10.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("RUB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSacomBank11.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSacomBank11.setTextColor(Color.parseColor("green"));
                }
                txtSacomBank11.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("DKK")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtSacomBank12.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtSacomBank12.setTextColor(Color.parseColor("green"));
                }
                txtSacomBank12.setText("" + object.getString("muatienmat"));

            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /**
     * Fill data sacombank
     *
     * @param object
     * @return 1 or 0
     */
    private int fillDataBIDV(JSONObject object) {
        try {
            if (object.getString("code").equals("JPY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtBIDV1.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtBIDV1.setTextColor(Color.parseColor("green"));
                }
                txtBIDV1.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CNY")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtBIDV2.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtBIDV2.setTextColor(Color.parseColor("green"));
                }
                txtBIDV2.setText("" + object.getDouble("muatienmat"));

            }
            if (object.getString("code").equals("CHF")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtBIDV3.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtBIDV3.setTextColor(Color.parseColor("green"));
                }
                txtBIDV3.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("AUD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtBIDV4.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtBIDV4.setTextColor(Color.parseColor("green"));
                }
                txtBIDV4.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("GBP")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtBIDV5.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtBIDV5.setTextColor(Color.parseColor("green"));
                }
                txtBIDV5.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("HKD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtBIDV6.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtBIDV6.setTextColor(Color.parseColor("green"));
                }
                txtBIDV6.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("SGD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtBIDV7.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtBIDV7.setTextColor(Color.parseColor("green"));
                }
                txtBIDV7.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("THB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtBIDV8.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtBIDV8.setTextColor(Color.parseColor("green"));
                }
                txtBIDV8.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("CAD")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtBIDV9.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtBIDV9.setTextColor(Color.parseColor("green"));
                }
                txtBIDV9.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("KRW")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtBIDV10.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtBIDV10.setTextColor(Color.parseColor("green"));
                }
                txtBIDV10.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("RUB")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtBIDV11.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtBIDV11.setTextColor(Color.parseColor("green"));
                }
                txtBIDV11.setText("" + object.getString("muatienmat"));

            }
            if (object.getString("code").equals("DKK")) {

                if (object.getDouble("muatienmat_diff") < 0) {
                    txtBIDV12.setTextColor(Color.parseColor("#ff0000"));
                }
                if (object.getDouble("muatienmat_diff") > 0) {
                    txtBIDV12.setTextColor(Color.parseColor("green"));
                }
                txtBIDV12.setText("" + object.getString("muatienmat"));

            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
