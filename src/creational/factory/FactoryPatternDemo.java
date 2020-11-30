package creational.factory;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-30
 * Time: 10:56
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class FactoryPatternDemo {

  public static void main(String[] args) {

    ShapeFactory shapeFactory = new ShapeFactory();


    Shape shape1 = shapeFactory.getShape("Square");
    Shape shape2 = shapeFactory.getShape("Circle");
    Shape shape3 = shapeFactory.getShape("Rectangle");

    shape1.draw();
    shape2.draw();
    shape3.draw();

    Shape shape4 = shapeFactory.getShape("rect");
    shape4.draw();

  }
}
