package com.example.abdulrahman.newslist.data.remote.model;

import com.example.abdulrahman.newslist.base.baseLib.EventBus;
import com.example.abdulrahman.newslist.base.baseMvp.BaseModel;
import com.example.abdulrahman.newslist.data.entities.Entity;
import com.example.abdulrahman.newslist.data.remote.apiServices.MainServices;

import javax.inject.Inject;


public class MainModelImp extends BaseModel implements  MainModel {

    MainServices mMainServices;
    @Inject
    public MainModelImp(EventBus eventBus  , MainServices mainServices) {
        super(eventBus);
        this.mMainServices = mainServices;

    }
    @Override
    public void getAllData() {

    }

    @Override
    public void getData(Entity entity) {

    }
}
