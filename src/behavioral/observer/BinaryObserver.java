package behavioral.observer;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-07
 * Time: 09:52
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class BinaryObserver extends Observer {

  public BinaryObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("Binary: " + Integer.toBinaryString(subject.getState()));
  }
}
