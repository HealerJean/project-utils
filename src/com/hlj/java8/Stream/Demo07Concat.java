package com.hlj.java8.Stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Desc:Concat  Stream.concat ���Կ��Խ��������Ϻϲ���һ������
 * @Author HealerJean
 * @Date 2018/9/14  ����11:48.
 */
public class Demo07Concat {

    @Test
    public void demo(){
        List<String> listOne = new ArrayList<>();
        listOne.add("��ͮ");
        listOne.add("�Ŵ��");
        listOne.add("������");

        List<String> listTwo = new ArrayList<>();
        listTwo.add("����ӱ");
        listTwo.add("�����");
        listTwo.add("�Դ���");
        listTwo.add("����");
        listTwo.add("�Ŵ�");

       Stream.concat(listOne.stream(),listTwo.stream() ).forEach(s->{
            System.out.println(s);
        });

        /**
         ��ͮ
         �Ŵ��
         ������
         ����ӱ
         �����
         �Դ���
         ����
         �Ŵ�
         */


    }
}
