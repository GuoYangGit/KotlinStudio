package com.guoyang.android.kotlinstudio


/**
 * Created by guoyang on 2018/2/28.
 * github https://github.com/GuoYangGit
 * QQ:352391291
 */

class People(var name: String){
    override fun equals(other: Any?): Boolean {
        return when (other) {
            !is Person -> false
            else -> this === other ||
                    name == other.name
        }
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}
