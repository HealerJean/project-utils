package com.hlj.intlong;

import java.math.BigDecimal;

public class ShortTest {
	public static void main(String[] args) {
		
		
		  

		/**
		 * 1��double ����
		 */
		DoubleTest();
		
		/**
		 * 2��Integer
		 */
		// IntegerTest(); 
		 
		/**
		 * ԭ���������ǵļ�����Ƕ����Ƶġ�������û�а취���ö����ƽ��о�ȷ��ʾ��
		 * �ڴ��������ҵ�����У�һ�����java.math.BigDecimal�������о�ȷ���㡣
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
	//	s1=s1 +1;  ����,����ǿ��ת�� ���� 
		s1 +=  2;
		int a = 1;
		a = a+1;
		
		System.out.println();
		System.out.println(s1);
		
	}
	
	/**
	 * 
	 * 2��Integer
	 */
	private static void IntegerTest() {
		String intString = "123";
		int intA = Integer.parseInt(intString); //������int����
		Integer intB = Integer.valueOf(intString); //������ Integer ����
		System.out.println((Integer.valueOf(intString)).getClass()+""+(Integer.parseInt(intString)));
	}

	/**
	 * 1��double ����
	 */
	private static void DoubleTest() {
		Double a = 2.4;
		Double b = 1.2;
		int aint = 2;
		int bint = 3;
		Double aDouble = 1.11;
		Double bDouble = 1.32;
		//�����ܵõ�16λ�����ȷʵû��16λ,���Ϊ��������0
		System.out.println("double����ȡ16ΪС��"+aDouble/bDouble); 
		System.out.println("double����ȡ16�����ǲ���16λ����ֻ����0�������Ľ��"+a/b); 
		System.out.println("��������ȡ����"+aint/bint);

		System.out.println("double����int �õ��Ľ��Ϊdouble"+a/aint);
		
		float fa = 2.4f;
		float fb = 1.2f;
		float af = 1.11f;
		float bf = 1.32f;
		System.out.println(fa/fb);
		System.out.println(af/bf); //0.84090906 
	
	}
}
