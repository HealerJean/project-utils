package com.hlj.designpatterns.AdapterPattern;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 上午11:03:13 
 * @Description: 3、创建实现了 AdvancedMediaPlayer 接口的实体类。

 */
public class VlcPlayer implements AdvancedMediaPlayer{
	   @Override
	   public void playVlc(String fileName) {
	      System.out.println("Playing vlc file. Name: "+ fileName);        
	   }

	   @Override
	   public void playMp4(String fileName) {
	      //什么也不做
	   }
}