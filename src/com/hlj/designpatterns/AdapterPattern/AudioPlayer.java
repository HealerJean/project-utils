package com.hlj.designpatterns.AdapterPattern;
/** 
 * @author : HealerJean
 * @date   �� 2017��11��21�� ����11:07:06 
 * @Description: ��Ƶ���������������е���Ƶ
 */
public class AudioPlayer implements MediaPlayer {
	   MediaAdapter mediaAdapter; 

	   @Override
	   public void play(String audioType, String fileName) {        

	      //���� mp3 �����ļ�������֧��
	      if(audioType.equalsIgnoreCase("mp3")){
	         System.out.println("Playing mp3 file. Name: "+ fileName);            
	      } 
	      //mediaAdapter �ṩ�˲��������ļ���ʽ��֧��
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