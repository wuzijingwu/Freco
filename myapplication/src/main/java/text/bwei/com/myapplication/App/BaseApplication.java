package text.bwei.com.myapplication.App;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by dell on 2017/11/5.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}