package com.hlj.path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



/*
 * 
 * 类装载器 指向 的 就是classes文件夹
 *
 */
public class ClassLoader {
	
	public static void main(String[] args) throws IOException {
	
		//通过流进行读取
		getsrc();
		/*
		 *  使用工具进行读取
		ToolsClassLoader toolsClassLoader = new ToolsClassLoader();
		toolsClassLoader.getSrc();
		*/
	//通过路径进行读取，（防止上面的东西进入内存，不能改变）	
		getSrcPath();
	}
	
	private static void getsrc() {
		// TODO Auto-generated method stub
		
		
		//this.getClass = ReadClassLoader.class
		// ReadClassLoader.this 表示的就是 getApplication
		InputStream inputStream = ClassLoader.class.getClassLoader().getResourceAsStream("ClassLoader.properties");
		try {
			Properties properties = new Properties();
		
				properties.load(inputStream);
				System.out.println("类装载器 getResourceAsStream取得src下面的文件"+properties.getProperty("urlpath"));
			}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	private static void getSrcPath() {
		// TODO Auto-generated method stub
		String srcPath =  ClassLoader.class.getClassLoader().getResource("ClassLoader.properties").getPath();

		try {
			Properties properties = new Properties();

			FileInputStream inputStream = new FileInputStream(srcPath);			
			properties.load(inputStream); 
			System.out.println("类装载器 取得路径src下面的文件"+properties.getProperty("urlpath"));
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}
	
}
