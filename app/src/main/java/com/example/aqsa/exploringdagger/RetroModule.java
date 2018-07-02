package com.example.aqsa.exploringdagger;


import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = NetworkModule.class)
public class RetroModule {

    @ExploringDaggerScope
    @Provides
    public Retrofit retrofit(OkHttpClient client){
        return new Retrofit.Builder()
                .baseUrl("http://34.213.28.194:9500/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
