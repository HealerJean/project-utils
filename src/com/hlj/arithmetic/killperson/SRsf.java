package com.hlj.arithmetic.killperson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * �ѷ���Χ��һȦ��ÿ��ɱ�����߸����ִӵڰ˸���ʼɱ�����߸���ֱ��ʣ�����һ��
 */
public class SRsf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int s = scanner.nextInt();
		List<Person> personlist = new ArrayList<Person>();
		System.out.println("��Ա�У�");
		for (int i = 1; i < s; i++) {
			Person person = new Person(i, "" + i + "��");
			personlist.add(person);
			System.out.print(person.getName() + ",");
		}
		List<Person> list = killBody(personlist); // ��ʼɱ��һ���ˣ�Ȼ��׼������whileѭ��
		while (list.size() > 6) {
			list = killBody(list);
		}
	}

	public static List<Person> killBody(List<Person> personlist) {
		List<Person> personlisttemp = new ArrayList<Person>();

		int num = 0; // i = 7 ���ǵ�8 ���ˣ����8��ʼ������
		for (int i = 7; i < personlist.size(); i++) {
			personlisttemp.add(num, personlist.get(i));
			num += 1;
		}

		for (int i = 0; i < 6; i++) {
			personlisttemp.add(num, personlist.get(i));
			num += 1;
		}

		System.out.println();
		System.out.println("ɱ�ˣ�");
		for (int i = 0; i < personlisttemp.size(); i++) {
			Person person = personlisttemp.get(i);
			System.out.print(person.getName() + ",");
		}
		System.out.println();
		return personlisttemp;
	}

}