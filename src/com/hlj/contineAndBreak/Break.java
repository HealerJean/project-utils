package com.hlj.contineAndBreak;
public class Break {
	public static void main(String[] args) {
		Break test2 = new Break();
		//test2.add(5);
		test2.breakOut();
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

	private void breakOut(){
		//��ǩ�Լ�д
		a:
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(i+"---"+j);
				//��j=2ʱ����outer��ʶ��ָ����ѭ��
				if(j==2){
					break a;
				}
			}
		}
	}
}