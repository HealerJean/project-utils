package com.hlj.DynamicProxy;

 
public class RealSubject implements Subject   
{

	@Override
	public void one() {
		System.out.println("方法1 one");
	}

	@Override
	public void two() {
		System.out.println("方法2 two");
		
	}   
  
}