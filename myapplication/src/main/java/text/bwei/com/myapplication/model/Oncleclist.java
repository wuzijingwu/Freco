package text.bwei.com.myapplication.model;

import java.util.List;

import text.bwei.com.myapplication.bean.News;

/**
 * Created by dell on 2017/11/5.
 */

public interface Oncleclist {
    void dateSuccess(List<News.DataBean> list);
    void dateError(String r);
}
