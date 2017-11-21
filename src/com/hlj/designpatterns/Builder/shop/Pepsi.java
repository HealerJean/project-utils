package com.hlj.designpatterns.Builder.shop;

import com.hlj.designpatterns.Builder.Item.ColdDrink;

/** 
 * @author : HealerJean
 * @date   �� 2017��11��21�� ����2:05:45 
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