package com.hlj.java8.Stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/** 并发流的获取和使用,背后使用的是fork/join线程池
 * 如果获取并发流
 * 1、直接获取并发流 list.parallelStream()
 * 2、先获取普通流，然后变成并发的
 * @Desc:
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo11Concurrence {

    @Test
    public void demo(){
        List<String> list = new ArrayList<>();
        list.add("赵丽颖");
        list.add("张宇晋");
        list.add("赵春宇");
        list.add("林铁");
        list.add("杜闯");
        list.add("高彤");
        list.add("张翠翠");
        list.add("张三丰");

        //打印结果随机
        list.parallelStream().forEach(s->{
            System.out.println(s);
        });

        System.out.println("----------");
        list.stream().parallel().forEach(s->{
            System.out.println(s);
        });
    }


}
