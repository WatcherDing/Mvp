package com.example.dyw.mvp.mvp.presenter;

import com.example.dyw.mvp.di.module.TestModule;
import com.example.dyw.mvp.mvp.contract.TestContract;
import com.example.dyw.mvp.mvp.ui.MainActivity;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;

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
public class TestPresenter extends BasePresenter<TestContract.Model, TestContract.View> implements TestContract.Presenter {

    @Inject
    public TestPresenter(TestContract.View view,TestContract.Model mode) {
        //super(model, rootView);
    }

    //这里定义业务方法,相应用户的交互
    public void requestUsers(final boolean pullToRefresh) {
//        @Override
//        public Observable<List<User>> getUsers(int lastIdQueried, boolean update) {
//            Observable<List<User>> users = mRepositoryManager.obtainRetrofitService(UserService.class)
//                    .getUsers(lastIdQueried, USERS_PER_PAGE);
//            //使用rxcache缓存,上拉刷新则不读取缓存,加载更多读取缓存
//            return mRepositoryManager.obtainCacheService(CommonCache.class)
//                    .getUsers(users
//                            , new DynamicKey(lastIdQueried)
//                            , new EvictDynamicKey(update))
//                    .flatMap(new Function<Reply<List<User>>, ObservableSource<List<User>>>() {
//                        @Override
//                        public ObservableSource<List<User>> apply(@NonNull Reply<List<User>> listReply) throws Exception {
//                            return Observable.just(listReply.getData());
//                        }
//                    });
//        }
    }

}
