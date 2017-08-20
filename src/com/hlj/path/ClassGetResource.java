package com.hlj.path;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


//��ȡ��������ļ� ·��
public class ClassGetResource {
	
	public static void main(String[] args) {
		
		//���ǣ�������ʹ��������
		String fileUrl = ClassGetResource.class.getResource("ClassGetResource.properties").getFile(); 

		try {
			Properties properties = new Properties();

			FileInputStream inputStream = new FileInputStream(fileUrl);			
			properties.load(inputStream); 
			System.out.println("��װ���� ȡ��·��src������ļ�"+properties.getProperty("urlpath"));
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
