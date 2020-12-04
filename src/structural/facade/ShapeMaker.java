package structural.facade;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-04
 * Time: 11:22
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class ShapeMaker {
  private Shape circle;
  private Shape rectangle;
  private Shape square;

  public ShapeMaker() {
    this.circle = new Circle();
    this.rectangle = new Rectangle();
    this.square = new Square();
  }

  public void drawCircle() {
    circle.draw();
  }

  public void drawRectangle() {
    rectangle.draw();
  }

  public void drawSquare() {
    square.draw();
  }


}
