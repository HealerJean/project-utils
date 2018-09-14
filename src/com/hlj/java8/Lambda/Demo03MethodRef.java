package com.hlj.java8.Lambda;

import com.hlj.java8.Lambda.Demo03MethodRefPack.PrinterInterface;
import org.junit.Test;

/**
 * java8开始，引入了一个全新的运算符 方法引用符 ::
 *      lambda写法 ： s-> System.out.println(s)
 *      方法引用写法：System.out::println
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo03MethodRef {


    @Test
    public void demo() {
        method(s-> System.out.println(s+"是好人"));
        /**
         * 可推导就是可引用，::方法引用符
         */
        method(System.out::println);

    }

    public void method(PrinterInterface printerInterface){
        printerInterface.print("张宇晋");
    }



}
