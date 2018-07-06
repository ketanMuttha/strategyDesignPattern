package com.design.strategy.buildstrategy;

import android.util.Log;

public class ProductionStrategy implements IBuildStrategy {


    @Override
    public void setEnv() {
        Log.d("","set the production project configuration");
    }

}
