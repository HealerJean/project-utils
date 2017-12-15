package com.hlj.publicTest.finals;
/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年11月7日 上午9:50:55 
 * 类说明 
 */
public class FinalTest {
	//1、final 全局变量 定义必须给出值，否则错误
	//final static String aString ;
	final static String aString = null ;
	
	public static void m(){
		//2、 aString = "12";// 错误，全局变量final定义的，不能够改变
		
		//3、 方法里面的可以先不给值 ，下面456 赋值
		final String bString ;
		bString = "456";
		//4、bString = "456"; 上面已经给值了，不可以重新赋值
	}
}
