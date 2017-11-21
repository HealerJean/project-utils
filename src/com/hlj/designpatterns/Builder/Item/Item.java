package com.hlj.designpatterns.Builder.Item;

import com.hlj.designpatterns.Builder.Packing.Packing;

/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 下午2:01:05 
 * @Description: 商品类目  
 */
public interface Item {
	
	   public String name(); //名字
	   public Packing packing(); //包装
	   public float price();     //价格
}