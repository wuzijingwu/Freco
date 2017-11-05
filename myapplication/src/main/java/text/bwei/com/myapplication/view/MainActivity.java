package text.bwei.com.myapplication.view;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import text.bwei.com.myapplication.Api.Api;
import text.bwei.com.myapplication.R;
import text.bwei.com.myapplication.adapter.Myadpater;
import text.bwei.com.myapplication.bean.News;
import text.bwei.com.myapplication.presenter.presenter;

public class MainActivity extends AppCompatActivity implements Iview {

    private RecyclerView recyclerView;
    private text.bwei.com.myapplication.presenter.presenter presenter;
    private LinearLayoutManager linearLayoutManager;
    private int p=1;
    private Myadpater myadpater;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        presenter = new presenter(this);
        presenter.getOk(Api.BOTH+p);



    }

    private void initview() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swif);

    }

    @Override
    public void showSuccess(final List<News.DataBean> list) {
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        myadpater = new Myadpater(list);
        recyclerView.setAdapter(myadpater);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                int lastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if(lastVisibleItemPosition==list.size()-1){
                    p++;
                    showSuccess(list);
                    myadpater.notifyDataSetChanged();
                }

            }
        });

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                p++;
                showSuccess(list);
                myadpater.notifyDataSetChanged();
                swipeRefreshLayout.setRefreshing(false);
            }
        });




    }

    @Override
    public void showError(String r) {

    }
}
