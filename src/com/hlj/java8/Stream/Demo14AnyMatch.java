package com.hlj.java8.Stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: anyMatch 匹配任一元素 allMatch匹配所有元素 noneMatch 不匹配的所有元素
 *          返回值 为true false
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo14AnyMatch {

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


        System.out.println(list.stream().anyMatch(s->s.startsWith("张")));
        System.out.println("-------------");
        System.out.println(list.stream().allMatch(s->s.startsWith("张")));
        System.out.println("-------------");
        System.out.println(!list.stream().noneMatch(s->s.equals("张三丰")));


    }
}
