package com.hlj.java8.Lambda;

import com.hlj.java8.Lambda.Demo06DelayPack.MsgBuiler;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: lambda延迟执行
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo06Delay {

    @Test
    public void demo(){

        String msgA ="Hello" ;
        String msgB = "你好";

        /**
         * 使用这种方法就白白拼接了
         */
        logger(1,msgA+msgB);


        /**
         * 使用这种方式可以不浪费资源,下面的 msgA+msgB 不会立刻拼接到一起
         */
        MsgBuiler msgBuiler = () -> {
            System.out.println("执行");
            return msgA+msgB;
        };
        loggerLambda(2, msgBuiler);

    }


    private void loggerLambda(int level, MsgBuiler msgBuiler){
        if(level==1){
            System.out.println( msgBuiler.buildMsg());
        }
    }

    /**
     * 日志级别为1的时候，打印信息
     * @param level
     * @param msg
     */
    private void logger(int level ,String msg){
        if(level==1){
            System.out.println(msg);
        }
    }
}
