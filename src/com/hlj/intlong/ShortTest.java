package com.hlj.intlong;

import java.math.BigDecimal;

public class ShortTest {
	public static void main(String[] args) {
		
		
		  

		/**
		 * 1、double 测试
		 */
		DoubleTest();
		
		/**
		 * 2、Integer
		 */
		// IntegerTest(); 
		 
		/**
		 * 原因在于我们的计算机是二进制的。浮点数没有办法是用二进制进行精确表示。
		 * 在大多数的商业计算中，一般采用java.math.BigDecimal类来进行精确计算。
		 * http://www.cnblogs.com/chenssy/archive/2012/09/09/2677279.html
		 */
	/*	  BigDecimal b1 = new BigDecimal(Double.toString(0.48));
		  BigDecimal b2 = BigDecimal.valueOf(0.48);
		  System.out.println(b1+"|"+b2); 
		  */
		  
		//  shortTest();
	}
	
	
	public static void shortTest(){
		short s1 = 2;
	//	s1=s1 +1;  错误,必须强制转型 才行 
		s1 +=  2;
		int a = 1;
		a = a+1;
		
		System.out.println();
		System.out.println(s1);
		
	}
	
	/**
	 * 
	 * 2、Integer
	 */
	private static void IntegerTest() {
		String intString = "123";
		int intA = Integer.parseInt(intString); //对象是int类型
		Integer intB = Integer.valueOf(intString); //对象是 Integer 类型
		System.out.println((Integer.valueOf(intString)).getClass()+""+(Integer.parseInt(intString)));
	}

	/**
	 * 1、double 测试
	 */
	private static void DoubleTest() {
		Double a = 2.4;
		Double b = 1.2;
		int aint = 2;
		int bint = 3;
		Double aDouble = 1.11;
		Double bDouble = 1.32;
		//尽可能得到16位，如果确实没有16位,如果为整数则保留0
		System.out.println("double除法取16为小数"+aDouble/bDouble); 
		System.out.println("double除法取16，但是不够16位，则只保留0或者最后的结果"+a/b); 
		System.out.println("整数除法取余数"+aint/bint);

		System.out.println("double除以int 得到的结果为double"+a/aint);
		
		float fa = 2.4f;
		float fb = 1.2f;
		float af = 1.11f;
		float bf = 1.32f;
		System.out.println(fa/fb);
		System.out.println(af/bf); //0.84090906 
	
	}
}
