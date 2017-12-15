package com.hlj.codeOptimize;

import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��15�� ����9:58:04 
 * @Description:
 */
public class StringTest {
	
	/**
	 * �Ƚ��ٶ�
	String.toString() ��  String.valueOf() >  i + ""
	 * @author :HealerJean: 
	 ���
	 String.valueOf()��21ms
	 Integer.toString()��6ms
	 i + ""��38ms
	 */
	@Test
	public void testSpeed() {

		  int loopTime = 50000;
		    Integer i = 0;
		    
		    long startTime = System.currentTimeMillis();
		    for (int j = 0; j < loopTime; j++)
		    {
		        String str = String.valueOf(i);
		    }   
		    
		    System.out.println("String.valueOf()��" + (System.currentTimeMillis() - startTime) + "ms");
		    startTime = System.currentTimeMillis();
		    for (int j = 0; j < loopTime; j++)
		    {
		        String str = i.toString();
		    }    
		    
		    System.out.println("Integer.toString()��" + (System.currentTimeMillis() - startTime) + "ms");
		    startTime = System.currentTimeMillis();
		    for (int j = 0; j < loopTime; j++)
		    {
		        String str = i + "";
		    }    
		    System.out.println("i + \"\"��" + (System.currentTimeMillis() - startTime) + "ms");
}
}
