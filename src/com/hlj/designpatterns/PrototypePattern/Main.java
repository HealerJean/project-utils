package com.hlj.designpatterns.PrototypePattern;
/** 
 * @author : HealerJean
 * @date   �� 2017��12��15�� ����2:56:56 
 * @Description:
 */
public class Main {
	
		   public static void main(String[] args) {
		      ShapeCache.loadCache();

		      Shape clonedShape = (Shape) ShapeCache.getShape("1");
		      System.out.println("Shape : " + clonedShape.getType());        

		      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		      System.out.println("Shape : " + clonedShape2.getType());        

		      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		      System.out.println("Shape : " + clonedShape3.getType());        
		   }
}
