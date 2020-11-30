package creational.fluent;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-20
 * Time: 11:40
 * Project: Design-Patterns-Demo
 * Copyright: MIT
 * <p>
 * Builder Pattern with "Fluent interface"
 * A fluent interface is normally implemented by using method cascading (or method chaining).
 */
public class PersonBuilder {

  private String name;
  private int age;
  private double weight;
  private double length;


  public String getName() {
    return name;
  }

  public PersonBuilder setName(String name) {
    this.name = name;
    return this;
  }


  public int getAge() {
    return age;
  }

  public PersonBuilder setAge(int age) {
    this.age = age;
    return this;
  }

  public double getWeight() {
    return weight;
  }

  public PersonBuilder setWeight(double weight) {
    this.weight = weight;
    return this;
  }

  public double getLength() {
    return length;
  }

  public PersonBuilder setLength(double length) {
    this.length = length;
    return this;
  }


  @Override
  public String toString() {
    return "PersonBuilder{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", weight=" + weight +
        ", length=" + length +
        '}';
  }
}
