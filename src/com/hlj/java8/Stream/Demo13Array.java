package com.hlj.java8.Stream;

import com.hlj.Arraylist.ArraylistTest;
import com.hlj.arithmetic.Array;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
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



    }
}
