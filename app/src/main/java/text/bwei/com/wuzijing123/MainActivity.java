package text.bwei.com.wuzijing123;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.hjm.bottomtabbar.BottomTabBar;

import text.bwei.com.wuzijing123.fragment.FiveFragment;
import text.bwei.com.wuzijing123.fragment.FourFragment;
import text.bwei.com.wuzijing123.fragment.OneFragment;
import text.bwei.com.wuzijing123.fragment.ThreeFragment;
import text.bwei.com.wuzijing123.fragment.TwoFragment;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private BottomTabBar mBottomTabBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        viewPager = (ViewPager) findViewById(R.id.viewpager);
//        tabLayout = (TabLayout) findViewById(R.id.bottom_tab_bar);
        mBottomTabBar = (BottomTabBar) findViewById(R.id.bottom_tab_bar);
        mBottomTabBar.init(getSupportFragmentManager())
                .addTabItem("首页", R.mipmap.ic_launcher, OneFragment.class)
                .addTabItem("自选", R.mipmap.ic_launcher, TwoFragment.class)
                .addTabItem("行情", R.mipmap.ic_launcher, ThreeFragment.class)
                .addTabItem("咨询", R.mipmap.ic_launcher, FourFragment.class)
                .addTabItem("交易", R.mipmap.ic_launcher, FiveFragment.class);



    }
}