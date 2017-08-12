package com.hlj.reflex;

public class ClassTest {
	/**
	 * 构造函数
	 */
	public ClassTest() {
		System.out.println("ClassTest!");
	}
	  // 静态的参数初始化  
    static {  
        System.out.println("--静态的参数初始化--");  
    }  
    // 非静态的参数初始化  
    {  
        System.out.println("--非静态的参数初始化--");  
    }  
	public static void main(String[] args) throws Exception {
		//one testClass();

		// two testNewgetClass();
	}
	/**
	 * two
	 */
	private static void testNewgetClass() {
		Class<?> class1 = new ClassTest().getClass(); 
		/**
		 * 打印结果
		  --静态的参数初始化--
		  --非静态的参数初始化--
		  ClassTest!

		 */
	}
	/**
	 * one 
	 */
	private static void testClass() throws ClassNotFoundException,
			InstantiationException, IllegalAccessException {
		//毫无疑问，肯定是先执行 ，static 静态的参数初始化  
	/**
		类已加载并且这个类已连接，这是正是class的静态方法forName（）完成的工作。
	*/
	Class clazz = Class.forName("com.hlj.reflex.ClassTest"); //打印 --静态的参数初始化--
	System.out.println(clazz);  //打印 class com.hlj.reflex.ClassTest
	/**
	 * 1、使用newInstance可以解耦。使用newInstance的前提是，类已加载并且这个类已连接，
	 * 这是正是class的静态方法forName（）完成的工作。newInstance实际上是把new 这个方式分解为两步，
	 * 即，首先调用class的加载方法加载某个类，然后实例化
	   2、newInstance: 弱类型。低效率。只能调用无参构造。 new: 强类型。相对高效。能调用任何public构造。
	   3、 A a = (A)Class.forName("pacage.A").newInstance(); 
		这和下面的是一样的结果
		A a = new A()
	 */
	 clazz.newInstance()  ;//打印 --非静态的参数初始化-- +  ClassTest! 
	
	ClassTest classDemo = (ClassTest) clazz.newInstance(); //打印 --非静态的参数初始化-- +  ClassTest! 
	System.out.println(classDemo);//com.hlj.reflex.ClassTest@15db9742
	//等于上面两行代码
	System.out.println(new ClassTest() ); //打印 --非静态的参数初始化-- +  ClassTest!  + com.hlj.reflex.ClassTest@6d06d69c
	}
	

}
