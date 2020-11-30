package creational.builder;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-20
 * Time: 10:39
 * Project: Design-Patterns-Demo
 * Copyright: MIT
 */
public class Coke extends ColdDrink {
  @Override
  public String name() {
    return "Coke";
  }

  @Override
  public double price() {
    return 30;
  }
}
