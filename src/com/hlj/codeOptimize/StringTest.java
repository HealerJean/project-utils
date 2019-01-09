package com.hlj.codeOptimize;

import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月15日 上午9:58:04 
 * @Description:
 */
public class StringTest {
	
	/**
	 * 比较速度
	String.toString() 》  String.valueOf() >  i + ""
	 * @author :HealerJean: 
	 结果
	 String.valueOf()：21ms
	 Integer.toString()：6ms
	 i + ""：38ms
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
		    
		    System.out.println("String.valueOf()：" + (System.currentTimeMillis() - startTime) + "ms");
		    startTime = System.currentTimeMillis();
		    for (int j = 0; j < loopTime; j++)
		    {
		        String str = i.toString();
		    }    
		    
		    System.out.println("Integer.toString()：" + (System.currentTimeMillis() - startTime) + "ms");
		    startTime = System.currentTimeMillis();
		    for (int j = 0; j < loopTime; j++)
		    {
		        String str = i + "";
		    }    
		    System.out.println("i + \"\"：" + (System.currentTimeMillis() - startTime) + "ms");
}
}
