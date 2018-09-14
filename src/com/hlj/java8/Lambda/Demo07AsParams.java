package com.hlj.java8.Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: lambad 作为参数
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo07AsParams {

    @Test
    public void demo(){
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

        new Thread(()->{

        });

    }
}
