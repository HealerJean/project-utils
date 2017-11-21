package com.hlj.designpatterns.Builder.shop;

import com.hlj.designpatterns.Builder.Item.Burger;

/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 下午2:05:08 
 * @Description:
 */
public class ChickenBurger extends Burger {

	   @Override
	   public float price() {
	      return 50.5f;
	   }

	   @Override
	   public String name() {
	      return "Chicken Burger";
	   }
}