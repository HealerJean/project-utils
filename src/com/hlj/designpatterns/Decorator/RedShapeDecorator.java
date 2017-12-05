package com.hlj.designpatterns.Decorator;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 下午5:57:56 
 * @Description:
 */
public class RedShapeDecorator extends ShapeDecorator {

	   public RedShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);        
	   }

	   @Override
	   public void draw() {
	      decoratedShape.draw();    //继承的变量还是父类的，不是在本类中       
	      setRedBorder(decoratedShape);
	   }

	   private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }
}