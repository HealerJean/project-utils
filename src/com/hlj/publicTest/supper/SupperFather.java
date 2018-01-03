package com.hlj.publicTest.supper;

import java.lang.reflect.Method;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月14日 上午10:33:31 
 * @Description:
 */
public class SupperFather {

	public SupperFather(){
		System.out.println("SupperFather supper constructor");
	}
	
	public SupperFather(String str){
		System.out.println("SupperFather supper  Param constructor "+ str);
	}
	
	public void otheMethod(){
		System.out.println("SupperFather Method Test Supper");
	}	
}
