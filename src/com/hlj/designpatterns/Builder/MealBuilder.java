package com.hlj.designpatterns.Builder;

import com.hlj.designpatterns.Builder.shop.ChickenBurger;
import com.hlj.designpatterns.Builder.shop.Coke;
import com.hlj.designpatterns.Builder.shop.Pepsi;
import com.hlj.designpatterns.Builder.shop.VegBurger;

/** 
 * @author : HealerJean
 * @date   ： 2017年11月21日 下午2:06:33 
 * @Description:
 */
public class MealBuilder {

	   public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      return meal;
	   }
}