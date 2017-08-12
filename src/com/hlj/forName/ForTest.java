package com.hlj.forName;

public class ForTest {
	public static  boolean foo (char c)
	{
		System.out.print(c);
		return true;
	}
	public static void main(String[] args) {
		int i = 0;
		for ( foo('A'); foo('B') &&(i < 2); foo('C')) {
			i++ ;
			foo('D');
			
		}
	}
	//本循环 只会执行2次  也就是 ABDC BDC  
	//后面的B 是foo(B)进行判断时候执行的 ，不计入循环次数
	//最后面的foo(C)是在循环每次执行完毕的时候执行的
	
	 //foo('A') 只会执行一次，因为这个是初始化条件  
	//运行结果为ABDC BDCB
}
