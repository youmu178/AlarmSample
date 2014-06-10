package com.yzh.alarmsample;

import com.activeandroid.ActiveAndroid;

import android.app.Application;

public class MyApplication extends Application {
	private static MyApplication mInstance = null;
	@Override
	public void onCreate() {
		super.onCreate();
		mInstance = this;
		// 初始化ActiveAndroid
		ActiveAndroid.initialize(this);
	}
	
	@Override
	public void onTerminate() {
		super.onTerminate();
		ActiveAndroid.dispose();
	}
	
	public static MyApplication getInstance() {
		return mInstance;
	}
}
