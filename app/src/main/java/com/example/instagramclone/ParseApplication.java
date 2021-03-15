package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MGZuhzPllp1HuI1QQRj5ytnTitxyeGwt8yqik321")
                .clientKey("dKJXnLKRWeyATkfXZ4CpmokPcAcpT5dr4nHODRyD")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
