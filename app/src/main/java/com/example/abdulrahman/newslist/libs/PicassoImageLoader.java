package com.example.abdulrahman.newslist.libs;

import android.content.Context;
import android.widget.ImageView;

import com.example.abdulrahman.newslist.R;
import com.example.abdulrahman.newslist.base.baseLib.ImageLoader;
import com.example.abdulrahman.newslist.di.ApplicationContext;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

/**
 * Created by abdulrahman on 24/07/17.
 */

public class PicassoImageLoader implements ImageLoader {

    private Picasso picassoRequestManager;

    @Inject
    public PicassoImageLoader(@ApplicationContext Context context) {
        this.picassoRequestManager = Picasso.with(context);
    }

    @Override
    public void load(ImageView imageView, String URL) {

        picassoRequestManager
                .load(URL)
                .placeholder(R.drawable.loading)
                .into(imageView);
    }
    @Override
    public void load(ImageView imageView, int rsourceId) {
        picassoRequestManager
                .load(rsourceId)
                .placeholder(R.drawable.loading)
                .into(imageView);
    }
    @Override
    public void normalLoad(ImageView imageView, String URL) {
        picassoRequestManager
                .load(URL)
                .placeholder(R.drawable.loading)
                .into(imageView);
    }



}
