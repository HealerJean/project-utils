package com.hlj.java8.Stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo16FindAny {

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


       Optional<String> s =  list.stream().findFirst();

        System.out.println(s.orElse(null));
    }
}
