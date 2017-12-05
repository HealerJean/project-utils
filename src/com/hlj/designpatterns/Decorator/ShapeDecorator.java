package com.hlj.designpatterns.Decorator;
/** 
 * @author : HealerJean
 * @date   �� 2017��11��21�� ����5:57:32 
 * @Description:
 */
public abstract class ShapeDecorator implements Shape {
	   protected Shape decoratedShape;

	   public ShapeDecorator(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   public void draw(){
	      decoratedShape.draw();
	   }    
}

