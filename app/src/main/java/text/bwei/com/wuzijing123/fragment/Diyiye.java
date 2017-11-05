package text.bwei.com.wuzijing123.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import text.bwei.com.wuzijing123.Api.Api;
import text.bwei.com.wuzijing123.R;
import text.bwei.com.wuzijing123.adapter.MyAdapter;
import text.bwei.com.wuzijing123.bean.News;
import text.bwei.com.wuzijing123.presenter.presenter;
import text.bwei.com.wuzijing123.view.Iview;

/**
 * Created by dell on 2017/11/4.
 */

public class Diyiye extends Fragment implements Iview {

    private View inflate;
    private RecyclerView recyclerView;
    private text.bwei.com.wuzijing123.presenter.presenter presenter;
    private SwipeRefreshLayout swipeRefreshLayout;
    private int p=1;
    private MyAdapter myAdapter;
    private LinearLayoutManager linearLayoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflate = inflater.inflate(R.layout.yi, container, false);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyclerView = inflate.findViewById(R.id.recyc1);
        swipeRefreshLayout = inflate.findViewById(R.id.switf);
        presenter = new presenter(this);
        presenter.getOk(Api.BASE_URL+p);


    }


    @Override
    public void showSuccess(final List<News.DataBean> list) {
        linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        myAdapter = new MyAdapter(list);
        recyclerView.setAdapter(myAdapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                int lastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (lastVisibleItemPosition == list.size() - 1) {
                    p++;
                    showSuccess(list);
                    myAdapter.notifyDataSetChanged();
                }


            }
        });

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                p++;
                showSuccess(list);
                myAdapter.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(false);
            }
        });



    }

    @Override
    public void showError(String r) {

    }
}
