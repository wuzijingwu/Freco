package text.bwei.com.wuzijing123.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import text.bwei.com.wuzijing123.R;

/**
 * Created by dell on 2017/11/4.
 */

public class FiveFragment extends Fragment {
    private View inflate;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate = inflater.inflate(R.layout.zixuan, container, false);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);




    }
}
