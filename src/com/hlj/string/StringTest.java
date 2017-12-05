package com.hlj.string;

import java.io.UnsupportedEncodingException;

public class StringTest {
	public static void main(String[] args) {

		
		/**
		 * 1、测试string 可不可以 +
		 */
	//	teststringadd();
		
		/**
		 * 2、测试null+字符串的值
		 */
	//	testnull() ;
		
		/**
		 * 3、测试字符串是否改变
		 */
		String str = "abc";
		StringTest stringTest = new StringTest();
		/*
		 stringTest.change(str);   
		 System.out.println(str); //输出 abc 不会改变的
	     */
		
		/**
		 * 4、测试 split分割 
		 */
	//	Testsplit();
		
		
		/**
		 * 5、测试string 和byte数组的转化
		 */
	//	testbyteArray();
		
		
		

		/**
		 * 6、String 和 StringBuffer之间的转化
		 */

	//	strToBuffer();
		 
		
		 /**
		  * 
		  * 7、数组 length
		  *   String length()
		 *
		  */
	//	 lengthAndSize()
		
		
		 /**
		  * 8、string ...
		  */
	//	printStringMain() ;
		
		array();
	}
	

	


	/**
	 * 1、测试string 可不可以 +
	 */
	
	private static void teststringadd() {

		//未提前定义好对象
		//String m = m +"abc"; //错误的 
		
		//如果提前定义对象，是可以的
		String a = "123";
		String b = "";
		 b += "abc";
		 b = b + "a";
	}
	
	
	
	
	/**
	 * 2、测试null+字符串的值
	 */
	private void testnull() {
		// 
		String testString = null+"abc";
		System.out.println(testString);

	}
	
	
	
	/**
	 * 3、测试字符串是否改变
	 */
	void change(String str){
		
		str  = "ghj";
	}
	
	/**
	 * 4、测试 split分割 
	 */
	public static void Testsplit() {
		// 
String a = "abcdef";
	String []aStrings  = a.split("");
	System.out.println("0输出"+aStrings[0]+"*"); //输出* 表示索引为0的时候，不存在数据 
	System.out.println("5输出"+aStrings[5]); //输出e 
	System.out.println(aStrings.length);  //7

	for(String b:aStrings){
			System.out.println(b); //a b c d e f 
	}
	}
	
	/**
	 * 5、测试string 和byte数组的转化
	 */
	public static void testbyteArray(){
		String str = "HealerJean";
		byte[] byteArray;
		try {
			byteArray = str.getBytes("utf-8");
			String strByte = new String (byteArray,"UTF-8");
			System.out.println("byte数组："+byteArray+"\n"+"string:"+strByte);

		} catch (UnsupportedEncodingException e) {
			// 
			e.printStackTrace();
		}
	}
	
	/**
	 * 6、String 和 StringBuffer之间的转化
	 */

	 public static void strToBuffer() {
	  //String -> StringBuffer 1、构造方法  2、通过append方法
	        //创建一个String对象
	        String str = "Hi Java!";
	        System.out.println(str);
	 
	        //方式一：构造方法
	        StringBuffer buffer = new StringBuffer(str);
	        System.out.println(buffer);
	 
	        //方式二：通过append方法
	        StringBuffer buffer2 = new StringBuffer();
	        buffer2.append(str);
	        System.out.println(buffer2);
	 
	 //StringBuffer -> String
	        //创建一个StringBuffer对象 1、构造方法 2、toString方法
	        StringBuffer buffer3 = new StringBuffer();
	        buffer3.append("Happy birthday Java!");
	        System.out.println(buffer3);
	 
	        //方式一：通过构造方法
	        String str2 = new String(buffer3); 
	        System.out.println(str2);
	         
	        //方式二：通过toString方法
	        String str3 = buffer3.toString();
	        System.out.println(str3);
	    }
	 /**
	  * 
	  * 7、数组 length
	  *   String length()
	 *
	  */
	 public static void lengthAndSize(){
		 String string  = "abcdefg" ;
		 String strArray[] = {"1","2"};
		 
		 System.out.println(string.length()); 
		 System.out.println(strArray.length); 
		 //错误 System.out.println(strArray.size);
	}
	 
	 /**
	  * 8、string ...
	  */
	 public static void printString(String... str){  
		  if(str.length==0){  
		   System.out.println("没有传参数。");  
		  }  
		  for (int i = 0; i < str.length; i++) {  
		   System.out.printf(str[i]);  
		  }  
	}  
	
	 public static void printStringMain() {  
		  printString();  
		  System.out.println("==========");  
		  printString(new String[]{"我","和","你"});  
		 }  
	 
	 /**
	  * 9、数组的定义
	  */
	 
	 public static void array(){
	//1、	
		 int[] a = new int[3]; //定义一个数组
			a[0] = 1;
			a[1] = 2;
			a[2] = 3;
		//	a[4] = 5; //超出限制 报错
	//2、动态初始化
		  int b[] ;
		//  b[1] = 2;  没有给定大小，报错
		  b = new int[5];
	//3、 静态初始化
		  int c[] = {1,4,2,3};
	
	//4、new 并直接静态赋值，不可写入大小
		//  int d[] = new int[5]{1,2,3}; 错误
		  int d[] = new int[]{1,2,3};
	 }
}
