package com.hlj.HashCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author HealerJean
 * @Date 2018/4/12  ����11:46.
 */
public class MapMain {

    public static void main(String[] args) {
        Map <Object,Object> map = new HashMap<>();

        Object o = new Object();
        Object o2 = new Object();

        map.put(o,"Stromg");
        map.put(o2,3);


        System.out.println(map.get(o));
        System.out.println(map.get(o2));

        o = 456; //����һ�����͸ı��ˣ����ò���ֵ��
        System.out.println(map.get(o));



        Person person = new Person(); //����new����֮�󣬶���û�з��͸ı�
        person.setAge(1);
        map.put(person,3);
        System.out.println(map.get(person));
        person.setName("HealerJean");
        System.out.println(map.get(person));


    }
}
