package com.hlj.equils;

public class EquilsTest {
	public static void main(String[] args) {
		dy();
		//== ��ַ��ͬ��equit ׃����ͬ
	}
	public static void dy(){
		
		String a = "132456";
		String a2 = "132456";

		String abuilder = new String("123456");
		String abuilder2 = new String(abuilder);

		String ab = new String(abuilder);
		if(a==a2){ //a a2 ��ַ��ͬ
			System.out.println("a==a2"); //����
		}else {
			System.out.println("a !=a2");
		}
		
		if(a==abuilder){//a abuilder ��ַ��ͬ
			System.out.println("a==abuilder"); 
		}else {
			System.out.println("a !=abuilder");//����
		}
		
		if(a.equals(abuilder)){ //��ַ��ָ��Ķ��� ��ͬ
			System.out.println("a==abuilder"); 
		}else {
			System.out.println("a !equals =abuilder");//����
		}
		
		if(abuilder==abuilder2){ //��ַ��ͬ
			System.out.println("abuilder = abuilder2");
		}else {
			System.out.println("abuilder != abuilder2"); //����
		}
		
		if(abuilder.equals(abuilder2)){
			System.out.println("abuilder equals= abuilder2"); //����
		}else {
			System.out.println("abuilder !equals= abuilder2");
		}
		
	}
}
