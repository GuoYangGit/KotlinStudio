package com.guoyang.android.kotlinstudio

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Day2Activity : AppCompatActivity() {
    val TAG = "Day2Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day2)

        //基本数据类型
        val string: String = "1"
        val int: Int = 1
        val double: Double = 1.0
        val float: Float = 1f
        val boolean: Boolean = false
        Log.e(TAG, "String:" + string + " Int:" + int + " Double:" + double + " Float:" + float + " Boolean:" + boolean)

        //使用字符串模版
        Log.e(TAG, "String:$string Int:$int Double:$double Float:$float Boolean:$boolean")

        val num1 = 1
        val num2 = 2
        //比如我们要进行数据相加，我们可以使用大括号来括起来运算逻辑 结果为:3
        Log.e(TAG, "sum:${num1 + num2}")
        //或者我们要进行字符串拼接 结果为:14
        Log.e(TAG, "String:${string}4")
        //有的人肯定会问，如果我要打印或者输出$符号怎么办，简单，我们可以再多加一个$符 结果为:$1
        Log.e(TAG, "money:$$num1")
        //那有人又会问了，如果我想输出字符串"$num1"怎么办(但是上面num1已经被定义过了)，照样简单，使用\转译符 结果为:$num1
        Log.e(TAG, "money:\$num1")

        //类型转换
        //int->string
        val num: Int = 1
        num.toString()

        val num3: String = "1"

        num3.toInt()

        //== 与 ===
        //与 Java 相同，Any.equals() 函数比较的是两个对象的引用是否相等。
        //也就是说，如果没有覆盖 equals() 函数，== 与 === 的结果是相同的。
        //如果某个类有比较属性是否相等的需求，需要自行覆盖 equals() 方法。
        val people1 = People("zhangsan")
        val people2 = People("zhangsan")
        //使用==来判断
        Log.e(TAG, "people1 == people2:${people1 == people2}")
        //使用===来判断
        Log.e(TAG, "people1 === people2:${people1 === people2}")

        //空安全
        //当变量初始化时赋值为null，在申明时候必须在类型后面加上?，不然编译不通过
        var array: Array<String>? = null
        //当变量为null时，在使用该变量时必须进行非空判断，不然编译不通过
        val length: (Array<String>?) -> Int = { it?.size ?: 0 }
        Log.e(TAG, "strleng:${length(array)}")

        //kotlin中的三木运算
        Log.e(TAG, "strleng:${if (array == null) 0 else array.size}")
        //再次简化
        Log.e(TAG, "strleng:${array?.size ?: 0}")

        //数组与集合
        //int类型数组
        val arrayInt: IntArray = intArrayOf(0, 1, 2)
        //输出结果：0
        Log.e(TAG, "arrayInt:${arrayInt[0]}")
        //string类型数组
        val arrayString: Array<String> = arrayOf("xiaoming", "zhangsan", "lisi")
        //输出结果："xiaoming"
        Log.e(TAG, "arrayString:${arrayString[0]}")
        //int类型集合
        val arrayIntList: List<Int> = listOf(0, 1, 2)
        Log.e(TAG, "arrayIntList:${arrayIntList[0]}")
        //string类型集合
        val arrayStringList: List<String> = listOf("xiaoming", "zhangsan", "lisi")
        Log.e(TAG, "arrayStringList:${arrayStringList[0]}")
        //for循环
        for (s in arrayString) {
            Log.e(TAG, "s in arrayString:$s")
        }

        //区间
        //IntRange()为int区间函数
        val intRange = IntRange(0, 3)
        for (i in intRange) {
            //输出结果：0，1，2，3
            Log.e(TAG, "IntRange:$i")
        }
        //IntRange() -> ..
        val intRange1 = 0..3
        for (i in intRange1) {
            //输出结果：0，1，2，3
            Log.e(TAG, "IntRange:$i")
        }
        //0..3 -> 0 until 3-1
        val intRange2 = 0 until 3
        for (i in intRange2) {
            //输出结果：0，1，2
            Log.e(TAG, "IntRange:$i")
        }

        //lamda
        //先创建一个string数组
        val strArray: Array<String> = arrayOf("zhangsan", "", "", "xiaoming")
        //使用kotlin的filter操作符配合上篇讲的lamda表达式来踢出空的数据，最后使用map操作符来遍历，并且log打印出来
        strArray.filter { str -> str.isNotEmpty() }
                .map { str ->
                    //结果："zhangsan"，"xiaoming"
                    Log.e(TAG, "str:$str")
                }
        //省去 -> 加上前面的参数，直接编写返回值代码，需要用到参数用it来代替
        strArray.filter { it.isNotEmpty() }
                .map {
                    //结果："zhangsan"，"xiaoming"
                    Log.e(TAG, "str:$it")
                }

        //when
        val number = 1
        when(number) {
            1 -> Log.e(TAG,"is 1")
            2 -> Log.e(TAG,"is 2")
            in 1..3 -> Log.e(TAG,"in 1..3")

        }
    }
}
