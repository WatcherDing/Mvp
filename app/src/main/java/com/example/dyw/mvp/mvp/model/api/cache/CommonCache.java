package com.example.dyw.mvp.mvp.model.api.cache;

import com.example.dyw.mvp.mvp.model.entity.BaseJson;
import com.example.dyw.mvp.mvp.model.entity.GItem;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.rx_cache2.DynamicKey;
import io.rx_cache2.EvictProvider;
import io.rx_cache2.LifeCache;
import io.rx_cache2.Reply;

/**
 * <pre>
 *     author: DYW
 *     blog  : https://watcherding.github.io
 *     time  : 2017/6/15
 *     desc  : 数据缓存的设置
 * </pre>
 */
public interface CommonCache {

    @LifeCache(duration = 2, timeUnit = TimeUnit.MINUTES)
    Observable<Reply<BaseJson<List<GItem>>>> getUsers(Observable<BaseJson<List<GItem>>> users);


}
