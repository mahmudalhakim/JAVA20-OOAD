package structural.facade;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-04
 * Time: 11:26
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class Demo {

  public static void main(String[] args) {
    ShapeMaker shapeMaker = new ShapeMaker();
    shapeMaker.drawCircle();
    shapeMaker.drawRectangle();
    shapeMaker.drawSquare();
  }
}
