package com.hlj.string;

import java.io.UnsupportedEncodingException;

public class StringTest {
	public static void main(String[] args) {
		String str = "abc";
		StringTest stringTest = new StringTest();
	//	stringTest.change(str);   
		System.out.println(str); //��� abc ����ı��
	
		strBu();
	/**
	 *  split �����÷�
	 */	
		//Testsplit();
	
	//	stringTest.testnull();
		/**
		 * ����string ��byte�����ת��
		 */
	//	testbyteArray();
		/**
		 * 
		 */
	//	strToBuffer();
		
	
	}
	
	public static void strBu(){
		String strone  = "                      62089941                           221201708            6208994165010219650615410001  650102196506154100                                            ��Ƽ102           1                     6227004530305638582                                                                                              ��Ƽ00000000000007456000000000000000000000000000000745612                                                                                                                        ";
		
		System.out.println("���ڵ�"+strone.indexOf("��"));
		StringBuilder str = new StringBuilder("");
		
		for(int i = 0 ; i< 50; i++){
			str.append(" ");
		}
		System.out.println("|"+str+"|"); 
		System.out.println("50�ո�|"+str+"|");
		
	}
	


	/**
	 * 1������string �ɲ����� +
	 */
	
	private static void teststringadd() {
		// TODO Auto-generated method stub
	//	String s+="123"; //�����
	//	String s = s +"abc"; //����� 
		
		//���������ǿ��Ե�
		String a = "123";
		String b = "";
		 b += a;
	}
	
	
	
	
	/**
	 * ����null+�ַ�����ֵ
	 */
	private void testnull() {
		// TODO Auto-generated method stub
		String testString = null+"abc";
		System.out.println(testString);

	}
	
	
	
	/**
	 * �����ַ����Ƿ�ı�
	 * @param str
	 */
	void change(String str){
		
		str  = "ghj";
	}
	
	/**
	 * 2������ split�ָ� 
	 */
	public static void Testsplit() {
		// TODO Auto-generated method stub
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
	 * 3������string ��byte�����ת��
	 */
	public static void testbyteArray(){
		String str = "HealerJean";
		byte[] byteArray;
		try {
			byteArray = str.getBytes("utf-8");
			String strByte = new String (byteArray,"UTF-8");
			System.out.println("byte���飺"+byteArray+"\n"+"string:"+strByte);

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * String �� StringBuffer֮���ת��
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
}
