package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.test.liumengxin201711042.R;

import static tools.API.URL2_01;
import static tools.API.URL2_02;
import static tools.API.URL2_03;
import static tools.API.URL2_04;
import static tools.API.URL2_05;
import static tools.API.URL2_06;
import static tools.API.URL2_07;
import static tools.API.URL2_08;


/**
 * autor:刘梦欣
 * date：2017/11/4
 * update：8:27
 * 用途：
 */
public class Fragment4 extends Fragment {
    View view;
    TabLayout tb;
    FragmentManager fm;
    private String[] mpath = {URL2_01, URL2_02, URL2_03, URL2_04, URL2_05, URL2_06, URL2_07, URL2_08};
    private String[] title = {"数据新闻","快讯","头条","精编公告","美股","港股","基金","理财"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment4, container, false);
        initView();
        initDatas();
        return view;
    }


    private void initView() {
        tb = view.findViewById(R.id.fragment_tb);
        fm = getFragmentManager();


    }

    private void initDatas() {
        for (int i=0;i<8;i++){
            tb.addTab(tb.newTab().setText(title[i]));
        }
        tb.setTabMode(TabLayout.MODE_SCROLLABLE);
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragmemnt_fr, new Fragment6(mpath[0]));
        fragmentTransaction.commit();
        tb.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.fragmemnt_fr, new Fragment6(mpath[position]));
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
}
