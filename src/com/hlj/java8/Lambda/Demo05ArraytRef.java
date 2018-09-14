package com.hlj.java8.Lambda;

import com.hlj.java8.Lambda.Demo05ArraytRefPack.ArrayBuilerInterface;
import org.junit.Test;


/**
 * @Desc: 数组的构造器 引用
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo05ArraytRef {


    /**
     * 目的只是为了得到一个数组，其实很浮夸了
     */
    @Test
    public void demo(){
        method(int[]::new);

        //和下面这个一样
        method(s-> new int[s]);


    }


    public void method(ArrayBuilerInterface builerInterface){
      int [] n = builerInterface.build(10);
    }


}
