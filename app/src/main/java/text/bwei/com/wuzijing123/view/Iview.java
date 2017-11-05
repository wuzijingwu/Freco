package text.bwei.com.wuzijing123.view;

import java.util.List;

import text.bwei.com.wuzijing123.bean.News;

/**
 * Created by dell on 2017/11/4.
 */

public interface Iview {
    void showSuccess(List<News.DataBean> list);
    void showError(String r);

}
