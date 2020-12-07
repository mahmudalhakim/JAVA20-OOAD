package behavioral.strategy;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-07
 * Time: 10:54
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class Demo {
  public static void main(String[] args) {

    Context context1 = new Context(new OperationAdd());
    System.out.println("5+10=" + context1.executeStrategy(5, 10));

    Context context2 = new Context(new OperationSubtract());
    System.out.println("5-10=" + context2.executeStrategy(5, 10));

    Context context3 = new Context(new OperationMultiply());
    System.out.println("5*10=" + context3.executeStrategy(5, 10));


  }
}
