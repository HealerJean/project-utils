package com.hlj.path;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class FileInputStreamTest {


	public static void main(String[] args) {
		System.out.println(getUrlPath());
			
	}	
	
	//初始化变量
	public static String getUrlPath(){
		 String urlpath = null; 
		Properties pp = new Properties();
		FileInputStream fis = null;
		try { 
			//这个表示直接获取项目下面文件的路径  
			fis = new FileInputStream("ClassLoader.properties");
			//但是如果是包路径下的
		//fis = new FileInputStream("src/com/hlj/path/ClassGetResource.properties");
		//测试有没有流的出现 	System.out.println(fis);
			pp.load(fis);
			urlpath = pp.getProperty("urlpath");	
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(fis!=null){
				fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return urlpath;
	}
	
	

	
}
