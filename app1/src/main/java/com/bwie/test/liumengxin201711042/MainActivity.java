package com.bwie.test.liumengxin201711042;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import fragment.Fragment1;
import fragment.Fragment2;
import fragment.Fragment3;
import fragment.Fragment4;
import fragment.Fragment5;

public class MainActivity extends AppCompatActivity {
    TabLayout tb;
    ArrayList<Fragment> list;
    FragmentManager fm;
    String[] title = {"首页","自选","行情","咨询","交易"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initDatas();
    }

    private void initDatas() {
        list.add(new Fragment1());
        list.add(new Fragment2());
        list.add(new Fragment3());
        list.add(new Fragment4());
        list.add(new Fragment5());
        for (int i=0;i<5;i++){
            tb.addTab(tb.newTab().setText(title[i]));
            tb.getTabAt(i).setIcon(R.mipmap.ic_launcher);

        }
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment, list.get(0));
        fragmentTransaction.commit();
        tb.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, list.get(position));
                fragmentTransaction.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void initViews() {
        tb = (TabLayout) findViewById(R.id.tb);
        fm = getSupportFragmentManager();
        list = new ArrayList<>();
    }
}
