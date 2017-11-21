package com.hlj.designpatterns.AdapterPattern;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 上午11:05:44 
 * @Description:5、
 */
public class MediaAdapter implements MediaPlayer {

	   AdvancedMediaPlayer advancedMusicPlayer;

	   public MediaAdapter(String audioType){
	      if(audioType.equalsIgnoreCase("vlc") ){
	         advancedMusicPlayer = new VlcPlayer();            
	      } else if (audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer = new Mp4Player();
	      }    
	   }

	   @Override
	   public void play(String audioType, String fileName) {
	      if(audioType.equalsIgnoreCase("vlc")){
	         advancedMusicPlayer.playVlc(fileName);
	      }else if(audioType.equalsIgnoreCase("mp4")){
	         advancedMusicPlayer.playMp4(fileName);
	      }
	   }
	}