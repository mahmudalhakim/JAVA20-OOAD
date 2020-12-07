package behavioral.observer;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-07
 * Time: 09:32
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public abstract class Observer {
  protected Subject subject;

  public abstract void update();
}
