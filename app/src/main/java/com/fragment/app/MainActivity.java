package com.fragment.app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.widget.TabHost.TabSpec;



public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTabHost fTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        fTabHost.setup(this, getSupportFragmentManager(), R.id.content);


        TabSpec tabSpec1 = fTabHost.newTabSpec("tab1");
        tabSpec1.setIndicator("tab1");
        fTabHost.addTab(tabSpec1, Fragment1.class, null);

        TabSpec tabSpec2 = fTabHost.newTabSpec("tab2");
        tabSpec2.setIndicator("tab2");
        fTabHost.addTab(tabSpec2, Fragment2.class, null);

        TabSpec tabSpec3 = fTabHost.newTabSpec("tab3");
        tabSpec3.setIndicator("tab3");
        fTabHost.addTab(tabSpec3, Fragment3.class, null);


    }

}
