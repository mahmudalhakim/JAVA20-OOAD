package relationships.composition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-30
 * Time: 09:24
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class Order {
  private int id;
  private List<LineItem> lineItems;

  public Order(int id) {
    this.id = id;
    this.lineItems = new ArrayList<LineItem>();
  }

  public void addLineItem(int id, int quantity, Product product){
    this.lineItems.add(new LineItem(id, quantity, product));
  }

  @Override
  public String toString() {
    return "Order{" +
        "id=" + id +
        ", lineItems=" + lineItems +
        '}';
  }
}
