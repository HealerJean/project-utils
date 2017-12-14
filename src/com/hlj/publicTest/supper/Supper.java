package com.hlj.publicTest.supper;

import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��14�� ����10:32:52 
 * @Description:
 */
public class Supper extends  SupperFather{
 
	
	/**
	 * һ���޲ι�����
	 *  1��д��д  	super(); ������ø����еĹ�����
	 */
	public Supper(){
		super();
		System.out.println( "Son supper constructor");
		System.out.println("---------------------");
	}
	
	/**
	 * �����вι�����
		  1������ дsuper() ��   super(str) ����ø����еĹ�����
		  2����д supprʱ�����޲ι����������Զ�ִ�� ������supper()
	 */
	public Supper(String str){
		// 1��ʲô����д���������ø����е� supper()
		
		// 2������ø����е��вι����� ����������޲ι�����
		super(str); 
		System.out.println( "Son supper param constructor");
		System.out.println("---------------------");

	}
	
		
	
	/**
	 * �������ǹ������ķ���
		1�� super() �� ��ͬ���� ֻ�����ڹ�������
		2��super.���෽��  ���Է������ⷽ��������λ��
	 */
	public void otheMethod(){
		super.otheMethod();
		System.out.println("Supper Method Test Supper");
		super.otheMethod();
		System.out.println("---------------------");

	}
	

}
