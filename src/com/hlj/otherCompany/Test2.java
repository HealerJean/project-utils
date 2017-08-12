package com.hlj.otherCompany;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("123");
		Test2 test2 = new Test2();
		test2.add(5);
	}

	private void add(int a) { 
		// TODO Auto-generated method stub
		for (int i = 1 ; i < 3 ; i++){
			for(int j = 1 ; j < 3 ; j++){
				if(a==5){
					continue;
				}
				System.out.println(i * j);
			}
		}
	}
}
