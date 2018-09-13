package com.example.abdulrahman.newslist.ui;

import com.example.abdulrahman.newslist.Events.DataEvent;
import com.example.abdulrahman.newslist.base.baseMvp.BasePresenter;

import javax.inject.Inject;


public class MainPresenterImp <V extends MainView> extends BasePresenter<V> implements MainPresenter<V> {


    @Inject
    public MainPresenterImp(MainInteractor interactor) {
        super(interactor);
    }




    @Override
    public void onEvent(DataEvent event) {

    }
}
