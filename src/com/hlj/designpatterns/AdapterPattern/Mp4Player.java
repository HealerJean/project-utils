package com.hlj.designpatterns.AdapterPattern;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 上午11:04:22 
 * @Description:4、
 */
public class Mp4Player implements AdvancedMediaPlayer{

	   @Override
	   public void playVlc(String fileName) {
	      //什么也不做
	   }

	   @Override
	   public void playMp4(String fileName) {
	      System.out.println("Playing mp4 file. Name: "+ fileName);        
	   }
}