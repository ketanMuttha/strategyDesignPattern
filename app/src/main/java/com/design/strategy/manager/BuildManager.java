package com.design.strategy.manager;

import com.design.strategy.buildstrategy.IBuildStrategy;

/**
 * The class is used to decide which strategy class algorithm to be used.
 */
public class BuildManager implements IBuildStrategy {

    IBuildStrategy mStrategy;

    @Override
    public void setEnv() {
        mStrategy.setEnv();
    }


    public void changeBuildStrategy(IBuildStrategy strategy) {
        mStrategy=strategy;
    }
}
