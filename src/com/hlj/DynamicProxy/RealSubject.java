package com.hlj.DynamicProxy;

 
public class RealSubject implements Subject   
{

	@Override
	public void one() {
		System.out.println("����1 one");
	}

	@Override
	public void two() {
		System.out.println("����2 two");
		
	}   
  
}