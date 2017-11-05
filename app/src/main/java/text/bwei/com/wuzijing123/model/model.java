package text.bwei.com.wuzijing123.model;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import text.bwei.com.wuzijing123.Api.Api;
import text.bwei.com.wuzijing123.Api.Apps;
import text.bwei.com.wuzijing123.bean.News;

/**
 * Created by dell on 2017/11/4.
 */

public class model implements Imodel{

    @Override
    public void RequestSuccess(String url, final OnseltLinster onseltLinster) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        //通过动态代理得到网络接口对象
        Apps apps = retrofit.create(Apps.class);

        final Observable<News> homes = apps.getDat();
        homes.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<News>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        onseltLinster.datesError(e.getMessage().toString());

                    }

                    @Override
                    public void onNext(News news) {
                        List<News.DataBean> data = news.getData();
                        onseltLinster.datesSuccess(data);

                    }


                });



    }
}
