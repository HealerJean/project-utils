package com.hlj.extend;

class A{
	
	// private String aString = "���ױ���";
	String aString = "���ױ���";
		public void aString(){
		System.out.println("���׷���");
	}	
}
public class TestBl extends A{
	String aString = "���ӱ���";
	public void aString(){
		aString = "��������"; //û�иı�
	System.out.println("���ӷ���");	
}	
	public static void main(String[] args) {
		//��̬
		System.out.println("*****��̬******");
		A testB = new TestBl(); 
		System.out.println(testB.aString ); 
		testB.aString(); 
	System.out.println("***********");
		
		TestBl testBl = new TestBl();	

		System.out.println(testBl.aString ); 
		testBl.aString() ;		
	}
}
