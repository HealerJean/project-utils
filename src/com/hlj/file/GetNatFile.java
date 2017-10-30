package com.hlj.file;

import java.io.File;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月25日 下午2:37:01 
 * 类说明 
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
