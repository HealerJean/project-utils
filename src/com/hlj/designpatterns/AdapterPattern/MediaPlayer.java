package com.hlj.designpatterns.AdapterPattern;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 上午10:59:00 
 * @Description:1、为媒体播放器和更高级的媒体播放器创建接口。
 */
public interface MediaPlayer {
	   public void play(String audioType, String fileName);
}