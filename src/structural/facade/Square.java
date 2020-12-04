package structural.facade;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-04
 * Time: 11:20
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class Square implements Shape {
  @Override
  public void draw() {
    System.out.println("This is a Square!");
  }
}
