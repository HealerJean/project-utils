package com.hlj.equils;

public class EquilsTest {
	public static void main(String[] args) {
		dy();
		//== 地址相同，equit 變量相同
	}
	public static void dy(){
		
		String a = "132456";
		String a2 = "132456";

		String abuilder = new String("123456");
		String abuilder2 = new String(abuilder);

		String ab = new String(abuilder);
		if(a==a2){ //a a2 地址相同
			System.out.println("a==a2"); //成立
		}else {
			System.out.println("a !=a2");
		}
		
		if(a==abuilder){//a abuilder 地址不同
			System.out.println("a==abuilder"); 
		}else {
			System.out.println("a !=abuilder");//成立
		}
		
		if(a.equals(abuilder)){ //地址所指向的对象 不同
			System.out.println("a==abuilder"); 
		}else {
			System.out.println("a !equals =abuilder");//成立
		}
		
		if(abuilder==abuilder2){ //地址不同
			System.out.println("abuilder = abuilder2");
		}else {
			System.out.println("abuilder != abuilder2"); //成立
		}
		
		if(abuilder.equals(abuilder2)){
			System.out.println("abuilder equals= abuilder2"); //成立
		}else {
			System.out.println("abuilder !equals= abuilder2");
		}
		
		/**
		 1、
		 String类中的equals()方法很明显是仅仅进行了对象内容的比较，而没有比较对象存储地址,
		 					这是因为String类重写了equals()方法和hashCode()方法，
		 					
		 ==           较对象引用地址是否相等。   还要比较对象内容相等
		  
		 2、
		 * 对象的== 和equals
		  
			 默认情况 下 equals()和hashCode()都是从Object类中继承而来的，
			 而Object中equals()默认实现的是比较两个对象是否==，即默认的equals()和==的效果是一样的
			 Object中equels方法如下
			     public boolean equals(Object obj) {
	        		return (this == obj);
	    		} 
			 
		 * 对象的equals比较是先通过 对象的hashcode 值找到房子（位置），再看看地址是不是一样，
		 * Object的地址在创建的时候就会不一样的，
		 * hashcode 用来确定对象的位置（房子），再比较对象内容
		 * 
		 * == 是比较地址和内容都是不是相同
		 */
		
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		System.out.println(person1.hashCode()+"\n"+person2.hashCode()); // 不相等 
		System.out.println(person1==person2); //false 
		System.out.println(person1.equals(person2)); //false 
		
		
		
	}
}
