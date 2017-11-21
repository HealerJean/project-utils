package com.hlj.designpatterns.AdapterPattern;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 上午11:07:06 
 * @Description: 音频播放器，包含所有的视频
 */
public class AudioPlayer implements MediaPlayer {
	   MediaAdapter mediaAdapter; 

	   @Override
	   public void play(String audioType, String fileName) {        

	      //播放 mp3 音乐文件的内置支持
	      if(audioType.equalsIgnoreCase("mp3")){
	         System.out.println("Playing mp3 file. Name: "+ fileName);            
	      } 
	      //mediaAdapter 提供了播放其他文件格式的支持
	      else if(audioType.equalsIgnoreCase("vlc") 
	         || audioType.equalsIgnoreCase("mp4")){
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      }
	      else{
	         System.out.println("Invalid media. "+
	            audioType + " format not supported");
	      }
	   }   
	}