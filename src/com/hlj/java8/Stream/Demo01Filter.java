package com.hlj.java8.Stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Desc: for 循环遍历不太好，for循环是形式
 * 贫穷限制了我的想象力，for循环不是进行过滤的必要手段，stream进行过滤

流式思想：

 * @Author HealerJean
 * @Date 2018/9/14  上午11:09.
 */
public class Demo01Filter {

    /**
     * 1、 filter 过滤 ，返回值为Stream
     * 功能： 查找到list中长度等于3 并且是以 张开头的
     * 解答：1、filter 参数是一个predicate 断言 也就是能产生boolean结果的过滤规则,
     *      2、stream是一次使用的，阅后即焚
     *      3、stream方法会返回方法本身
     */
    @Test
    public  void filter(){
        List<String> list = new ArrayList<>();
        list.add("赵丽颖");
        list.add("张宇晋");
        list.add("赵春宇");
        list.add("林铁");
        list.add("杜闯");
        list.add("高彤");
        list.add("张翠翠");
        list.add("张三丰");


        list.stream().filter((String s) -> {return s.length() == 3 ;} )
                .filter(s -> s.startsWith("张"))
                .forEach(s -> {
                    System.out.println(s);
                });
        System.out.println("---------------");



        Stream<String> stream =  list.stream().filter(s -> s.length() == 3)
                .filter(s -> s.startsWith("张"));



    }




}
