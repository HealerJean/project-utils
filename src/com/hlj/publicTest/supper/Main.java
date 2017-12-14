package com.hlj.publicTest.supper;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月14日 上午10:36:56 
 * @Description:
 */
public class Main {
	
	@Test
	public  void testSupperFatherConstrustor() {
		Supper supper = new Supper();
		SupperFather supperFather = new Supper();
		
	}
	
	@Test
	public void testSupperFatherParamConstrustor() throws Exception {
		String str  = "HealerJean";
		SupperFather supperFatherParam = new Supper(str);

	}
	
	@Test
	public void testOtherMethod() {
		SupperFather supperFatherParam = new Supper();
		supperFatherParam.otheMethod();
	}
	
	
}
