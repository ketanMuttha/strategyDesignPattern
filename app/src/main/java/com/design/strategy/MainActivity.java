package com.design.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.design.strategy.buildstrategy.ProductionStrategy;
import com.design.strategy.buildstrategy.TestStrategy;
import com.design.strategy.manager.BuildManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BuildManager manager=new BuildManager();
        if(BuildConfig.DEBUG){
            manager.changeBuildStrategy(new TestStrategy());
        }else {
            manager.changeBuildStrategy(new ProductionStrategy());
        }

        //Execute the algorithm.
        manager.setEnv();
    }
}
