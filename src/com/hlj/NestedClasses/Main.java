package com.hlj.NestedClasses;

import com.hlj.NestedClasses.StaticAndNoStaticClass.NoStaticClass;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��14�� ����1:48:24 
 * @Description:
 */
public class Main {
	public static void main(String[] args) {
		//���� ��̬�ڲ��� ����ֱ��new����
		//NoStaticClass noStaticClass = new NoStaticClass();
		
		NoStaticClass noStaticClass = new StaticAndNoStaticClass().new NoStaticClass();
		noStaticClass.display();
	}
}
