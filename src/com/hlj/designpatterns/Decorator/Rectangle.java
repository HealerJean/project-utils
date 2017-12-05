package com.hlj.designpatterns.Decorator;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 下午5:56:48 
 * @Description:
 */
public class Rectangle implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Shape: Rectangle");
	   }
}