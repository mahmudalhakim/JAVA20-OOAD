package creational.fluent;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-20
 * Time: 11:40
 * Project: Design-Patterns-Demo
 * Copyright: MIT
 */
public class Person {

  private String name;
  private int age;
  private double weight;
  private double length;

  public Person(String name, int age, double weight, double length) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.length = length;
  }

  public Person() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", weight=" + weight +
        ", length=" + length +
        '}';
  }
}
