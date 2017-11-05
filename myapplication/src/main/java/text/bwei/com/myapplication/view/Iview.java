package text.bwei.com.myapplication.view;

import java.util.List;

import text.bwei.com.myapplication.bean.News;

/**
 * Created by dell on 2017/11/5.
 */

public interface Iview {
    void showSuccess(List<News.DataBean> list);
    void showError(String r);

}
