package com.example.dyw.mvp.di.component;

import com.example.dyw.mvp.di.module.TestModule;
import com.example.dyw.mvp.mvp.ui.MainActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Component;

/**
 * <pre>
 *     author: DYW
 *     blog  : https://watcherding.github.io
 *     time  : 2017/6/15
 *     desc  : -----------------
 * </pre>
 */

@ActivityScope
@Component(modules = TestModule.class,dependencies = AppComponent.class)
public interface TestcComponent {
    void inject(MainActivity activity);
}