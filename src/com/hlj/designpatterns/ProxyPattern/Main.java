package com.hlj.designpatterns.ProxyPattern;

import com.hlj.designpatterns.ProxyPattern.inter.Image;
import com.hlj.designpatterns.ProxyPattern.inter.impl.ProxyImage;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��15�� ����2:09:09 
 * @Description:
 */
public class Main {
    
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");

      //ͼ�񽫴Ӵ��̼���
      image.display(); 
      System.out.println("");
      //ͼ���޷��Ӵ��̼���
      image.display();     
   }
}
