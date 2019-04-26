package com.example.jiancheng.mvpmodel.Model.Api;

import com.example.jiancheng.mvpmodel.Model.Content;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Webservice {
    @GET("/content")
    Observable<List<Content>> getConversation();

    @FormUrlEncoded
    @POST("/content")
    Call<Content> setConversation(@Field("name")String name, @Field("conversation")String conversation, @Field("date")String date);
}
