package text.bwei.com.wuzijing123.Api;

import retrofit2.http.GET;
import rx.Observable;
import text.bwei.com.wuzijing123.bean.News;

/**
 * Created by dell on 2017/11/4.
 */

public interface Apps {
    @GET("type/1/p/")
    Observable<News> getDat();

}
