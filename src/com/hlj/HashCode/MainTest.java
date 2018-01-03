package com.hlj.HashCode;

import org.apache.ibatis.jdbc.Null;
import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月28日 下午5:59:51 
 * @Description:
 */
public class MainTest {
	
	@Test
	public void testObject(){
		
		Object  object = new Object();
		
		
		System.out.println(object.hashCode()); 
	}
}
