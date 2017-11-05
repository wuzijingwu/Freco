package text.bwei.com.myapplication.presenter;

import java.util.List;

import text.bwei.com.myapplication.bean.News;
import text.bwei.com.myapplication.model.Imodel;
import text.bwei.com.myapplication.model.Oncleclist;
import text.bwei.com.myapplication.model.model;
import text.bwei.com.myapplication.view.Iview;

/**
 * Created by dell on 2017/11/5.
 */

public class presenter {
    Imodel imodel;
    Iview iview;

    public presenter(Iview iview) {
        this.iview = iview;
        imodel=new model();
    }
    public void getOk(String url){
        imodel.RequesSuccess(url, new Oncleclist() {
            @Override
            public void dateSuccess(List<News.DataBean> list) {
                iview.showSuccess(list);
            }

            @Override
            public void dateError(String r) {
                iview.showError(r);
            }
        });


    }


}
