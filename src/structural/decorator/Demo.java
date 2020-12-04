package structural.decorator;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-04
 * Time: 10:20
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class Demo {

  public static void main(String[] args) {
    Shape circle = new Circle();
    circle.draw();

    System.out.println();

    Shape redCircle = new RedShapeDecorator(circle);
    redCircle.draw();
    redCircle = null;

    System.out.println();

    Shape redRectangle = new RedShapeDecorator(new Rectangle());
    redRectangle.draw();


  }

}
