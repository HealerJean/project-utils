package com.hlj.string;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

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
		String str = "a";
		StringTest stringTest = new StringTest();
		int i = 1;
		int a[] = {1,2,3};
		String abc[] = {"a","b","c"};
		 stringTest.change(str,i,a,abc);   
		 System.out.println(str+i); //a1 ����ı�
	    System.out.println(a[2]); //56
	    System.out.println(abc[2]); //ef
		
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
	@Test
	public void testnull() {
		// 
		String testString = null+"abc";
		System.out.println(testString);
		
		int i = 2222;
		String testIntString = "abc"+(i+1);
		String testIntStringNo = "abc"+i+1;
		System.out.println("������"+testIntString+"\n"+"��������"+testIntStringNo);
	} 
	
	
	
	/**
	 * 3�������ַ����Ƿ�ı�
	 */
	void change(String str,int i,int[]a,String abc[]){
		 i   =  123;
		str  = "abc";
		a[2] = 56;
		abc[2] = "ef";
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
	 @Test
	 public  void array(){
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
		 //  int c[3] = {1,4,2,3}; ���ܸ���ֵ
		  int c[] = {1,4,2,3};
	
	//4��new ��ֱ�Ӿ�̬��ֵ������д���С
		//  int d[] = new int[5]{1,2,3}; ����
		  int d[] = new int[]{1,2,3};
	 }

	 
	 /***
	  * 10��substring ��ȡ�����ֽڻ����ַ�
	  * String���length()��������unicode���뵥Ԫ������֮����char�ĸ���Ϊ��ͳ�Ƶġ�
	  * ����ʹ��subString�Ƚ�ȡ�������Ӵ���������ְ�����ֵ������
	   		��Ϊjavaһ��char���Ϳ��Դ��һ�����֣�2���ֽڣ���
	   		
	  * ��������ֽ�byte����ȡ�ַ������ͻ���ְ�����ֵ������
	  	
	  	˼·�����ֵ�unicode���붼�Ǹ����������Щ�����ֽ��ڽ�ȡ���ֽ������гɶԳ��֣�˵�������ȡ��������֡�
	  	������ǳɶԳ��֣�����ȡ��������֣���Ҫ�����һ���ֽ���ȥ��
	  * ���ֽ�����ȡ�ַ���, ���ܽس��������, ����ǰ����������ȥ!
	  */
	 @Test
	 public void testSubStringByteOr(){
		String source = "����һabcd������cccc";
		 int byteCount = 8; //��ʾ��ȡ���ٸ�
			        byte[] byteArr = source.getBytes();
			        System.out.println("�ֽڴ�СΪ"+byteArr.length);
			        int count = 0;
			        // ͳ��Ҫ��ȡ���ǲ����ֽ��и����ĸ���
			        for (int i = 0; i < byteCount; i++) {
			            if (byteArr[i] < 0) {
			            	System.out.println(i);
			                count++;
			            }
			        }
			        System.out.println("�����ĸ���Ϊ"+count); 
			        
			        // �����ɶԳ��� �򲻻���ְ������
			        if (count % 2 == 0)
			            System.out.println(new String(byteArr, 0, byteCount));
			        // ������������ż�������а������
			        else
			            System.out.println(new String(byteArr, 0, byteCount - 1));
			    }

		

	 
	 
}
