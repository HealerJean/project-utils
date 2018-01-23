package com.hlj.Name;

import java.util.UUID;


public class GetImageNew {
	public static String getUUIdName(String filename){
		
		String uuid = UUID.randomUUID().toString();
		
	//	System.out.println(uuid);
		//现在考虑  将文件名filename.jpg 变为 	uuId.jpg
	//	String filename= "abcdefghijklmn.jpg";
		int begainName = filename.lastIndexOf(".");
	//取得文件的前面的名字
	//	String newName = filename.substring(0, filename.lastIndexOf("."));
	
		// 获取后缀名 因为是包头不包尾所以就直接length
	//	String newName = filename.substring(begainName, filename.length());
	
	//制作新名字
		String newName = uuid+filename.substring(begainName, filename.length());
		System.out.println("getUUIdName"+newName);
		return newName; 

	} 
	
	//得到文件名的前缀
	public static String startName(String filename){
		
		String startName = filename.substring(0, filename.lastIndexOf("."));
		System.out.println(startName);
		return startName;
	}
	//得到文件名的后缀
public static String endName(String filename){
		
		int begainName = filename.lastIndexOf(".");
		String endName = filename.substring(begainName,  filename.length());
		System.out.println(endName);
		return endName;
	}

	
	//给一个路径 取得他的名字E:\WorkSpace\MyeclipseWork\.metadata\.me_tcat\webapps\ReadWebResourse\WEB-INF\classes\NamePath.properties

	private void getPathName(String srcPath) {
		// 
		
		String fileName = srcPath.substring(srcPath.lastIndexOf("\\")+1,srcPath.length());

	}
	
	
	public static void main(String[] args) {
			endName("hfafa.jpg");
			startName("hfafa.jpg");		
			getUUIdName("/fa/fa/fafa.jpg");
	}
}
