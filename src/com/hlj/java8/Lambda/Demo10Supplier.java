package com.hlj.java8.Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Desc:
 * Ϊ�˸��õ�֧�ֺ���ʽ��̣�
 * һ����� java.util.funtion��
 * Supplier�����Ǹ��ṩ�����
 *
 * get
 *
 *
 * @Author HealerJean
 * @Date 2018/9/14  ����11:48.
 */
public class Demo10Supplier {

    @Test
    public void demo(){
        method(()->"hello");


    }

    /**
     *
     * 1���Ӵ� Supplier
     * @param supplier
     */
    public void method(Supplier<String> supplier){
        String str = supplier.get();
        System.out.println(str);
    }


}
