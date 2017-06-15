package com.example.dyw.mvp.mvp.model.entity;

import com.example.dyw.mvp.mvp.model.api.Api;
import com.google.gson.annotations.SerializedName;

/**
 * <pre>
 *     author: DYW
 *     blog  : https://watcherding.github.io
 *     time  : 2017/6/15
 *     desc  : -----------------
 * </pre>
 */
public class BaseJson<T> {

    @SerializedName(value = "results", alternate = {""})
    private T data;
    @SerializedName("count")
    private String code;
    @SerializedName("error")
    private String msg;

    public T getData() {
        return data;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    /**
     * 请求是否成功
     * @return
     */
    public boolean isSuccess() {
        if (code.equals(Api.RequestSuccess)) {
            return true;
        } else {
            return false;
        }
    }
}