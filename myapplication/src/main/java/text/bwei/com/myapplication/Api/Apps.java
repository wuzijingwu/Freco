package text.bwei.com.myapplication.Api;

import retrofit2.http.GET;
import rx.Observable;
import text.bwei.com.myapplication.bean.News;

/**
 * Created by dell on 2017/11/5.
 */

public interface Apps {
    @GET("type/1/p/")
    Observable<News> getDat();

}
