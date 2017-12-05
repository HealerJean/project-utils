package com.hlj.designpatterns.Decorator;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 下午5:58:25 
 * @Description:
 */
public class TestMain {
	
	   public static void main(String[] args) {
	      Shape circle = new Circle();

	      Shape redCircle = new RedShapeDecorator(new Circle());

	      Shape redRectangle = new RedShapeDecorator(new Rectangle());
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("\nCircle of red border");
	      redCircle.draw();

	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();
	   }
}