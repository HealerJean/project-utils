package com.hlj.trycatch;

public class TryTest {
	int a = 0;
	public static void main(String[] args) {
		TryTest t = new TryTest();
		t.nocatch();
		t.manycatch();
		System.out.println(t.returnSx());
	}
	//����ִ��
	private void nocatch() {
		// TODO Auto-generated method stub
		try {
			System.out.println("123s");
		} finally{
			System.out.println("456s");	
		}
	}
	
	private void manycatch() {
		// TODO Auto-generated method stub
	
		try {
			System.out.println("123s");
		}catch(Exception E){
			
		} finally{
			System.out.println("456s");	
		}
	}
	
		private int returnSx() {
			// TODO Auto-generated method stub	
		            try
		              {
		                  a = 2;
		                  throw new Exception();
		              }
		               catch (Exception ex)
		               {
		                   a = 3;
		                   return a;
		               //    System.out.println("����catch��ִ��"); //������д������  ��Ϊ����return
		              }
		               finally
		               {
		            	   System.out.println("����finally��ִ���ǲ�����returnǰ��");
		                   a = 5; 
		                   return a;  //���û��������Ƿ��ص� 3 ���������������Ƿ��ص�5
		               }
		           }

}
	
