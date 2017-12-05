package com.hlj.publicTest.privates;



/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年11月1日 上午9:11:17 
 * 类说明 
 */
public class PrivateTest {
	private int a;
}
class Bmain{
	
	
	public void testName() throws Exception {
		PrivateTest privateTest = new PrivateTest();
// 错误的，只能在同类中使用		privateTest.a; 
	}
}

class Son extends PrivateTest{
	
	public void test() {
//		a= ;
	}
}
