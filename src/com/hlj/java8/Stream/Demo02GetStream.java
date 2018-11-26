package com.hlj.java8.Stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Desc: ���Ի�ȡStream

��ȡ�����õ����ַ�ʽ
1��ͨ��Collection
2��ͨ��Map
3��ͨ������

 * @Author HealerJean
 * @Date 2018/9/14  ����11:35.
 */
public class Demo02GetStream {


    @Test
    public void getStream(){

        /**
         *1��ͨ��Collection
         */
        Collection<String> collection = new ArrayList<>();
        Stream<String> stream = collection.stream();
        /**
         * 2��ͨ��Map
         */
        Map<String,Integer> map = new HashMap<>();
        //��ȡkey��stream
        Stream<String> mapKeyStream =  map.keySet().stream() ;
        //��ȡvalue��stream
        Stream<Integer> mapValueStream =  map.values().stream() ;
        //��ȡ���м�ֵ��
        Stream<Map.Entry<String,Integer>> entryStream = map.entrySet().stream();

        /**
         * 3��ͨ������ �Ƽ�ʹ��Arrays.stream ����Ҳ�õĲ�����String�������
         * ���߿���ʹ�ÿ���� alt+enter�Զ���ȫ
         */
        String[] strings= {"������,����"};
        Stream<String> stringStream = Arrays.stream(strings);
        Stream<String> stringStream2 =Stream.of(strings);

        int[] ints= new int[5];
        IntStream intStream = Arrays.stream(ints);
        Stream<int[]> intStream2 = Stream.of(ints);


    }
}
