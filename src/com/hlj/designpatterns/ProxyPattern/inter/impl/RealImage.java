package com.hlj.designpatterns.ProxyPattern.inter.impl;

import com.hlj.designpatterns.ProxyPattern.inter.Image;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午2:07:52 
 * @Description:
 */
public class RealImage implements Image {

	   private String fileName;

	   public RealImage(String fileName){
	      this.fileName = fileName;
	      loadFromDisk(fileName);
	   }

	   @Override
	   public void display() {
	      System.out.println("Displaying " + fileName);
	   }

	   private void loadFromDisk(String fileName){
	      System.out.println("Loading " + fileName);
	   }
}
