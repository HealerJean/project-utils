package com.hlj.ijj;

public class Ijj {
	public static void main(String[] args) {
		
		a(1);
		
		
	}
	public static void a(int i){

	
		int a = i++;   //直接赋值的话，还是保留原来的数字。所以a等于1
		System.out.println(i); //2   //这里i的值就是2了

		System.out.println(a); //1  

		System.out.println(i);  //因为使用之后了所以此时就是 加1 就是 2
		System.out.println(i++); //2   //不赋值就是加1 ，此时相当于 是a = i++ ，还是保留
		System.out.println(i);//3   //i使用之后了，所以加1 等于3
		
		int b = ++i;   //直接赋值，所以使用之前加1 就是 4

		System.out.println(b); //4
		System.out.println(i);  //4
		System.out.println(++i); //5

		 //总结i++  原值 ++i 加1 
		// 但是i的值都会+1
	}
}
