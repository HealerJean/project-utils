package com.hlj.file;

import java.io.File;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��25�� ����2:37:01 
 * ��˵�� 
 */
public class GetNatFile {

	public static void main(String[] args) {
		
		for(int i = 164 ;i<255;i++){
			File file = new File("//192.168.31."+i+"");
			if(file.exists()){
				System.out.println(file.getName()+"_______"+file.getPath());
			}
			System.out.println(i);
		}
		
	}
}
