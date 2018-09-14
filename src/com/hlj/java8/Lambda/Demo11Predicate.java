package com.hlj.java8.Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *  Predicate stream中相当于是 filter()中执行
 * @Desc: Predicate 对指定类型的对象进行操作，得到的是一个boolean的结果
 *
 * test and or negate
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo11Predicate {

    @Test
    public void demo(){
        method(s->s.length()>3);
    }


    public void method(Predicate<String> predicate){
      boolean vertlong =    predicate.test("hello");
        System.out.println("长不长"+vertlong);
    }

    /**
     * Predicate 拼接  and两个同时成立 ，or不写
     */
    @Test
    public void demo2(){
        method2(one->one.length()>3,two->two.startsWith("h"));
    }
    public void method2(Predicate<String> one,Predicate<String> two){
        boolean vertlong  =  one.and(two).test("hello");
        System.out.println("长不长"+vertlong);

    }

    /**
     * negate 取反  如果是true，返回取反就是false
     */
    @Test
    public void demo3(){
        method3(s-> s.length()>3);
    }
    public void method3(Predicate<String> predicate){
        boolean vertlong =   predicate.negate().test("hello");
        System.out.println("长不长"+vertlong);
    }





}
