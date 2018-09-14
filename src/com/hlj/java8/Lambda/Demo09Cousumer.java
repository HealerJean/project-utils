package com.hlj.java8.Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *  Consumer在 stream中相当于是 ForEach()中执行
 * @Desc:  Consumer 是我们进行消费掉传入的参数
 *
 * accept andThen
 *
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo09Cousumer {

    @Test
    public void demo(){
        method(s->System.out.println(s));
    }

    /**
     *
     * @param function
     */
    public void method(Consumer<String> function){
        function.accept("hello");
    }


    /**
     * 第一个打印大写字母，第二个打印小写
     */
    @Test
    public void demo2(){
        method2(s->System.out.println(s.toUpperCase()),s2-> System.out.println(s2.toLowerCase()));
    }
    public void method2(Consumer<String> one,Consumer<String> two){
        //下面这个表示先执行one，再执行two
        one.andThen(two).accept("hellow");
    }



}
