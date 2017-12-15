package com.hlj.designpatterns.FacadePattern;
/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午1:50:51 
 * @Description:
 */
public class Main {
	
		   public static void main(String[] args) {
		      ShapeMaker shapeMaker = new ShapeMaker();

		      shapeMaker.drawCircle();
		      shapeMaker.drawRectangle();
		      shapeMaker.drawSquare();        
		   }
}
