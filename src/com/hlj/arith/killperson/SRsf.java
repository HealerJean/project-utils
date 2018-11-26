package com.hlj.arith.killperson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 把犯人围城一圈，每次杀掉第七个，又从第八个开始杀掉第七个，直到剩下最后一个
 */
public class SRsf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int s = scanner.nextInt();
		List<Person> personlist = new ArrayList<Person>();
		System.out.println("人员有：");
		for (int i = 1; i < s; i++) {
			Person person = new Person(i, "" + i + "号");
			personlist.add(person);
			System.out.print(person.getName() + ",");
		}
		List<Person> list = killBody(personlist); // 开始杀第一个人，然后准备进入while循环
		while (list.size() > 6) {
			list = killBody(list);
		}
	}

	public static List<Person> killBody(List<Person> personlist) {
		List<Person> personlisttemp = new ArrayList<Person>();

		int num = 0; // i = 7 就是第8 个人，这就8开始计数了
		for (int i = 7; i < personlist.size(); i++) {
			personlisttemp.add(num, personlist.get(i));
			num += 1;
		}

		for (int i = 0; i < 6; i++) {
			personlisttemp.add(num, personlist.get(i));
			num += 1;
		}

		System.out.println();
		System.out.println("杀人：");
		for (int i = 0; i < personlisttemp.size(); i++) {
			Person person = personlisttemp.get(i);
			System.out.print(person.getName() + ",");
		}
		System.out.println();
		return personlisttemp;
	}

}