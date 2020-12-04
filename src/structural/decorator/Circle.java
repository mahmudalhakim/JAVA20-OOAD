package structural.decorator;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-04
 * Time: 10:05
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class Circle implements Shape {
  @Override
  public void draw() {
    System.out.println("This is a circle!");
  }
}
