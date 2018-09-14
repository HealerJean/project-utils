package com.hlj.java8.Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @Desc: Function 相当于stram中的map
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo12Function {

    @Test
    public void demo(){
        method(s -> Integer.parseInt(s));

        method( Integer::parseInt);
    }

    /**
     * apply Integer是表示出的结果
     * @param function
     */
    public void method(Function<String ,Integer> function){
      int num =    function.apply("20");
      num += 100;
        System.out.println("结果是"+num);
    }



}
