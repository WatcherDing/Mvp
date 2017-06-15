package com.example.dyw.mvp.mvp.model;

import com.example.dyw.mvp.mvp.contract.TestContract;
import com.example.dyw.mvp.mvp.model.api.service.MyCache;
import com.example.dyw.mvp.mvp.model.entity.BaseJson;
import com.example.dyw.mvp.mvp.model.entity.GItem;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.rx_cache2.Reply;

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

    @Override
    public Observable<BaseJson<List<GItem>>> getGankIO() {
        MyCache  myCache= new MyCache<Reply<BaseJson<List<GItem>>>>(mRepositoryManager);
        Observable obs=  myCache.GetAPI().getUsers();
        Observable users = myCache.GetCacheApi().getUsers(obs);

        return myCache.Get(users);
    }


}
