package com.hlj.designpatterns.PrototypePattern;
/** 
 * @author : HealerJean
 * @date   �� 2017��12��15�� ����2:54:54 
 * @Description:
 */
public class Rectangle extends Shape {

	   public Rectangle(){
	     this.type = "Rectangle";
	   }

	   @Override
	   public void draw() {
	      System.out.println("Inside Rectangle::draw() method.");
	   }
}
