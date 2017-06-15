package com.example.dyw.mvp.mvp.presenter;

import android.app.Application;

import com.example.dyw.mvp.mvp.contract.TestContract;
import com.example.dyw.mvp.mvp.model.api.service.HttpMethods;
import com.example.dyw.mvp.mvp.model.entity.BaseJson;
import com.example.dyw.mvp.mvp.model.entity.GItem;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.AppManager;
import com.jess.arms.mvp.BasePresenter;

import java.util.List;

import javax.inject.Inject;

import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;

/**
 * <pre>
 *     author: DYW
 *     blog  : https://watcherding.github.io
 *     time  : 2017/6/15
 *     desc  : -----------------
 * </pre>
 */
@ActivityScope
public class TestPresenter extends BasePresenter<TestContract.Model, TestContract.View> implements TestContract.Presenter {
    private RxErrorHandler mErrorHandler;
    private AppManager mAppManager;
    private Application mApplication;

    @Inject
    public TestPresenter(TestContract.Model model, TestContract.View rootView, RxErrorHandler handler
            , AppManager appManager, Application application) {
        super(model, rootView);
        this.mApplication = application;
        this.mErrorHandler = handler;
        this.mAppManager = appManager;
    }

    //这里定义业务方法,相应用户的交互

    /**
     * 是否刷新数据
     * @param pullToRefresh
     */
    public void requesta(final boolean pullToRefresh) {
        ErrorHandleSubscriber subscriber=   new ErrorHandleSubscriber<BaseJson<List<GItem>>>(mErrorHandler) {
            @Override
            public void onNext(BaseJson<List<GItem>> data) {
                List<GItem> list = data.getData();

            }
        };

        HttpMethods.getInstance().getData(mModel.getGankIO(),subscriber,mRootView);
    }

}
