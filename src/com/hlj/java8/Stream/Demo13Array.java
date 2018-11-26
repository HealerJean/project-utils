package com.hlj.java8.Stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Desc:解决泛型数组的限制
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo13Array {

    @Test
    public void demo(){

        Stream<String> stream = Stream.of("aaa","BBB","CCC");
        String[] strings = stream.toArray(String[]::new);//数组的构造器引用 和zMap中的Person::new有点像

        //数据转换为集合
        String[] arrays = new String[]{"a", "b", "c"};
        List<String> list = Arrays.stream(arrays).collect(Collectors.toList());


        //集合转换为数组
        strings = list.stream().toArray(String[]::new);

    }
}
