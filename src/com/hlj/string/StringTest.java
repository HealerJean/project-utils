package com.hlj.string;

import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;
import javax.swing.text.ChangedCharSetException;

public class StringTest {
	public static void main(String[] args) {
		String str = "abc";
		StringTest stringTest = new StringTest();
		stringTest.change(str);   
		System.out.println(str); //输出 abc 不会改变的
		Testsplit();
		stringTest.testnull();
	}
	
	/**
	 * 测试string 可不可以 +
	 */
	
	private void teststringadd() {
		// TODO Auto-generated method stub
	//	String s+="123"; //错误的
	//	String s = s +"abc"; //错误的
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
	 * 测试 split分割 
	 */
	public static void Testsplit() {
		// TODO Auto-generated method stub
String a = "abcdef";
	String []aStrings  = a.split("");
	System.out.println("0输出"+aStrings[0]+"*"); //输出* 表示索引为0的时候，不存在数据 
	System.out.println("5输出"+aStrings[5]); //输出f 
	for(String b:aStrings){
			System.out.println(b); //a b c d e f 
	}
	}
}
