package relationships.aggregation;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-30
 * Time: 09:24
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class Order {
  private int id;
  private int quantity;
  private Product product;

  public Order(int id, int quantity, Product product) {
    this.id = id;
    this.quantity = quantity;
    this.product = product;
  }

  @Override
  public String toString() {
    return "Order{" +
        "id=" + id +
        ", quantity=" + quantity +
        ", product=" + product +
        '}';
  }
}
