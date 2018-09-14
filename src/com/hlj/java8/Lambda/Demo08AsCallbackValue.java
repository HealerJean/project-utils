package com.hlj.java8.Lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Desc:
 * @Author HealerJean
 * @Date 2018/9/14  上午11:48.
 */
public class Demo08AsCallbackValue {

    @Test
    public void demo(){

        String[] array = {"abc","a","aaa","b"};

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        /**
         * lambdz作为返回值
         */
        Arrays.sort(array,getComparatorOne());

        System.out.println(Arrays.toString(array));
    }


    private static Comparator<String> getComparatorOne(){
        Comparator<String> comparator = (o1,o2) -> o1.length()-o2.length();
        return comparator ;
    }

    private static Comparator<String> getComparatorTwo(){
        return (o1,o2) -> o1.length()-o2.length() ;
    }
}
