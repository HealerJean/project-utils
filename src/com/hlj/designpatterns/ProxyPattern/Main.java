package com.hlj.designpatterns.ProxyPattern;

import com.hlj.designpatterns.ProxyPattern.inter.Image;
import com.hlj.designpatterns.ProxyPattern.inter.impl.ProxyImage;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午2:09:09 
 * @Description:
 */
public class Main {
    
   public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");

      //图像将从磁盘加载
      image.display(); 
      System.out.println("");
      //图像将无法从磁盘加载
      image.display();     
   }
}
