package com.hlj.java8.Stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Desc:
 * Stream 当中收集集合需要用到collect方法，方法的参数是一个Collector接口
 * Collector接口通常不需要自己实现，借助工具类中的  Collectors.toList() Collectors.toSet() 即可
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo12Collect {

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

        List<String> listResult =   list.stream().collect(Collectors.toList());

        Set<String> set =           list.stream().collect(Collectors.toSet());

    }
}
