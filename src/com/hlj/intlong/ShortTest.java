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
		//�����ܵõ�16λ�����ȷʵû��16λ��0ʡ��
		System.out.println("double����ȡ16ΪС��"+aDouble/bDouble); 
		System.out.println("double����ȡ16�����ǲ���16λ����ֻ����0�������Ľ��"+a/b); 
		System.out.println("��������ȡ����"+aint/bint);

		System.out.println("double����int �õ��Ľ��Ϊdouble"+a/aint);
	}
}
