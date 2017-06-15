package com.example.dyw.mvp.mvp.model.entity

/**
 * <pre>
 * author: DYW
 * blog  : https://watcherding.github.io
 * time  : 2017/6/15
 * desc  : Kotlin Base 类
</pre> *
 */
class User(val id: Int, val login: String, private val avatar_url: String) {

    val avatarUrl: String
        get() {
            if (StringUtils.isEmpty(avatar_url)) return avatar_url
            return "";
            //return avatar_url.split("\\?".toRegex()).dropLastWhile({ it.isEmpty() }).toTypedArray()[0]
        }

    override fun toString(): String {
        return "id -> $id login -> $login"
    }
    object StringUtils {
        //@JvmStatic
        fun isEmpty(str: String): Boolean {
            return "" == str
        }

        fun isEmpty2(str: String): Boolean {
            return "" == str
        }
    }
}