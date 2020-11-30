package relationships.composition;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-30
 * Time: 09:28
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class demo {
  public static void main(String[] args) {

    Product p1 = new Product(1, "MacBook Air", 9000);
    Product p2 = new Product(2, "MacBook Pro", 12000);

    Order o1 = new Order(1);
    o1.addLineItem(1, 5, p1);
    o1.addLineItem(2, 3, p2);

    System.out.println(o1);

    o1 = null;

    Order o2 = new Order(2);
    System.out.println("Lägg till dessa produkter till \n"+
        o2 + "\n " +
        p1 +  "\n" + p2
        );

  }
}
