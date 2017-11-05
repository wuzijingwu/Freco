package text.bwei.com.myapplication.model;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import text.bwei.com.myapplication.Api.Api;
import text.bwei.com.myapplication.Api.Apps;
import text.bwei.com.myapplication.bean.News;

/**
 * Created by dell on 2017/11/5.
 */

public class model implements Imodel{


    @Override
    public void RequesSuccess(String url, final Oncleclist oncleclist) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BOTH)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        //通过动态代理得到网络接口对象
        Apps apps = retrofit.create(Apps.class);

        Observable<News> dat = apps.getDat();
        dat.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<News>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        oncleclist.dateError(e.getMessage().toString());

                    }

                    @Override
                    public void onNext(News news) {
                        List<News.DataBean> data = news.getData();
                        oncleclist.dateSuccess(data);

                    }


                });



    }
}
