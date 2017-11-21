package com.hlj.designpatterns.AdapterPattern;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 上午11:07:39 
 * @Description:
 */
public class TestMain {
	  public static void main(String[] args) {
	      AudioPlayer audioPlayer = new AudioPlayer();

	      audioPlayer.play("mp3", "beyond the horizon.mp3");
	      audioPlayer.play("mp4", "alone.mp4");
	      audioPlayer.play("vlc", "far far away.vlc");
	      audioPlayer.play("avi", "mind me.avi");
	   }
}
