package com.hlj.intlong;

public class ShortTest {
	public static void main(String[] args) {
		short s1 = 2;
		s1 = s1 = 1;
		System.out.println(s1);
		
		
		Double a = 2.4;
		Double b = 1.2;
		int aint = 2;
		int bint = 3;
		Double aDouble = 1.11;
		Double bDouble = 1.32;
		//尽可能得到16位，如果确实没有16位则将0省略
		System.out.println("double除法取16为小数"+aDouble/bDouble); 
		System.out.println("double除法取16，但是不够16位，则只保留0或者最后的结果"+a/b); 
		System.out.println("整数除法取余数"+aint/bint);

		System.out.println("double除以int 得到的结果为double"+a/aint);
	}
}
