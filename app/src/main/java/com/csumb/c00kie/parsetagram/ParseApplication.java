package com.csumb.c00kie.parsetagram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    public static final String APP_API_KEY = BuildConfig.APP_ID_KEY;
    public static final String ClIENT_KEY = BuildConfig.CLIENT_KEY;

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(APP_API_KEY)
                .clientKey(ClIENT_KEY)
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
