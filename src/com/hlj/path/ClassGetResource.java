package com.hlj.path;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


//获取包下面的文件 路径
public class ClassGetResource {
	
	public static void main(String[] args) {
		
		//仅记，不可以使用其他类
		String fileUrl = ClassGetResource.class.getResource("ClassGetResource.properties").getFile(); 
			System.out.println(fileUrl); 
		try {
			Properties properties = new Properties();

			FileInputStream inputStream = new FileInputStream(fileUrl);			
			properties.load(inputStream); 
			System.out.println("类装载器 取得路径src下面的文件"+properties.getProperty("urlpath"));
		}catch (IOException e) {
				// 
				e.printStackTrace();
			}
		
	}
}
