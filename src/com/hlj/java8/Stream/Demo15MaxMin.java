package com.hlj.java8.Stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/9/14  ионГ11:48.
 */
public class Demo15MaxMin {

    @Test
    public void demo(){

        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);

        Optional<Long> max = list.stream().max((o1, o2)->o1.compareTo(o2));
        System.out.println(max);
    }
}
