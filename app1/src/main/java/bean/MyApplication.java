package bean;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * autor:刘梦欣
 * date：2017/11/4
 * update：14:38
 * 用途：
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}