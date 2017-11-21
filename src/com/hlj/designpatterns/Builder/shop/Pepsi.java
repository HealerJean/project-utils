package com.hlj.designpatterns.Builder.shop;

import com.hlj.designpatterns.Builder.Item.ColdDrink;

/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 下午2:05:45 
 * @Description:
 */
public class Pepsi extends ColdDrink {

	   @Override
	   public float price() {
	      return 35.0f;
	   }

	   @Override
	   public String name() {
	      return "Pepsi";
	   }
}