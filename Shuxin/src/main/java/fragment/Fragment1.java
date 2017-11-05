package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.test.liumengxin201711042.R;


/**
 * autor:刘梦欣
 * date：2017/11/4
 * update：8:26
 * 用途：
 */
public class Fragment1 extends Fragment {
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment1,container,false);
        return view;
    }
}
