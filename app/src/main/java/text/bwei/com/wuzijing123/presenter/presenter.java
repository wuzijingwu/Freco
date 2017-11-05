package text.bwei.com.wuzijing123.presenter;

import java.util.List;

import text.bwei.com.wuzijing123.bean.News;
import text.bwei.com.wuzijing123.model.Imodel;
import text.bwei.com.wuzijing123.model.OnseltLinster;
import text.bwei.com.wuzijing123.model.model;
import text.bwei.com.wuzijing123.view.Iview;

/**
 * Created by dell on 2017/11/4.
 */

public class presenter {
    Iview iview;
    Imodel imodel;

    public presenter(Iview iview) {
        this.iview = iview;
        imodel = new model();
    }

    public void getOk(String url) {
        imodel.RequestSuccess(url, new OnseltLinster() {
            @Override
            public void datesSuccess(List<News.DataBean> list) {

                iview.showSuccess(list);

            }

            @Override
            public void datesError(String r) {
                iview.showError(r);
            }
        });


    }


}
