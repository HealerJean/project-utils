package com.hlj.path;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



/*
 * 
 * ��װ���� ָ�� �� ����classes�ļ���
 *
 */
public class ClassLoader {
	
	public static void main(String[] args) throws IOException {
	
		//ͨ�������ж�ȡ
	//	getsrc();
		/*
		 *  ʹ�ù��߽��ж�ȡ
		ToolsClassLoader toolsClassLoader = new ToolsClassLoader();
		toolsClassLoader.getSrc();
		*/
	//ͨ��·�����ж�ȡ������ֹ����Ķ��������ڴ棬���ܸı䣩	
		getSrcPath();
	}
	
	private static void getsrc() {
		// 
		
		
		//this.getClass = ReadClassLoader.class
		// ReadClassLoader.this ��ʾ�ľ��� getApplication
		InputStream inputStream = ClassLoader.class.getClassLoader().getResourceAsStream("ClassLoader.properties");
		try {
			Properties properties = new Properties();
		
				properties.load(inputStream);
				System.out.println("��װ���� getResourceAsStreamȡ��src������ļ�"+properties.getProperty("urlpath"));
			}
		catch (FileNotFoundException e) {
			// 
			e.printStackTrace();
		}catch (IOException e) {
			// 
			e.printStackTrace();
		}
	
	}
	private static void getSrcPath() {
		// 
		String srcPath =  ClassLoader.class.getClassLoader().getResource("ClassLoader.properties").getPath();
			System.out.println(srcPath); 
		try {
			Properties properties = new Properties();

			FileInputStream inputStream = new FileInputStream(srcPath);			
			properties.load(inputStream); 
			System.out.println("��װ���� ȡ��·��src������ļ�"+properties.getProperty("urlpath"));
		}catch (IOException e) {
				// 
				e.printStackTrace();
			}
		

	}
	
}
