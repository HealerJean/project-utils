package com.hlj.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {

	
		/**
		 * 1、已知路径创建 相关文件  前提，必须存在路径	
		*/
		//	createFile();
				
		/**
		 * 1.2、创建有父亲目录的文件
		 * 
		 */
		//	createHavaDirectoryFile();
			
		/**	
		* 2、判断是不是文件或者目录	
		* 如果上述文件、目录不存在，也不会报错
		*/	
		//	judgeFileOrDirectory(directoryName);
		
		/**
		 * 3、
		 * 判断是不是目录
		 * 创建目录，即使路径不存在，也会创建相关路径，因为是mkdirs
		 */
		//		 createDirectory();

		
		/**
		 * 4、复制文件
		 * 第一个文件必须存在，
		 * 第二个文件可以不存在,但是路径必须存在
		 */
		// copyFile("D:/test/healerjean/file.txt","D:/test/copyFile/file2.txt");
		
		
		/**
		 * 5、删除目录
		 * 
		 */
    //	File file	  = new File("D:/test/healerjean");
    //	delteFile(file);
	}
	
	
	/**
	 * 1、
	 * 已知路径创建 相关文件  
	 * 前提，必须存在路径	
	 */
	private static void createFile() throws IOException {
		
			File fileNameTxt = new File("D:/test/healerjean/file.txt");
			
			if(!fileNameTxt.exists()){
				fileNameTxt.createNewFile();
			}
	}
	
	

	/**
	 * 1.2、创建有目录的文件
	 * 
	 */
	private static void createHavaDirectoryFile() throws IOException {
		File directoryName = new File("D:/test/healerjean/file");  

//通过父的目录引入文件   a1 是父类 (只要是之前的父类以上都是可以的)
		File directoryNameTxt = new File(directoryName,"directoryName.txt");
		
		if(!directoryNameTxt.exists()){
			directoryNameTxt.createNewFile();
		}
		System.out.println("创建有目录的文件成功");
	}
	
	/**	
	 * 2、
	 * 判断是不是文件或者目录	
	 * 如果上述文件、目录不存在，则以下都不执行，同时也不会报错
	 */
	private static void judgeFileOrDirectory(File path) {
		
				System.out.println("测试开始");
				if(path.isFile()){
					System.out.println(path.getPath()+"是一个文件");
				}
				else if(path.isDirectory()){
					System.out.println(path.getPath()+"是一个目录");
				}else {
					System.out.println(path.getPath()+"不是文件也不是目录");

				}
	}
	
	
	

	/**
	 * 3、
	 * 判断是不是目录
	 * 创建目录，即使路径不存在，也会创建相关路径，因为是mkdirs
	 */
	private static void createDirectory() {
		//引入目录
				File directoryName = new File("D:/test/healerjean/file");  
				
				if(!directoryName.exists()){
					directoryName.mkdirs();
					System.out.println(directoryName.getPath()+"创建目录成功"); 
				}
		
	}
	
	/**
	 * 4、复制文件
	 * 第一个文件必须存在，
	 * 第二个文件可以不存在,但是路径必须存在 (FileOutputStream)
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
	        System.out.println("复制文件成功");
	    }
	 /**
	  * 5、删除多个目录
	  */
	 
	    public static void  delteFile(File file){
	    	//file.listFiles()是获取file这个对象也就是file这个目录下面的文件和文件夹的集合
	        File[] files=file.listFiles(); 
	        for(File f:files)
	        {
	            if(f.isDirectory())//递归调用
	            {
	                delteFile(f);
	            }
	            else {
	                f.delete();
	            }
	        }
	        file.delete();
	        System.out.println("删除目录成功");
	    }
	
}
