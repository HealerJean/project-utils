package com.hlj.reflex;

public class ConstructorPerson {
	String str ;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public ConstructorPerson() {

		System.out.println("无参构造器");

	}

	public ConstructorPerson(String str) {
		System.out.println("有参 String str 构造器");
 		this.str = str;
	}
	/**
	 * 私有构造函数
	 * @param str1
	 * @param str2
	 */
	private ConstructorPerson(String str1,int n) {
		System.out.println("有参 私有构造器");
 		this.str = str1;
	}
	
}
