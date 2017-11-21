package com.hlj.designpatterns.Builder;
/** 
 * @author : HealerJean
 * @date   �� 2017��11��21�� ����2:07:04 
 * @Description:
 */
public class TestMain {
	
	   public static void main(String[] args) {
	      MealBuilder mealBuilder = new MealBuilder();

	      Meal vegMeal = mealBuilder.prepareVegMeal();
	      System.out.println("Veg Meal");
	      vegMeal.showItems();
	      System.out.println("Total Cost: " +vegMeal.getCost());

	      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	      System.out.println("\n\nNon-Veg Meal");
	      nonVegMeal.showItems();
	      System.out.println("Total Cost: " +nonVegMeal.getCost());
	   }
}