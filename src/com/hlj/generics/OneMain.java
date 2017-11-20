package com.hlj.generics;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * @author :HealerJean: 
 * @date   :2017年11月20日 下午2:45:44 
 * @Description: 以下两个表明了T和？号的区别，但如果是T的话 函数里面可以对T进行操作
 * @param al    
 * void
 */
public class OneMain {
	
	/**
	 	? 的使用
	 */
	public static void printColl(ArrayList<?> al){
        Iterator<?> it = al.iterator();
        while(it.hasNext())
        {
               System.out.println(it.next().toString());
        }
	}
	/**
		T 的使用，可以直接当做方法使用哦，函数里面可以对T进行操作
	 */
	public static <T> void printT(ArrayList<T> al){
        Iterator<T> it = al.iterator();
        while(it.hasNext())
        {
        	T it1 = it.next();
        	System.out.println(it1.toString());
        }
	}
	
	
}
