package com.example.dyw.mvp.mvp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dyw.mvp.R;
import com.example.dyw.mvp.di.component.DaggerTestcComponent;
import com.example.dyw.mvp.di.module.TestModule;
import com.example.dyw.mvp.mvp.contract.TestContract;
import com.example.dyw.mvp.mvp.presenter.TestPresenter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.component.DaggerAppComponent;
import com.tbruyelle.rxpermissions2.RxPermissions;

/**
 * <pre>
 *     author: DYW
 *     blog  : https://watcherding.github.io
 *     time  : 2017/6/15
 *     desc  : -----------------
 * </pre>
 */
public class MainActivity extends BaseActivity<TestPresenter> implements TestContract.View {
    private RxPermissions mRxPermissions;

    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        this.mRxPermissions = new RxPermissions(this);
        DaggerTestcComponent
                .builder()
                .appComponent(appComponent)
                .testModule(new TestModule(this))
                .build()
                .inject(this);

    }

    @Override
    public int initView(Bundle savedInstanceState) {
        return R.layout.activity_main;
    }

    @Override
    public void initData(Bundle savedInstanceState) {

    }


    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void launchActivity(Intent intent) {

    }

    @Override
    public void killMyself() {

    }


}
