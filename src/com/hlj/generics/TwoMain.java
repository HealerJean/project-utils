package com.hlj.generics;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/** 
 * @author : HealerJean
 * @date   ： 2017年11月20日 下午2:50:52 
 * @Description: 2、反射的真正概念
 */
public class TwoMain {
	
	public static  void main(String[] args) {
		//listAddDifParam(); 
	//	testEquals();
		invokeMethod();
	}
	/**
	 list 添加不同类型的参数，结果会报错 
	 */
	private static void listAddDifParam() {
		List list = new ArrayList();  
		list.add("CSDN_SEU_Cavin");  
		list.add(100);  
		for (int i = 0; i < list.size(); i++) {  
		  String name = (String) list.get(i); //取出Integer时，运行时出现异常  
		System.out.println("name:" + name);  
		}
	}
	/**
	 * 
	 * 所有反射的操作都是在运行时的，所以使用class来验证测试，，
	 * 	结果为：Java中编译后的class不会包含泛型信息
	 * 既然为true，就证明了编译之后， 程序会采取去泛型化的措施，也就是说Java中的泛型，只在编译阶段有效
	 * 成功编译过后的class文件中是不包含任何泛型信息的。泛型信息不会进入到运行时阶段。
	 */
	private static void testEquals() {
		ArrayList<String> a = new ArrayList<String>();  
		ArrayList b = new ArrayList();  
		Class c1 = a.getClass();  
		Class c2 = b.getClass();  
		
		System.out.println(c1 == c2); //true   表示已经经过编译了
	}
	
	
	/**
	 * 
	 * @author :HealerJean: 
	 * @date   :2017年11月20日 下午1:09:10 
	 * @Description:
	 * @param al   使用反射 
	 * void 验证 listAddDifParam 和 testEquals 中的问题
	 */
	
	private static void invokeMethod() {
		ArrayList<String> a = new ArrayList<String>();  
		Class c = a.getClass();  
		
		a.add("CSDN_SEU_Cavin");  
		try{  
		    Method method = c.getMethod("add",Object.class);  
		    method.invoke(a,100);  
		    System.out.println(a);  //[CSDN_SEU_Cavin, 100]  
		}catch(Exception e){  
		    e.printStackTrace();  
		}  
	} 
	
	
	
	private static void wildcard() {
		List<Integer> ex_int= new ArrayList<Integer>();    
	////非法的  List<Number> ex_num = ex_int; 
	}
}
