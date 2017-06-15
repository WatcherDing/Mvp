package com.example.dyw.mvp.mvp.model.api.service;

import com.example.dyw.mvp.utils.RxUtils;
import com.jess.arms.mvp.IView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import me.jessyan.rxerrorhandler.handler.RetryWithDelay;

/**
 * <pre>
 *     author: DYW
 *     blog  : https://watcherding.github.io
 *     time  : 2017/6/15
 *     desc  : 封装 Retrofit+Rxjava 访问网络相同代码
 * </pre>
 */
public class HttpMethods {
    //创建单例
    public static class SingleonHolder {
        private static final HttpMethods instance = new HttpMethods();
    }

    //获取单例
    public static HttpMethods getInstance() {
        return SingleonHolder.instance;
    }

    public void getData(Observable observable, ErrorHandleSubscriber subscriber,IView view) {
        observable.subscribeOn(Schedulers.io())
                .retryWhen(new RetryWithDelay(3, 2))
                .doOnSubscribe(disposable -> {
                    //访问开始
                })
                .doAfterTerminate(() -> {
                //访问结束
                })
                .compose(RxUtils.bindToLifecycle(view)) //使用Rxlifecycle,使Disposable和Activity一起销毁
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);

    }


}
