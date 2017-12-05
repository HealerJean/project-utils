package com.hlj.designpatterns.Decorator;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 下午5:57:32 
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

