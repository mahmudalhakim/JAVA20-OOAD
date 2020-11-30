package relationships.composition;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-30
 * Time: 09:23
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class Product {
  private int id;
  private String name;
  private double price;

  public Product(int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", price=" + price +
        '}';
  }
}
