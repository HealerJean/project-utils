package com.hlj.designpatterns.PrototypePattern;
/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午2:56:11 
 * @Description:
 */
public class Circle extends Shape {

	   public Circle(){
	     type = "Circle";
	   }

	   @Override
	   public void draw() {
	      System.out.println("Inside Circle::draw() method.");
	   }
}
