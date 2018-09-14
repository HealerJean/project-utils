package com.hlj.java8.Stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Desc:Concat  Stream.concat 可以可以将两个集合合并成一个整体
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo07Concat {

    @Test
    public void demo(){
        List<String> listOne = new ArrayList<>();
        listOne.add("高彤");
        listOne.add("张翠翠");
        listOne.add("张三丰");

        List<String> listTwo = new ArrayList<>();
        listTwo.add("赵丽颖");
        listTwo.add("张宇晋");
        listTwo.add("赵春宇");
        listTwo.add("林铁");
        listTwo.add("杜闯");

       Stream.concat(listOne.stream(),listTwo.stream() ).forEach(s->{
            System.out.println(s);
        });

        /**
         高彤
         张翠翠
         张三丰
         赵丽颖
         张宇晋
         赵春宇
         林铁
         杜闯
         */


    }
}
