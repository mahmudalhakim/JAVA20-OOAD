package creational.builder;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-20
 * Time: 10:39
 * Project: Design-Patterns-Demo
 * Copyright: MIT
 */
public class VegBurger extends Burger {
  @Override
  public String name() {
    return "Veg Burger";
  }

  @Override
  public double price() {
    return 25;
  }
}
