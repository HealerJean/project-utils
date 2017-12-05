package com.hlj.string;

import java.io.UnsupportedEncodingException;

public class StringTest {
	public static void main(String[] args) {

		
		/**
		 * 1������string �ɲ����� +
		 */
	//	teststringadd();
		
		/**
		 * 2������null+�ַ�����ֵ
		 */
	//	testnull() ;
		
		/**
		 * 3�������ַ����Ƿ�ı�
		 */
		String str = "abc";
		StringTest stringTest = new StringTest();
		/*
		 stringTest.change(str);   
		 System.out.println(str); //��� abc ����ı��
	     */
		
		/**
		 * 4������ split�ָ� 
		 */
	//	Testsplit();
		
		
		/**
		 * 5������string ��byte�����ת��
		 */
	//	testbyteArray();
		
		
		

		/**
		 * 6��String �� StringBuffer֮���ת��
		 */

	//	strToBuffer();
		 
		
		 /**
		  * 
		  * 7������ length
		  *   String length()
		 *
		  */
	//	 lengthAndSize()
		
		
		 /**
		  * 8��string ...
		  */
	//	printStringMain() ;
		
		array();
	}
	

	


	/**
	 * 1������string �ɲ����� +
	 */
	
	private static void teststringadd() {

		//δ��ǰ����ö���
		//String m = m +"abc"; //����� 
		
		//�����ǰ��������ǿ��Ե�
		String a = "123";
		String b = "";
		 b += "abc";
		 b = b + "a";
	}
	
	
	
	
	/**
	 * 2������null+�ַ�����ֵ
	 */
	private void testnull() {
		// 
		String testString = null+"abc";
		System.out.println(testString);

	}
	
	
	
	/**
	 * 3�������ַ����Ƿ�ı�
	 */
	void change(String str){
		
		str  = "ghj";
	}
	
	/**
	 * 4������ split�ָ� 
	 */
	public static void Testsplit() {
		// 
String a = "abcdef";
	String []aStrings  = a.split("");
	System.out.println("0���"+aStrings[0]+"*"); //���* ��ʾ����Ϊ0��ʱ�򣬲��������� 
	System.out.println("5���"+aStrings[5]); //���e 
	System.out.println(aStrings.length);  //7

	for(String b:aStrings){
			System.out.println(b); //a b c d e f 
	}
	}
	
	/**
	 * 5������string ��byte�����ת��
	 */
	public static void testbyteArray(){
		String str = "HealerJean";
		byte[] byteArray;
		try {
			byteArray = str.getBytes("utf-8");
			String strByte = new String (byteArray,"UTF-8");
			System.out.println("byte���飺"+byteArray+"\n"+"string:"+strByte);

		} catch (UnsupportedEncodingException e) {
			// 
			e.printStackTrace();
		}
	}
	
	/**
	 * 6��String �� StringBuffer֮���ת��
	 */

	 public static void strToBuffer() {
	  //String -> StringBuffer 1�����췽��  2��ͨ��append����
	        //����һ��String����
	        String str = "Hi Java!";
	        System.out.println(str);
	 
	        //��ʽһ�����췽��
	        StringBuffer buffer = new StringBuffer(str);
	        System.out.println(buffer);
	 
	        //��ʽ����ͨ��append����
	        StringBuffer buffer2 = new StringBuffer();
	        buffer2.append(str);
	        System.out.println(buffer2);
	 
	 //StringBuffer -> String
	        //����һ��StringBuffer���� 1�����췽�� 2��toString����
	        StringBuffer buffer3 = new StringBuffer();
	        buffer3.append("Happy birthday Java!");
	        System.out.println(buffer3);
	 
	        //��ʽһ��ͨ�����췽��
	        String str2 = new String(buffer3); 
	        System.out.println(str2);
	         
	        //��ʽ����ͨ��toString����
	        String str3 = buffer3.toString();
	        System.out.println(str3);
	    }
	 /**
	  * 
	  * 7������ length
	  *   String length()
	 *
	  */
	 public static void lengthAndSize(){
		 String string  = "abcdefg" ;
		 String strArray[] = {"1","2"};
		 
		 System.out.println(string.length()); 
		 System.out.println(strArray.length); 
		 //���� System.out.println(strArray.size);
	}
	 
	 /**
	  * 8��string ...
	  */
	 public static void printString(String... str){  
		  if(str.length==0){  
		   System.out.println("û�д�������");  
		  }  
		  for (int i = 0; i < str.length; i++) {  
		   System.out.printf(str[i]);  
		  }  
	}  
	
	 public static void printStringMain() {  
		  printString();  
		  System.out.println("==========");  
		  printString(new String[]{"��","��","��"});  
		 }  
	 
	 /**
	  * 9������Ķ���
	  */
	 
	 public static void array(){
	//1��	
		 int[] a = new int[3]; //����һ������
			a[0] = 1;
			a[1] = 2;
			a[2] = 3;
		//	a[4] = 5; //�������� ����
	//2����̬��ʼ��
		  int b[] ;
		//  b[1] = 2;  û�и�����С������
		  b = new int[5];
	//3�� ��̬��ʼ��
		  int c[] = {1,4,2,3};
	
	//4��new ��ֱ�Ӿ�̬��ֵ������д���С
		//  int d[] = new int[5]{1,2,3}; ����
		  int d[] = new int[]{1,2,3};
	 }
}
