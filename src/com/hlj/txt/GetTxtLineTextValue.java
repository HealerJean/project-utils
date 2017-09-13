package com.hlj.txt;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class GetTxtLineTextValue {
	public static void main(String[] args) throws Exception {
		
		String filePath = "C:/Users/qdkf/Desktop/项目/江苏/STS01ToRST01_NJF01001_20170904_2017090465853776438363389189.txt";
		byte [] txtByteArrayText = getFileReadLineTextValue(filePath);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(txtByteArrayText),"utf-8"));
    	
		String lineVal =null ;
    	int flagLength = 0;
		while((lineVal = reader.readLine()) != null ){		
			flagLength++;
			
		 if(flagLength==1){
			 System.out.println("第"+flagLength+"行的内容为"+lineVal);
		 }
		 else{
			 System.out.println("第"+flagLength+"行的内容为"+lineVal);			 
		 }
		}
		
	}
	
	/**
	 * 1 、通过文件路径找到相应的字符串
	 * @param filePath
	 * @return
	 * @throws Exception
	 */
	private static byte[] getFileReadLineTextValue(String filePath) throws Exception {
		
		 FileInputStream fileInputStream = new FileInputStream(filePath);
		 ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
		 int len  = 0;
		 byte[] buffer = new byte[1024];
		 while((len = fileInputStream.read(buffer))!=-1){
			 byteOutputStream.write(buffer, 0, len);
		 }
		 byte[] txtByteArray = byteOutputStream.toByteArray();
		 
		 if(txtByteArray.length!=0){
			 return txtByteArray;
		 }  	
    	
		return null;
	}
	
}
