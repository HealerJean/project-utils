package com.hlj.designpatterns.PrototypePattern;
/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午2:55:57 
 * @Description:
 */
public class Square extends Shape {

	   public Square(){
	     type = "Square";
	   }

	   @Override
	   public void draw() {
	      System.out.println("Inside Square::draw() method.");
	   }
}
