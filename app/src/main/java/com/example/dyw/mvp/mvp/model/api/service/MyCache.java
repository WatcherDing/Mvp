package com.example.dyw.mvp.mvp.model.api.service;

import com.example.dyw.mvp.mvp.model.api.Api;
import com.example.dyw.mvp.mvp.model.api.cache.CommonCache;
import com.jess.arms.integration.IRepositoryManager;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;
import io.rx_cache2.Reply;

/**
 * <pre>
 *     author: DYW
 *     blog  : https://watcherding.github.io
 *     time  : 2017/6/15
 *     desc  : 封装获取缓存的相同代码
 * </pre>
 */
public class MyCache<T> {
    IRepositoryManager irep;
    T t;

    public MyCache(IRepositoryManager Rep) {
        this.irep = Rep;
    }

    public Observable<T> Get(Observable obs) {

        Function MFunction = new Function<Reply<T>, ObservableSource<T>>() {
            @Override
            public ObservableSource<T> apply(@NonNull Reply<T> tReply) throws Exception {
                return Observable.just(tReply.getData());
            }
        };
        return obs.flatMap(MFunction);
    }

    public CommonCache GetCacheApi() {
        return irep.obtainCacheService(CommonCache.class);
    }

    /**
     * 获取Api
     * @return
     */
    public Api GetAPI() {
        Api api = irep.obtainRetrofitService(Api.class);
        return api;
    }

}
