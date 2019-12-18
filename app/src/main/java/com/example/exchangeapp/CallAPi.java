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
        return this.linkHost = "https://6f0a906c.ngrok.io/exchange_app/public/api/v1/" + url;
    }

}
