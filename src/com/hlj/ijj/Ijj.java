package com.hlj.ijj;

public class Ijj {
	public static void main(String[] args) {
		
		a(1);
		
		
	}
	public static void a(int i){

	
		int a = i++;   //ֱ�Ӹ�ֵ�Ļ������Ǳ���ԭ�������֡�����a����1
		System.out.println(i); //2   //����i��ֵ����2��

		System.out.println(a); //1  

		System.out.println(i);  //��Ϊʹ��֮�������Դ�ʱ���� ��1 ���� 2
		System.out.println(i++); //2   //����ֵ���Ǽ�1 ����ʱ�൱�� ��a = i++ �����Ǳ���
		System.out.println(i);//3   //iʹ��֮���ˣ����Լ�1 ����3
		
		int b = ++i;   //ֱ�Ӹ�ֵ������ʹ��֮ǰ��1 ���� 4

		System.out.println(b); //4
		System.out.println(i);  //4
		System.out.println(++i); //5

		 //�ܽ�i++  ԭֵ ++i ��1 
		// ����i��ֵ����+1
	}
}
