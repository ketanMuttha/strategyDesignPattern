package com.design.strategy.buildstrategy;

import android.util.Log;

public class TestStrategy implements IBuildStrategy{


    @Override
    public void setEnv() {

        Log.d("","set the test project configuration");
    }
}
