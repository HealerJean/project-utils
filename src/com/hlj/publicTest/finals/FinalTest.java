package com.hlj.publicTest.finals;
/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��11��7�� ����9:50:55 
 * ��˵�� 
 */
public class FinalTest {
	//1��final ȫ�ֱ��� ����������ֵ���������
	//final static String aString ;
	final static String aString = null ;
	
	public static void m(){
		//2�� aString = "12";// ����ȫ�ֱ���final����ģ����ܹ��ı�
		
		//3�� ��������Ŀ����Ȳ���ֵ ������456 ��ֵ
		final String bString ;
		bString = "456";
		//4��bString = "456"; �����Ѿ���ֵ�ˣ����������¸�ֵ
	}
}
