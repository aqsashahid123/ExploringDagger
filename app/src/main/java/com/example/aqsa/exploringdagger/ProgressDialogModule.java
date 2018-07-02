package com.example.aqsa.exploringdagger;


import android.app.ProgressDialog;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module(includes = ContextModule.class)
public class ProgressDialogModule {
    @Provides
    @ExploringDaggerScope
    ProgressDialog progressDialog(@AppContext Context context){
        return new  ProgressDialog(context);
    }
}
