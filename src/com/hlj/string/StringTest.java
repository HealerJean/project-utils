package com.hlj.string;

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
	System.out.println("5���"+aStrings[5]); //���f 
	for(String b:aStrings){
			System.out.println(b); //a b c d e f 
	}
	}
}
