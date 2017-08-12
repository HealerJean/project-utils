package com.hlj.trycatch;

public class TryTest {
	int a = 0;
	public static void main(String[] args) {
		TryTest t = new TryTest();
		t.nocatch();
		t.manycatch();
		System.out.println(t.returnSx());
	}
	//可以执行
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
		               //    System.out.println("测试catch的执行"); //不可以写东西了  因为有了return
		              }
		               finally
		               {
		            	   System.out.println("测试finally的执行是不是在return前面");
		                   a = 5; 
		                   return a;  //如果没有这个则是返回的 3 ，如果加上这个则是返回的5
		               }
		           }

}
	
