package com.hlj.designpatterns.FacadePattern;
/** 
 * @author : HealerJean
 * @date   �� 2017��12��15�� ����1:50:51 
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
