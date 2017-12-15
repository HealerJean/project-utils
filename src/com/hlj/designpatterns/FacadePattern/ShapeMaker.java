package com.hlj.designpatterns.FacadePattern;

import com.hlj.designpatterns.FacadePattern.inter.Shape;
import com.hlj.designpatterns.FacadePattern.inter.impl.Circle;
import com.hlj.designpatterns.FacadePattern.inter.impl.Rectangle;
import com.hlj.designpatterns.FacadePattern.inter.impl.Square;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��15�� ����1:50:17 
 * @Description: ����һ������ࡣ
 */
public class ShapeMaker {
	   private Shape circle;
	   private Shape rectangle;
	   private Shape square;

	   public ShapeMaker() {
	      circle = new Circle();
	      rectangle = new Rectangle();
	      square = new Square();
	   }

	   public void drawCircle(){
	      circle.draw();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   public void drawSquare(){
	      square.draw();
	   }
}
