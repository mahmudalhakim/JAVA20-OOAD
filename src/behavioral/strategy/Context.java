package behavioral.strategy;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-07
 * Time: 10:52
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class Context {
  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public int executeStrategy(int num1, int num2) {
    return strategy.doOperation(num1, num2);
  }
}
