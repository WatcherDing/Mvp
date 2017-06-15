package com.example.dyw.mvp.mvp.model.api;

import com.example.dyw.mvp.mvp.model.entity.BaseJson;
import com.example.dyw.mvp.mvp.model.entity.GItem;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * <pre>
 *     author: DYW
 *     blog  : https://watcherding.github.io
 *     time  : 2017/6/15
 *     desc  : 数据访问网络的链接存放
 * </pre>
 */
public interface Api {
    String BASE_URL = "http://gank.io/api/search/query/listview/category/Android/count/10/page/";

    String RequestSuccess = "0";

    @GET("1")
    Observable<BaseJson<List<GItem>>> getUsers();
}
