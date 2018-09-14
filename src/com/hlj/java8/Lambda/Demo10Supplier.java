package com.hlj.java8.Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Desc:
 * 为了更好的支持函数式编程，
 * 一般放在 java.util.funtion中
 * Supplier是我们给提供，结果
 *
 * get
 *
 *
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo10Supplier {

    @Test
    public void demo(){
        method(()->"hello");


    }

    /**
     *
     * 1、接触 Supplier
     * @param supplier
     */
    public void method(Supplier<String> supplier){
        String str = supplier.get();
        System.out.println(str);
    }


}
