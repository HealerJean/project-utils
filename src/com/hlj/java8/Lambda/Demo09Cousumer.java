package com.hlj.java8.Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *  Consumer�� stream���൱���� ForEach()��ִ��
 * @Desc:  Consumer �����ǽ������ѵ�����Ĳ���
 *
 * accept andThen
 *
 * @Author HealerJean
 * @Date 2018/9/14  ����11:48.
 */
public class Demo09Cousumer {

    @Test
    public void demo(){
        method(s->System.out.println(s));
    }

    /**
     *
     * @param function
     */
    public void method(Consumer<String> function){
        function.accept("hello");
    }


    /**
     * ��һ����ӡ��д��ĸ���ڶ�����ӡСд
     */
    @Test
    public void demo2(){
        method2(s->System.out.println(s.toUpperCase()),s2-> System.out.println(s2.toLowerCase()));
    }
    public void method2(Consumer<String> one,Consumer<String> two){
        //���������ʾ��ִ��one����ִ��two
        one.andThen(two).accept("hellow");
    }



}
