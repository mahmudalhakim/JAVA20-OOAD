package structural.decorator;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-04
 * Time: 10:15
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class RedShapeDecorator extends ShapeDecorator {
  public RedShapeDecorator(Shape decoratedShape) {
    super(decoratedShape);
  }

  @Override
  public void draw() {
    decoratedShape.draw();
    setRedBorder(decoratedShape);
  }

  private void setRedBorder(Shape decoratedShape) {
    System.out.println("Border color is red!");
  }
}
