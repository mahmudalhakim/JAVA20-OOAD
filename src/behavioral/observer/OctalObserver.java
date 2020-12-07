package behavioral.observer;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-07
 * Time: 09:52
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class OctalObserver extends Observer {

  public OctalObserver(Subject subject) {
    this.subject = subject;
    this.subject.attach(this);
  }

  @Override
  public void update() {
    System.out.println("Octal: " + Integer.toOctalString(subject.getState()));
  }
}
