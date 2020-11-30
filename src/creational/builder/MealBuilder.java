package creational.builder;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-20
 * Time: 10:43
 * Project: Design-Patterns-Demo
 * Copyright: MIT
 */
public class MealBuilder {

  public Meal prepareVegMeal() {
    Meal meal = new Meal();
    meal.addItem(new VegBurger());
    meal.addItem(new Coke());
    return meal;
  }

  public Meal prepareNonVegMeal() {
    Meal meal = new Meal();
    meal.addItem(new ChickenBurger());
    meal.addItem(new Pepsi());
    return meal;
  }
}

