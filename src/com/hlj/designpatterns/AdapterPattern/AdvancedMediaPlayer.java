package com.hlj.designpatterns.AdapterPattern;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 上午10:59:49 
 * @Description:2、 AdvancedMediaPlayer
 */
public interface AdvancedMediaPlayer {    
	   public void playVlc(String fileName);
	   public void playMp4(String fileName);
}