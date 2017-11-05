package model;

import java.util.List;

import bean.Mygson2;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import tools.API;
import tools.APIService;

/**
 * autor:刘梦欣
 * date：2017/11/4
 * update：12:52
 * 用途：
 */
public class MyModel implements Imodel {
    // 定义接口变量
    private OnFinishLisenter lisenter;

    //定义接口
    public interface OnFinishLisenter {
        void onFinish(List<Mygson2.DataEntity> userBean);
    }

    public void setOnFinishLisenter(OnFinishLisenter lisenter) {
        this.lisenter = lisenter;
    }

    @Override
    public void getData(String mm) {
        //创建Retrofit
        Retrofit retrofit = new Retrofit.Builder().baseUrl(API.URL2+mm).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
        //通过动态代理得到网络接口对象
        APIService apiService = retrofit.create(APIService.class);
        //得到Observable
        final Observable<List<Mygson2>> myGson = apiService.getData2();
        myGson.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<Mygson2>>() {


                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<Mygson2> mygson2s) {

                        lisenter.onFinish( mygson2s.get(0).getData());
                    }
                });
    }
}



