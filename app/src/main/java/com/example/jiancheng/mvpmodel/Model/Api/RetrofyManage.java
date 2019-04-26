package com.example.jiancheng.mvpmodel.Model.Api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofyManage {
    private  static  RetrofyManage retrofyManage = new RetrofyManage();

    private Webservice webservice;


    private RetrofyManage() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2:3000")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        webservice=retrofit.create(Webservice.class);

    }

    public static Webservice getWebservice() {

        return retrofyManage.webservice;
    }
}
