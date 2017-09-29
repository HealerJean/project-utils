package com.hlj.string;

import java.io.UnsupportedEncodingException;

public class StringTest {
	public static void main(String[] args) {
		String str = "abc";
		StringTest stringTest = new StringTest();
	//	stringTest.change(str);   
		System.out.println(str); //输出 abc 不会改变的
	
		strBu();
	/**
	 *  split 函数用法
	 */	
		//Testsplit();
	
	//	stringTest.testnull();
		/**
		 * 测试string 和byte数组的转化
		 */
	//	testbyteArray();
		/**
		 * 
		 */
	//	strToBuffer();
		
	
	}
	
	public static void strBu(){
		String strone  = "                      62089941                           221201708            6208994165010219650615410001  650102196506154100                                            张萍102           1                     6227004530305638582                                                                                              张萍00000000000007456000000000000000000000000000000745612                                                                                                                        ";
		
		System.out.println("张在第"+strone.indexOf("张"));
		StringBuilder str = new StringBuilder("");
		
		for(int i = 0 ; i< 50; i++){
			str.append(" ");
		}
		System.out.println("|"+str+"|"); 
		System.out.println("50空格|"+str+"|");
		
	}
	


	/**
	 * 1、测试string 可不可以 +
	 */
	
	private static void teststringadd() {
		// TODO Auto-generated method stub
	//	String s+="123"; //错误的
	//	String s = s +"abc"; //错误的 
		
		//下面这样是可以的
		String a = "123";
		String b = "";
		 b += a;
	}
	
	
	
	
	/**
	 * 测试null+字符串的值
	 */
	private void testnull() {
		// TODO Auto-generated method stub
		String testString = null+"abc";
		System.out.println(testString);

	}
	
	
	
	/**
	 * 测试字符串是否改变
	 * @param str
	 */
	void change(String str){
		
		str  = "ghj";
	}
	
	/**
	 * 2、测试 split分割 
	 */
	public static void Testsplit() {
		// TODO Auto-generated method stub
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
	 * 3、测试string 和byte数组的转化
	 */
	public static void testbyteArray(){
		String str = "HealerJean";
		byte[] byteArray;
		try {
			byteArray = str.getBytes("utf-8");
			String strByte = new String (byteArray,"UTF-8");
			System.out.println("byte数组："+byteArray+"\n"+"string:"+strByte);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * String 和 StringBuffer之间的转化
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
}
