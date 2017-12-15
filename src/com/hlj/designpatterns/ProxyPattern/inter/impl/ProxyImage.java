package com.hlj.designpatterns.ProxyPattern.inter.impl;

import com.hlj.designpatterns.ProxyPattern.inter.Image;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 下午2:08:31 
 * @Description:
 */
public class ProxyImage implements Image{

	   private RealImage realImage;
	   private String fileName;

	   public ProxyImage(String fileName){
	      this.fileName = fileName;
	   }
 
	   @Override
	   public void display() {
	      if(realImage == null){
	         realImage = new RealImage(fileName);
	      }
	      realImage.display();
	   }
}
