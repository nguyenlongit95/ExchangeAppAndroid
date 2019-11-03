package com.example.exchangeapp;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class CallAPi {

    private String linkHost;

    /**
     * Function generate url APi
     * @param url
     * @return String
     */
    public String urlAPI(String url) {
        return this.linkHost = "https://86ffccb1.ngrok.io/ExchangeApp/public/api/v1/" + url;
    }

}
