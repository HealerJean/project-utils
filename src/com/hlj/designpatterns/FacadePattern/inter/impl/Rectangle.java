package com.hlj.designpatterns.FacadePattern.inter.impl;

import com.hlj.designpatterns.FacadePattern.inter.Shape;


/** 
 * @author : HealerJean
 * @date   �� 2017��12��15�� ����1:49:08 
 * @Description:
 */
public class Rectangle implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Rectangle::draw()");
	   }

}
