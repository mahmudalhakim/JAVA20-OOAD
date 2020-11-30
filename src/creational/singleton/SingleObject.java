package creational.singleton;

import java.util.Random;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-11-30
 * Time: 10:35
 * Project: JAVA20-OOAD
 * Copyright: MIT
 */
public class SingleObject {

  private static final SingleObject instance = new SingleObject();
  private int random = new Random().nextInt(100);

  private SingleObject() {
  }

  public static SingleObject getInstance(){
    return instance;
  }

  public void getMessage(){
    System.out.println("My random number is " + this.random);
  }


}
