package com.example.aqsa.exploringdagger;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
@Module(includes = ContextModule.class)
public class NetworkModule {
    @ExploringDaggerScope
    @Provides
    OkHttpClient client(){
        return new OkHttpClient.Builder()
                .connectTimeout(120, TimeUnit.SECONDS)
                .readTimeout(120L, TimeUnit.SECONDS)
                .writeTimeout(120L, TimeUnit.SECONDS).build();
    }
}
