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
	//��ѭ�� ֻ��ִ��2��  Ҳ���� ABDC BDC  
	//�����B ��foo(B)�����ж�ʱ��ִ�е� ��������ѭ������
	//������foo(C)����ѭ��ÿ��ִ����ϵ�ʱ��ִ�е�
	
	 //foo('A') ֻ��ִ��һ�Σ���Ϊ����ǳ�ʼ������  
	//���н��ΪABDC BDCB
}
