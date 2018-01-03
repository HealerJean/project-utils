package com.hlj.extend;

class A{
	
	// private String aString = "父亲变量";
	String aString = "父亲变量";
		public void aString(){
		System.out.println("父亲方法");
	}	
}
public class TestBl extends A{
	String aString = "儿子变量";
	public void aString(){
		aString = "方法儿子"; //没有改变
	System.out.println("儿子方法");	
}	
	public static void main(String[] args) {
		//多态
		System.out.println("*****多态******");
		A testB = new TestBl(); 
		System.out.println(testB.aString ); 
		testB.aString(); 
	System.out.println("***********");
		
		TestBl testBl = new TestBl();	

		System.out.println(testBl.aString ); 
		testBl.aString() ;		
	}
}
