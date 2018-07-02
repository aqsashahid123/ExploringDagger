package com.example.aqsa.exploringdagger;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface NetworkApiInterface {
    @Headers("Content-Type: application/json")
    @POST("api/v1/users/signup")
    public Call<RootUserModel> userSignUpRealtimeAccount(@Body RootUserModel user);


    @Headers("Content-Type: application/json")
    @POST("api/v1/users/signin")
    public Call<RootUserModel> userSignIn(@Body RootUserModel user);
}
