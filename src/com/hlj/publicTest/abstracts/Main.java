package com.hlj.publicTest.abstracts;

import com.hlj.designpatterns.ObserverPattern.main;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��21�� ����5:57:23 
 * @Description:
 */
public class Main {
	
	public static void main(String[] args) {
		AbstractInterface abstractInterface = new AbstractSon();
		abstractInterface.a();
	}
}
