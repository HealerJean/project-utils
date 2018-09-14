package com.hlj.java8.Stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: limit 获取执行结果的前几个 ,，返回值为Stream
 * 功能：获取长度等于2的前两个
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo04Limit {

    @Test
    public void limit(){
        List<String> list = new ArrayList<>();
        list.add("赵丽颖");
        list.add("张宇晋");
        list.add("赵春宇");
        list.add("林铁");
        list.add("杜闯");
        list.add("高彤");
        list.add("张翠翠");
        list.add("张三丰");

        list.stream().filter(s->s.length()==2).limit(2).forEach(s -> {
            System.out.println(s);
        });

        /**
         林铁
         杜闯
         */
    }
}
