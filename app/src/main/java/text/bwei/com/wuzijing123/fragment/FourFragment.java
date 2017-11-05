package text.bwei.com.wuzijing123.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import text.bwei.com.wuzijing123.Api.Api;
import text.bwei.com.wuzijing123.R;
import text.bwei.com.wuzijing123.bean.News;
import text.bwei.com.wuzijing123.presenter.presenter;
import text.bwei.com.wuzijing123.view.Iview;

/**
 * Created by dell on 2017/11/4.
 */

public class FourFragment extends Fragment implements Iview {
    private View inflate;
    private TabLayout tablayout;
    private ViewPager viewpager;
    String[] er = new String[]{"沪深", "板块", "指数", "港股"};


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate = inflater.inflate(R.layout.zhixun, container, false);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initview();
        presenter presenter = new presenter(this);
        presenter.getOk(Api.BASE_URL);
        for (int i = 0; i < er.length; i++) {
            tablayout.addTab(tablayout.newTab().setText(er[i]));
        }


        viewpager.setAdapter(new FragmentStatePagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                Fragment f = null;
                switch (er[position]) {
                    case "沪深":
                        f = new Diyiye();
                        break;
                    case "板块":
                        f = new Dierye();

                        break;
                    case "指数":
                        f = new Disanye();

                        break;
                    case "港股":
                        f = new Disiye();

                        break;
                }
                return f;
            }

            @Override
            public int getCount() {
                return er.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return er[position];
            }
        });
        tablayout.setupWithViewPager(viewpager);
    }

    private void initview() {
        tablayout = inflate.findViewById(R.id.tab);
        viewpager = inflate.findViewById(R.id.vp);
    }

    @Override
    public void showSuccess(List<News.DataBean> list) {


    }

    @Override
    public void showError(String r) {

    }

}
