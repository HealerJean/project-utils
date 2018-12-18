package com.hlj.java8.Stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 ：HealerJean
 * 日期 ：2018/11/7  下午2:55.
 * 类描述： sorted 排序
 */
public class Demo17Sorted {

    @Test
    public  void sorted() {
        List<String> list = new ArrayList<>();
        list.add("赵丽颖");
        list.add("张宇晋");
        list.add("赵春宇");
        list.add("林铁");
        list.add("杜闯");
        list.add("高彤");
        list.add("张翠翠");
        list.add("张三丰");
        list.stream().sorted().forEach(System.out::print);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(1);
        integerList.add(2);

        integerList.stream().sorted().forEach(System.out::print);

    }
}
