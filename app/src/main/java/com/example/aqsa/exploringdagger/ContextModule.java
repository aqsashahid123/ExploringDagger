package com.example.aqsa.exploringdagger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    public Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @ExploringDaggerScope
    @AppContext
    Context context() {
        return context;
    }


}
