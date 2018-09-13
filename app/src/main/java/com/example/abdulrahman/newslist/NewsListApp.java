package com.example.abdulrahman.newslist;

import android.app.Application;

import com.example.abdulrahman.newslist.di.component.ApplicationComponent;
import com.example.abdulrahman.newslist.di.component.DaggerApplicationComponent;
import com.example.abdulrahman.newslist.di.module.ApplicationModule;
import com.example.abdulrahman.newslist.di.module.LibsModule;
import com.example.abdulrahman.newslist.utils.AppConstants;

public class NewsListApp extends Application {
    private ApplicationComponent mApplicationComponent;



    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }
    private  void setUpdependancy(){
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .libsModule(new LibsModule(AppConstants.BASE_URL))
                .build();
        mApplicationComponent.inject(this);
    }

}
