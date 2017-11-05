package tools;

import java.util.List;

import bean.MyGson;
import bean.Mygson2;
import retrofit2.http.GET;
import rx.Observable;

/**
 * autor:刘梦欣
 * date：2017/11/4
 * update：12:13
 * 用途：
 */
public interface APIService {
    @GET("?key=8d6e3228d25298f13af4fc40ce6c9679&num=20&page=1")
    Observable<MyGson> getData();

    @GET("page_1.json")
    Observable<List<Mygson2>> getData2();
}
