package structural.decorator;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-04
 * Time: 10:07
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public abstract class ShapeDecorator implements Shape {
  protected Shape decoratedShape;

  public ShapeDecorator(Shape decoratedShape) {
    this.decoratedShape = decoratedShape;
  }

  public void draw() {
    decoratedShape.draw();
  }

}
