package behavioral.observer;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-12-07
 * Time: 09:59
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class Demo {

  public static void main(String[] args) {

    Subject subject = new Subject();

    new BinaryObserver(subject);
    new OctalObserver(subject);
    new HexObserver(subject);

    subject.setState(2);
    subject.setState(10);


  }
}
