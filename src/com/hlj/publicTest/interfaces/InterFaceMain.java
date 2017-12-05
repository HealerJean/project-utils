package com.hlj.publicTest.interfaces;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 下午2:42:25 
 * @Description:
 */
public class InterFaceMain {
		
	public static void main(String[] args) {
		//不能赋值因为默认 就是 public static final 	
		//InterfaceMe.a = 5;
			System.out.println(InterfaceMe.a); 
		}
}
interface InterfaceMe{
	
	int a = 1;
	
}