package com.hlj.Closure;
/** 
 * @author : HealerJean
 * @date   ： 2017年11月16日 下午3:26:29 
 * @Description: 主函数调用 Mike 测试闭包
 */
public class PersonMain {
	/**
	 * 
	 * @author :HealerJean: 
	 * @date   :2017年11月16日 下午3:30:32 
	 * @Description:特别注意：闭包会导致资源不被回收，
	 * 				在main方法中将m设为null，使用haveMeals继续调用drink方法仍然会喝掉一瓶牛奶，
	 * 				说明Milk对象并没有被释放掉。
	 */
	
	
	public static void main(String[] args) {
		//买一箱牛奶
		Milk m = new Milk();
	//内部类，同下
		Active haveMeals = m.HaveMeals();
		
	// 调用静态内部类 
	//	Active haveMeals =  new Milk().new HaveMeals();
		//没事喝一瓶
		haveMeals.drink();
		//有事喝一瓶
		haveMeals.drink();
		
		//看看还剩多少？
		m.currentNum();
	}

}