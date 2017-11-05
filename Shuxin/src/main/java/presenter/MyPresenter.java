package presenter;

import java.util.List;

import bean.Mygson2;
import model.MyModel;
import view.Iview;

/**
 * autor:刘梦欣
 * date：2017/11/4
 * update：13:26
 * 用途：
 */
public class MyPresenter implements MyModel.OnFinishLisenter {
    public Iview iview;
    public MyModel myModel;

    public MyPresenter(Iview iview) {
        this.iview = iview;
        myModel = new MyModel();
    }

    public void setAdapters(String mm) {
        myModel.getData(mm);
        myModel.setOnFinishLisenter(this);

    }

    @Override
    public void onFinish(List<Mygson2.DataEntity> userBean) {
        iview.getDatas(userBean);

    }
}
