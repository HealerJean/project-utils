package com.hlj.java8.Stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Desc: 测试获取Stream

获取流常用的三种方式
1、通过Collection
2、通过Map
3、通过数组

 * @Author HealerJean
 * @Date 2018/9/14  上午11:35.
 */
public class Demo02GetStream {


    @Test
    public void getStream(){

        /**
         *1、通过Collection
         */
        Collection<String> collection = new ArrayList<>();
        Stream<String> stream = collection.stream();
        /**
         * 2、通过Map
         */
        Map<String,Integer> map = new HashMap<>();
        //获取key的stream
        Stream<String> mapKeyStream =  map.keySet().stream() ;
        //获取value的stream
        Stream<Integer> mapValueStream =  map.values().stream() ;
        //获取所有键值对
        Stream<Map.Entry<String,Integer>> entryStream = map.entrySet().stream();

        /**
         * 3、通过数组 推荐使用Arrays.stream 数组也用的不过，String类型最多
         * 或者可以使用快剪辑 alt+enter自动补全
         */
        String[] strings= {"张三丰,刘利"};
        Stream<String> stringStream = Arrays.stream(strings);
        Stream<String> stringStream2 =Stream.of(strings);

        int[] ints= new int[5];
        IntStream intStream = Arrays.stream(ints);
        Stream<int[]> intStream2 = Stream.of(ints);


    }
}
