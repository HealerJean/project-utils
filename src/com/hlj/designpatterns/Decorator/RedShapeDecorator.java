package com.hlj.designpatterns.Decorator;
/** 
 * @author : HealerJean
 * @date   �� 2017��11��21�� ����5:57:56 
 * @Description:
 */
public class RedShapeDecorator extends ShapeDecorator {

	   public RedShapeDecorator(Shape decoratedShape) {
	      super(decoratedShape);        
	   }

	   @Override
	   public void draw() {
	      decoratedShape.draw();    //�̳еı������Ǹ���ģ������ڱ�����       
	      setRedBorder(decoratedShape);
	   }

	   private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	   }
}