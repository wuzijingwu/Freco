package text.bwei.com.wuzijing123.model;

import java.util.List;

import text.bwei.com.wuzijing123.bean.News;

/**
 * Created by dell on 2017/11/4.
 */

public interface OnseltLinster {
    void datesSuccess(List<News.DataBean> list);

    void datesError(String r);


}
