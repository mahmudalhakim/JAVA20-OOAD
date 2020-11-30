package relationships.composition;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-30
 * Time: 09:40
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class LineItem {

  private int id;
  private int quantity;
  private Product product;

  public LineItem(int id, int quantity, Product product) {
    this.id = id;
    this.quantity = quantity;
    this.product = product;
  }

  @Override
  public String toString() {
    return "LineItem{" +
        "id=" + id +
        ", quantity=" + quantity +
        ", product=" + product +
        '}';
  }
}
