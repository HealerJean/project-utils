package com.hlj.publicTest.privates;



/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��11��1�� ����9:11:17 
 * ��˵�� 
 */
public class PrivateTest {
	private int a;
}
class Bmain{
	
	
	public void testName() throws Exception {
		PrivateTest privateTest = new PrivateTest();
// ����ģ�ֻ����ͬ����ʹ��		privateTest.a; 
	}
}

class Son extends PrivateTest{
	
	public void test() {
//		a= ;
	}
}
