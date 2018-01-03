package com.hlj.contineAndBreak;
public class Continue {
	public static void main(String[] args) {
		Continue test2 = new Continue();
		test2.add(5);
	}

	private void add(int a) { 
		// 
		for (int i = 1 ; i < 3 ; i++){
			for(int j = 1 ; j < 3 ; j++){
				if(a==5){
					System.out.println(j);
					continue;
				}
				System.out.println(i * j);
			}
		}
	}
	// 1 2 1 2 
}