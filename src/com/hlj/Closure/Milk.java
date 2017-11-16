package com.hlj.Closure;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月16日 下午3:24:00 
 * @Description: 闭包的使用
 */
public class Milk {
	
	public final static String name = "纯牛奶";//名称
	
	private static int num = 16;//数量
	
	public Milk()
	{
		System.out.println(name+"：16/每箱");
	}
	
	/**
	 * 闭包，通过调用Active的方法实现对Milk私有变量num进行修改。
	 * @return 返回一个喝牛奶的动作
	 */
	public Active HaveMeals(){
		return new Active(){
			public void drink(){
				if(num == 0){
					System.out.println("木有了，都被你丫喝完了.");
					return;
				}
				num--;
				System.out.println("喝掉一瓶牛奶");
			}
		};
	}
	
	/**
	 * 获取剩余数量
	 */
	public void currentNum()
	{
		System.out.println(name+"剩余："+num);
	}
}

/**
 * 通用接口
 */
interface Active
{
	void drink();
}