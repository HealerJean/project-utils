package com.hlj.equils;

public class EquilsTest {
	public static void main(String[] args) {
		dy();
		//== 地址相同，equit 變量相同
	}
	public static void dy(){
		
		String a = "132456";
		String a2 = "132456";

		String abuilder = new String("123456");
		String abuilder2 = new String(abuilder);

		String ab = new String(abuilder);
		if(a==a2){ //a a2 地址相同
			System.out.println("a==a2"); //成立
		}else {
			System.out.println("a !=a2");
		}
		
		if(a==abuilder){//a abuilder 地址不同
			System.out.println("a==abuilder"); 
		}else {
			System.out.println("a !=abuilder");//成立
		}
		
		if(a.equals(abuilder)){ //地址所指向的对象 不同
			System.out.println("a==abuilder"); 
		}else {
			System.out.println("a !equals =abuilder");//成立
		}
		
		if(abuilder==abuilder2){ //地址不同
			System.out.println("abuilder = abuilder2");
		}else {
			System.out.println("abuilder != abuilder2"); //成立
		}
		
		if(abuilder.equals(abuilder2)){
			System.out.println("abuilder equals= abuilder2"); //成立
		}else {
			System.out.println("abuilder !equals= abuilder2");
		}
		
	}
}
