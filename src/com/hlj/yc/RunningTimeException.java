package com.hlj.yc;


import org.junit.Test;

import com.hlj.yc.ClassCaseException.FatherClass;
import com.hlj.yc.ClassCaseException.SonClass;
import com.hlj.yc.ClassCaseException.SonTwoClass;
import com.hlj.yc.NullPointException.NullPointService;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��20�� ����10:13:32 
 * @Description:
 */
public class RunningTimeException {

	/**
	 * 1��java.lang.ArithmeticException: / by zero
	 */
	@Test
	public void testArithmeticException(){
		int i = 1/0 ;
	}
	
	/**
	 * 2��java.lang.ClassCastException
	         ����ת���쳣
		SonClass SonTwoClass ������ͬ�ĸ��࣬�������Ƕ����ǲ���ǿ��ת�͵�
		java.lang.ClassCastException: com.hlj.yc.ClassCaseException.SonClass cannot be cast to com.hlj.yc.ClassCaseException.SonTwoClass

	 */
	@Test
	public void testClasscastException(){
		
		FatherClass sonClass = new SonClass();
		FatherClass sonTwoClass = new SonTwoClass();
		
		SonTwoClass classOk = (SonTwoClass)sonTwoClass;

		//�׳��쳣 ClassCastException
		SonTwoClass classCastExceptionClass = (SonTwoClass)sonClass;
		
		
	}
	
	/**
	 3 ��NullPointerException
	  	��ָ���쳣
	 java.lang.NullPointerException at com.hlj.yc.RunningTimeException.testNullPointException(RunningTimeException.java:53)
	
	 */
	@Test
	public void testNullPointException(){
		
		NullPointService nullPointService = null; 
		nullPointService.method();
	}
	
	
	

}
