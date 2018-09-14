package com.hlj.java8.Lambda;

import com.hlj.java8.Lambda.Demo02CallbackValuePack.Calculator;
import com.hlj.java8.Lambda.Demo02CallbackValuePack.Cook;
import org.junit.Test;

/**
 * @Desc: 测试我们自己创建接口，已经返回结果
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo02CallbackValue {

    public void sum(Calculator calculator) {
        int result = calculator.add(100, 200);
        System.out.println("结果是" + result);
    }

    @Test
    public void demo() {
        /**
         * 传参的时候，自己会根据上下文自动推倒
         */
        sum((int a, int b) -> {
            return b + a;
        });


        /**
         *  lambda表达式的省略格式
         *  1、参数的类型可以省略，同时省略所有的参数类想，要么都写，要么都不写
         *  2、如果参数有且仅有一个，那么小括号可以省略
         *  3、如果大括号中的语句有且仅有一个，那么无论有没有返回值，return ,大括号，分号，都可以省略
         *
         */
        sum((a, b) -> a + b);

    }


    public void cookTest(Cook cook) {
        cook.makefooe();
    }

    /**
     * 2、 联系省略的格式，无参类型
     *
     * @param cook
     */
    @Test
    public void omidPractice(Cook cook) {
        cookTest(() -> {
            System.out.println(1);
        });

        cookTest(() -> System.out.println("测试"));
    }


    /**
     * 3、lambda 使用前提
     *  3.1、 必须保证只有一个接口，而且其中的抽象方法有且只有一个
     *  3.2、必须具有上下文环境（代理所在的环境），
     *  3.3、根据局部变量的复制来推到lambda借口
     */

    public void environment(){

        Runnable task = ()->{
            System.out.println("测试");
        };
    }




 }



