package behavioral.strategy;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-07
 * Time: 10:49
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class OperationAdd implements Strategy {
  @Override
  public int doOperation(int num1, int num2) {
    return num1 + num2;
  }
}
