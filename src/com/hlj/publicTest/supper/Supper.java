package com.hlj.publicTest.supper;

import org.junit.Test;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月14日 上午10:32:52 
 * @Description:
 */
public class Supper extends  SupperFather{
 
	
	/**
	 * 一、无参构造器
	 *  1、写不写  	super(); 都会调用父类中的构造器
	 */
	public Supper(){
		super();
		System.out.println( "Son supper constructor");
		System.out.println("---------------------");
	}
	
	/**
	 * 二、有参构造器
		  1、下面 写super() 和   super(str) 会调用父类中的构造器
		  2、不写 suppr时候，像无参构造器那样自动执行 父类中supper()
	 */
	public Supper(String str){
		// 1、什么都不写会主动调用父类中的 supper()
		
		// 2、会调用父类中的有参构造器 ，不会调用无参构造器
		super(str); 
		System.out.println( "Son supper param constructor");
		System.out.println("---------------------");

	}
	
		
	
	/**
	 * 三、不是构造器的方法
		1、 super() 等 相同类型 只能用在构造器中
		2、super.父类方法  可以放在任意方法的任意位置
	 */
	public void otheMethod(){
		super.otheMethod();
		System.out.println("Supper Method Test Supper");
		super.otheMethod();
		System.out.println("---------------------");

	}
	

}
