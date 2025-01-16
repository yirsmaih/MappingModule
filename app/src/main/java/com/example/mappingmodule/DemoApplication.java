package com.example.mappingmodule;

import android.app.Application;

import com.baidu.location.LocationClient;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

/**
 * @function:
 * @date: 2025/1/14
 */
public class DemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.setAgreePrivacy(this,true);
        SDKInitializer.initialize(this);
        SDKInitializer.setCoordType(CoordType.BD09LL);
        LocationClient.setAgreePrivacy(true);
    }
}
