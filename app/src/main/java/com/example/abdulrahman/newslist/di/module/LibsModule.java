package com.example.abdulrahman.newslist.di.module;


import com.example.abdulrahman.newslist.base.baseLib.EventBus;
import com.example.abdulrahman.newslist.base.baseLib.ImageLoader;
import com.example.abdulrahman.newslist.libs.GreenRobotEventBus;
import com.example.abdulrahman.newslist.libs.PicassoImageLoader;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by abdulrahman on 24/07/17.
 */
@Module
public class LibsModule {
    private String mBaseUrl;


    public LibsModule(String mBaseUrl) {
        this.mBaseUrl = mBaseUrl;
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        return new Retrofit.Builder()
                .baseUrl(mBaseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }


    @Provides
    @Singleton
    ImageLoader providesImageLoader(PicassoImageLoader picassoImageLoader) {

        return picassoImageLoader;
    }
    @Provides
    @Singleton
    EventBus providesEventBus(GreenRobotEventBus greenRobotEventBus) {
        return greenRobotEventBus;

    }


    @Provides
    @Singleton
    org.greenrobot.eventbus.EventBus providesEventBusLibs() {
        return new org.greenrobot.eventbus.EventBus();

    }
}
