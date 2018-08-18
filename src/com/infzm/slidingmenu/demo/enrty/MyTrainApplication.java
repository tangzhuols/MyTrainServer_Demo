package com.infzm.slidingmenu.demo.enrty;

import android.app.Application;
import android.os.Bundle;

import org.xutils.x;

import com.infzm.slidingmenu.demo.enrty.acer.mytrainserver.BuildConfig;

/**
 * Created by acer on 2016/10/17.
 */
public class MyTrainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);
    }
}
