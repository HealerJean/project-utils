package com.hlj.Name;

import java.util.UUID;


public class GetImageNew {
	public static String getUUIdName(String filename){
		
		String uuid = UUID.randomUUID().toString();
		
	//	System.out.println(uuid);
		//���ڿ���  ���ļ���filename.jpg ��Ϊ 	uuId.jpg
	//	String filename= "abcdefghijklmn.jpg";
		int begainName = filename.lastIndexOf(".");
	//ȡ���ļ���ǰ�������
	//	String newName = filename.substring(0, filename.lastIndexOf("."));
	
		// ��ȡ��׺�� ��Ϊ�ǰ�ͷ����β���Ծ�ֱ��length
	//	String newName = filename.substring(begainName, filename.length());
	
	//����������
		String newName = uuid+filename.substring(begainName, filename.length());
		System.out.println("getUUIdName"+newName);
		return newName; 

	} 
	
	//�õ��ļ�����ǰ׺
	public static String startName(String filename){
		
		String startName = filename.substring(0, filename.lastIndexOf("."));
		System.out.println(startName);
		return startName;
	}
	//�õ��ļ����ĺ�׺
public static String endName(String filename){
		
		int begainName = filename.lastIndexOf(".");
		String endName = filename.substring(begainName,  filename.length());
		System.out.println(endName);
		return endName;
	}

	
	//��һ��·�� ȡ����������E:\WorkSpace\MyeclipseWork\.metadata\.me_tcat\webapps\ReadWebResourse\WEB-INF\classes\NamePath.properties

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
