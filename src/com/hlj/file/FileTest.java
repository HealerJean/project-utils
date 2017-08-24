package com.hlj.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {

	
		/**
		 * 1����֪·������ ����ļ�  ǰ�ᣬ�������·��	
		*/
		//	createFile();
				
		/**
		 * 1.2�������и���Ŀ¼���ļ�
		 * 
		 */
		//	createHavaDirectoryFile();
			
		/**	
		* 2���ж��ǲ����ļ�����Ŀ¼	
		* ��������ļ���Ŀ¼�����ڣ�Ҳ���ᱨ��
		*/	
		//	judgeFileOrDirectory(directoryName);
		
		/**
		 * 3��
		 * �ж��ǲ���Ŀ¼
		 * ����Ŀ¼����ʹ·�������ڣ�Ҳ�ᴴ�����·������Ϊ��mkdirs
		 */
		//		 createDirectory();

		
		/**
		 * 4�������ļ�
		 * ��һ���ļ�������ڣ�
		 * �ڶ����ļ����Բ�����,����·���������
		 */
		// copyFile("D:/test/healerjean/file.txt","D:/test/copyFile/file2.txt");
		
		
		/**
		 * 5��ɾ��Ŀ¼
		 * 
		 */
    //	File file	  = new File("D:/test/healerjean");
    //	delteFile(file);
	}
	
	
	/**
	 * 1��
	 * ��֪·������ ����ļ�  
	 * ǰ�ᣬ�������·��	
	 */
	private static void createFile() throws IOException {
		
			File fileNameTxt = new File("D:/test/healerjean/file.txt");
			
			if(!fileNameTxt.exists()){
				fileNameTxt.createNewFile();
			}
	}
	
	

	/**
	 * 1.2��������Ŀ¼���ļ�
	 * 
	 */
	private static void createHavaDirectoryFile() throws IOException {
		File directoryName = new File("D:/test/healerjean/file");  

//ͨ������Ŀ¼�����ļ�   a1 �Ǹ��� (ֻҪ��֮ǰ�ĸ������϶��ǿ��Ե�)
		File directoryNameTxt = new File(directoryName,"directoryName.txt");
		
		if(!directoryNameTxt.exists()){
			directoryNameTxt.createNewFile();
		}
		System.out.println("������Ŀ¼���ļ��ɹ�");
	}
	
	/**	
	 * 2��
	 * �ж��ǲ����ļ�����Ŀ¼	
	 * ��������ļ���Ŀ¼�����ڣ������¶���ִ�У�ͬʱҲ���ᱨ��
	 */
	private static void judgeFileOrDirectory(File path) {
		
				System.out.println("���Կ�ʼ");
				if(path.isFile()){
					System.out.println(path.getPath()+"��һ���ļ�");
				}
				else if(path.isDirectory()){
					System.out.println(path.getPath()+"��һ��Ŀ¼");
				}else {
					System.out.println(path.getPath()+"�����ļ�Ҳ����Ŀ¼");

				}
	}
	
	
	

	/**
	 * 3��
	 * �ж��ǲ���Ŀ¼
	 * ����Ŀ¼����ʹ·�������ڣ�Ҳ�ᴴ�����·������Ϊ��mkdirs
	 */
	private static void createDirectory() {
		//����Ŀ¼
				File directoryName = new File("D:/test/healerjean/file");  
				
				if(!directoryName.exists()){
					directoryName.mkdirs();
					System.out.println(directoryName.getPath()+"����Ŀ¼�ɹ�"); 
				}
		
	}
	
	/**
	 * 4�������ļ�
	 * ��һ���ļ�������ڣ�
	 * �ڶ����ļ����Բ�����,����·��������� (FileOutputStream)
	 */
	 public static void copyFile(String string,String string2) throws IOException{
	        FileInputStream ins = new FileInputStream(string);
	        FileOutputStream out = new FileOutputStream(string2);
	        byte[] b = new byte[1024];
	        int n=0;
	        while((n=ins.read(b))!=-1){
	            out.write(b, 0, n); 
	        }
	         
	        ins.close();
	        out.close();
	        System.out.println("�����ļ��ɹ�");
	    }
	 /**
	  * 5��ɾ�����Ŀ¼
	  */
	 
	    public static void  delteFile(File file){
	    	//file.listFiles()�ǻ�ȡfile�������Ҳ����file���Ŀ¼������ļ����ļ��еļ���
	        File[] files=file.listFiles(); 
	        for(File f:files)
	        {
	            if(f.isDirectory())//�ݹ����
	            {
	                delteFile(f);
	            }
	            else {
	                f.delete();
	            }
	        }
	        file.delete();
	        System.out.println("ɾ��Ŀ¼�ɹ�");
	    }
	
}
