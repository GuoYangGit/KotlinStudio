package com.guoyang.android.kotlinstudio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Day1Activity : AppCompatActivity() {
    val TAG = "Day1Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //基本数据类型
        val string: String = "1"
        val int: Int = 1
        val double: Double = 1.0
        val float: Float = 1f
        val boolean: Boolean = false

//        e("String:" + string + " Int:" + int + " Double:" + double + " Float:" + float + " Boolean:" + boolean)

        e("add:" + sum)
    }

    //log函数
    fun e(message: String) = Log.e(TAG, message)

    //两数相加函数
    fun add(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    //简化函数，如果大括号里面只有一行代码可以去除大括号
    fun add1(number1: Int, number2: Int) = number1 + number2

    //函数可以作为变量
    val sum = fun(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    //同样可以简化
    val sum1 = fun(number1: Int, number2: Int) = number1 + number2

    //两数相加函数 lambda
    val lamdba = { number1: Int, number2: Int -> number1 + number2 }

}

