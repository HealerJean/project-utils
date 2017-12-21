package com.hlj.publicTest.abstracts;


/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 下午5:35:54 
 * @Description:
 */
public class AbstractSon extends AbstractClass{

	
	/**
	 * 来自接口中的方法（也是来自抽象中的方法）
	 */
	@Override
	public int a() {
		System.out.println("HealerJean");
		return 0;
	}

	@Override
	public int b() {
		return 0;
	}



}
