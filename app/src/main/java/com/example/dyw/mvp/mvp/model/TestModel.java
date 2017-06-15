package com.example.dyw.mvp.mvp.model;

import com.example.dyw.mvp.mvp.contract.TestContract;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import javax.inject.Inject;

/**
 * <pre>
 *     author: DYW
 *     blog  : https://watcherding.github.io
 *     time  : 2017/6/15
 *     desc  : -----------------
 * </pre>
 */
@ActivityScope
public class TestModel extends BaseModel implements TestContract.Model {

    @Inject
    public TestModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

//    @Override
//    public Observable<List<User>> getUsers(int lastIdQueried, boolean update) {
//        mRepositoryManager.obtainRetrofitService(UserService.class)
//                .getUsers();
//    }


    @Override
    public void onDestroy() {

    }
}
