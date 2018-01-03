package com.hlj.contineAndBreak;
public class Break {
	public static void main(String[] args) {
		Break test2 = new Break();
		test2.add(5);
	}

	private void add(int a) { 
		// 
		for (int i = 1 ; i < 3 ; i++){
			for(int j = 1 ; j < 3 ; j++){
				if(a==5){
					System.out.println(j);
					break;
				}
				System.out.println(i * j);
			}
		}
	} 
	// 1 1 
}