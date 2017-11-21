package com.hlj.designpatterns.AdapterPattern;
/** 
 * @author : HealerJean
 * @date   �� 2017��11��21�� ����11:03:13 
 * @Description: 3������ʵ���� AdvancedMediaPlayer �ӿڵ�ʵ���ࡣ

 */
public class VlcPlayer implements AdvancedMediaPlayer{
	   @Override
	   public void playVlc(String fileName) {
	      System.out.println("Playing vlc file. Name: "+ fileName);        
	   }

	   @Override
	   public void playMp4(String fileName) {
	      //ʲôҲ����
	   }
}