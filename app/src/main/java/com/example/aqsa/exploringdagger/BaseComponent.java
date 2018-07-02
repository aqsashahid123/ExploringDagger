package com.example.aqsa.exploringdagger;

import android.app.ProgressDialog;

import dagger.Component;
import retrofit2.Retrofit;
@ExploringDaggerScope
@Component(modules = {RetroModule.class,ProgressDialogModule.class,NetworkServiceApiModule.class})
public interface BaseComponent {
//Retrofit getRetrofit();
//ProgressDialog getDialog();
//NetworkApiInterface getNetworkApiService();
void injectActivity(MainActivity activity);
}
