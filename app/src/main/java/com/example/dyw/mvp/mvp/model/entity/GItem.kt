package com.example.dyw.mvp.mvp.model.entity

import com.google.gson.annotations.SerializedName

/**
 * <pre>
 * author: DYW
 * blog  : https://watcherding.github.io
 * time  : 2017/6/15
 * desc  : -----------------
</pre> *
 */
class GItem {
    @SerializedName("desc")
    var desc: String? = null
    @SerializedName("ganhuo_id")
    var ganhuoId: String? = null
    @SerializedName("publishedAt")
    var publishedAt: String? = null
    @SerializedName("readability")
    var readability: String? = null
    @SerializedName("type")
    var type: String? = null
    @SerializedName("url")
    var url: String? = null
    @SerializedName("who")
    var who: String? = null
}
