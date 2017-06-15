package com.example.dyw.mvp;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;

import com.jess.arms.base.BaseApplication;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * <pre>
 *     author: DYW
 *     blog  : https://watcherding.github.io
 *     time  : 2017/6/15
 *     desc  : -----------------
 * </pre>
 */
public class APP  extends BaseApplication {
   private static APP app;
    public void onCreate() {
        super.onCreate();
        app = this;
        //initConfig();
    }
    public static APP getInstance() {
        return app;
    }

    /**
     * 处理一些需要在Application中设置的配置
     */
    private void initConfig() {

        //AppConfig appConfig = new AppConfig();
        //appConfig.init();
    }

    /**
     * 设置为了防止用户Setting 中修改修改字体大小app的大小也跟着改变
     * @param newConfig
     */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        if (newConfig.fontScale != 1)//非默认值
            getResources();
        super.onConfigurationChanged(newConfig);
    }
    /**
     * 设置为了防止用户Setting 中修改修改字体大小app的大小也跟着改变
     */
    @Override
    public Resources getResources() {
        Resources res = super.getResources();
        if (res.getConfiguration().fontScale != 1) {//非默认值
            Configuration newConfig = new Configuration();
            newConfig.setToDefaults();
            //设置默认
            res.updateConfiguration(newConfig, res.getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                createConfigurationContext(newConfig);
            } else {
                res.updateConfiguration(newConfig, res.getDisplayMetrics());
            }
        }
        return res;
    }

}
