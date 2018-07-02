package com.example.aqsa.exploringdagger;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(includes = RetroModule.class)
public class NetworkServiceApiModule {
    @Provides
    @ExploringDaggerScope
    public NetworkApiInterface networkServiceApiInterface(Retrofit retrofit){
        return retrofit.create(NetworkApiInterface.class);
    }
}
