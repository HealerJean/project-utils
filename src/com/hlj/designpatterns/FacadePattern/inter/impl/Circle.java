package com.hlj.designpatterns.FacadePattern.inter.impl;

import com.hlj.designpatterns.FacadePattern.inter.Shape;


/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午1:49:56 
 * @Description:
 */
public class Circle implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Circle::draw()");
	   }
}
