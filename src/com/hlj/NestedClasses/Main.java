package com.hlj.NestedClasses;

import com.hlj.NestedClasses.StaticAndNoStaticClass.NoStaticClass;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月14日 下午1:48:24 
 * @Description:
 */
public class Main {
	public static void main(String[] args) {
		//报错 静态内部类 不能直接new出来
		//NoStaticClass noStaticClass = new NoStaticClass();
		
		NoStaticClass noStaticClass = new StaticAndNoStaticClass().new NoStaticClass();
		noStaticClass.display();
	}
}
