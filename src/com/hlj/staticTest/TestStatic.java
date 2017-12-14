package com.hlj.staticTest;
/** 
 * @author : HealerJean
 * @date   ： 2017年12月14日 下午12:53:24 
 * @Description:
 */
public class TestStatic {


	public static int n = 1;
	int m = 2;
	public static void main(String[] args) {
		TestStatic testStatic = new TestStatic();
		testStatic.b1();
		
	}
	public static void a(){
	/* 错误的
	 * 	this.b2();
		this.m = 2;
	*/
		a3();
		n = 2;
		//错误的
		//m = 3;
		System.out.println(TestStatic.n); 
		System.out.println("a");		
	}
	public static void a3(){
	}
	
	public void a2(){
		
		this.a2();
	}
	public void b1(){
		a2(); //可以直接调用非静态的
		a();
		TestStatic.a();
	//	TestStatic.a2(); //这样是不可以的
		this.a();
		this.m = 1;
		this.n=2;
		n = 2;
		m = 3;
		System.out.println("b");
	}
	public static void b2(){
		
		System.out.println("b2");
	}
}