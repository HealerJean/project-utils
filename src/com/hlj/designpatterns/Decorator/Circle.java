package com.hlj.designpatterns.Decorator;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 下午5:57:08 
 * @Description:
 */
public class Circle implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Shape: Circle");
	   }
}