package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-07
 * Time: 09:42
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class Subject {

  private List<Observer> observers = new ArrayList<>();
  private int state;

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
    notifyAllObservers();
  }

  public void attach(Observer observer) {
    observers.add(observer);
  }

  public void notifyAllObservers() {
    for (Observer observer : observers)
      observer.update();
  }
}
