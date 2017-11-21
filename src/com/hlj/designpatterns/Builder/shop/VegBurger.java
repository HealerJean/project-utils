package com.hlj.designpatterns.Builder.shop;

import com.hlj.designpatterns.Builder.Item.Burger;

/** 
 * @author : HealerJean
 * @date   �� 2017��11��21�� ����2:04:45 
 * @Description:
 */
public class VegBurger extends Burger {

	   @Override
	   public float price() {
	      return 25.0f;
	   }

	   @Override
	   public String name() {
	      return "Veg Burger";
	   }
}