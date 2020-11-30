package creational.fluent;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-20
 * Time: 11:52
 * Project: Design-Patterns-Demo
 * Copyright: MIT
 */
public class FluentBuilderDemo {
  public static void main(String[] args) {

    // Without a Builder
    Person p5 = new Person("", 0, 0, 0);
    System.out.println(p5);

    Person p1 = new Person("Mahmud", 40, 80, 1.7);
    System.out.println(p1);

    Person p3 = new Person();
    p3.setName("Teston");


    // With a Fluent Builder
    PersonBuilder p2 = new PersonBuilder()
        .setName("Mahmud")
        .setWeight(90)
        .setLength(1.7)
        .setAge(40);
    System.out.println(p2);

  }
}
