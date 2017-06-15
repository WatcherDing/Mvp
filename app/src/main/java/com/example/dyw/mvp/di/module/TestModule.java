package com.example.dyw.mvp.di.module;

import com.example.dyw.mvp.mvp.contract.TestContract;
import com.example.dyw.mvp.mvp.model.TestModel;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * <pre>
 *     author: DYW
 *     blog  : https://watcherding.github.io
 *     time  : 2017/6/15
 *     desc  : -----------------
 * </pre>
 */

@Module
public class TestModule {
    private TestContract.View view;
    /**
     * 构建UserModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     * @param view
     */
    public TestModule(TestContract.View view) {
        this.view = view;
    }
    @ActivityScope
    @Provides
    TestContract.View provideUserView(){
        return this.view;
    }

    @ActivityScope
    @Provides
    TestContract.Model provideUserModel(TestModel model){
        return model;
    }
}
