package com.hlj.designpatterns.FacadePattern;

import com.hlj.designpatterns.FacadePattern.inter.Shape;
import com.hlj.designpatterns.FacadePattern.inter.impl.Circle;
import com.hlj.designpatterns.FacadePattern.inter.impl.Rectangle;
import com.hlj.designpatterns.FacadePattern.inter.impl.Square;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午1:50:17 
 * @Description: 创建一个外观类。
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
