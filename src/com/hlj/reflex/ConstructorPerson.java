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

		System.out.println("�޲ι�����");

	}

	public ConstructorPerson(String str) {
		System.out.println("�в� String str ������");
 		this.str = str;
	}
	/**
	 * ˽�й��캯��
	 * @param str1
	 * @param str2
	 */
	private ConstructorPerson(String str1,int n) {
		System.out.println("�в� ˽�й�����");
 		this.str = str1;
	}
	
}
