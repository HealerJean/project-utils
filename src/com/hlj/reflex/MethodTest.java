package com.hlj.reflex;

import java.lang.reflect.Method;


public class MethodTest {
    public static void main(String[] args) {
       // two 
    	getMethodSome();
    	// one getMethods();
    }

    private static void getMethods() {
	    	Class<?> methodPersonClass = MethodPerson.class;
	        Method[] methods = methodPersonClass.getMethods();
	        for (Method method : methods) {
	            System.out.println(method);
	            System.out.println(method.getName());

	        }
        }
    /**
     * two
     */
	private static void getMethodSome() {
		Class<?> methodPersonClass = MethodPerson.class;
        try {
            Method setNameMethod = methodPersonClass.getMethod("setName",String.class);
            Method getNameMethod = methodPersonClass.getMethod("getName");
            MethodPerson methodPerson = (MethodPerson)methodPersonClass.newInstance();
           // Object methodPerson = herosClass.newInstance(); //同上
            
            setNameMethod.invoke(methodPerson,"setNameMethod.setName变量");
            /**
             * 1、如果 MethodPerson 类中  没有 toString 方法，则会打印出这个类的名字 
             * 
	             * 打印： 调用set方法：com.hlj.reflex.MethodPerson@6d06d69c
	         * 
             * 2、如果  MethodPerson 类中 有 toString 方法，则会打印ToString（）方法中的内容
	             * 打印： 调用set方法：MethodPerson [
						 name=setNameMethod.setName变量, 
						 type=null, 
						 camp=0
						]
             */
            System.out.println("调用set方法："+methodPerson);
            /**
             * 直接打印出getNname的结果值 ，上面已经赋值了，所以打印结果即可
             * 打印：调用get方法：setNameMethod.setName变量
             */
            System.out.println("调用get方法："+getNameMethod.invoke(methodPerson));
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}