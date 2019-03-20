package com.king.networkmonitor;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * <请描述这个类是干什么的>
 * Created by wwb on 2017/7/13 17:57.
 * 
 *  使用方式: 在BaseActivity里面
 *  onCreate()初始化:  NetworkReceiver.addCallback(this);
 *  onDestory()销毁时:  NetworkReceiver.removeCallback(this);
 *  在需要使用的地方接收回调方法参数即可。
 */

public class BaseActivity extends AppCompatActivity implements NetworkReceiver.NetworkCallback {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        NetworkReceiver.addCallback(this);
    }

    @Override
    protected void onDestroy() {
        NetworkReceiver.removeCallback(this);
        super.onDestroy();
    }

    @Override
    public void onNetworkChanged(NetworkReceiver.NetworkType type) {

    }
}
