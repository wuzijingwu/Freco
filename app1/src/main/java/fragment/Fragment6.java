package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.test.liumengxin201711042.R;

import java.util.List;

import adapter.MyAdapter;
import bean.Mygson2;
import presenter.MyPresenter;
import view.Iview;

/**
 * autor:刘梦欣
 * date：2017/11/4
 * update：12:10
 * 用途：
 */
public class Fragment6 extends Fragment implements Iview {
    View view;
    MyPresenter myPresenter;
    RecyclerView recycler;
    private String mypth;

    public Fragment6(String mypth) {
        this.mypth = mypth;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment6, null);
        recycler=view.findViewById(R.id.recycler);
        myPresenter = new MyPresenter(this);
        myPresenter.setAdapters(mypth);

        return view;
    }

    @Override
    public void getDatas(List<Mygson2.DataEntity> ss) {
        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler.setAdapter(new MyAdapter(ss,getActivity()));

    }
}
