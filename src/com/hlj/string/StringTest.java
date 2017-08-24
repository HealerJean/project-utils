package com.hlj.string;

import java.io.UnsupportedEncodingException;

import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;
import javax.swing.text.ChangedCharSetException;

public class StringTest {
	public static void main(String[] args) {
		String str = "abc";
		StringTest stringTest = new StringTest();
		stringTest.change(str);   
		System.out.println(str); //��� abc ����ı��
		Testsplit();
		stringTest.testnull();
		/**
		 * ����string ��byte�����ת��
		 */
		testbyteArray();
	}
	
	/**
	 * ����string �ɲ����� +
	 */
	
	private void teststringadd() {
		// TODO Auto-generated method stub
	//	String s+="123"; //�����
	//	String s = s +"abc"; //�����
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
	 * ���� split�ָ� 
	 */
	public static void Testsplit() {
		// TODO Auto-generated method stub
String a = "abcdef";
	String []aStrings  = a.split("");
	System.out.println("0���"+aStrings[0]+"*"); //���* ��ʾ����Ϊ0��ʱ�򣬲��������� 
	System.out.println("5���"+aStrings[5]); //���e 
	System.out.println(aStrings.length); 

	for(String b:aStrings){
			System.out.println(b); //a b c d e f 
	}
	}
	
	/**
	 * ����string ��byte�����ת��
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
}
