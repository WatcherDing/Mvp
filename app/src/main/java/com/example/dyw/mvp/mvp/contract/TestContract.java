package com.example.dyw.mvp.mvp.contract;


import com.example.dyw.mvp.mvp.model.entity.BaseJson;
import com.example.dyw.mvp.mvp.model.entity.GItem;
import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IPresenter;
import com.jess.arms.mvp.IView;

import java.util.List;

import io.reactivex.Observable;

/**
 * <pre>
 *     author: DYW
 *     blog  : https://watcherding.github.io
 *     time  : 2017/6/15
 *     desc  : -----------------
 * </pre>
 */
public interface TestContract {
    interface View extends IView {
    }

    interface Presenter extends IPresenter {
    }

    interface Model extends IModel {
        Observable<BaseJson<List<GItem>>> getGankIO();
    }
}
