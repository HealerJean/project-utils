package com.hlj.arithmetic.killperson;

import java.util.ArrayList;
import java.util.List;

/** 
 * @author : HealerJean
 * @date   �� 2017��11��23�� ����3:04:03 
 * @Description:
 */
public class ArrayListMain {
	
	public static void main(String[] args) {
		List<Person> persons= new ArrayList<Person>();
		Person person = new Person(0, "HealerJean");
		Person person2 = new Person(0, "HealerJean");
		persons.add(0,person);
		persons.add(3,person2); //������Ϊû�� 2
	}
}
