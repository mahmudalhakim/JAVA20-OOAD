package creational.builder.exercise;

/**
 * Created by Mahmud Al Hakim
 * Date: 2020-10-20
 * Time: 10:50
 * Project: Design-Patterns-Demo
 * Copyright: MIT
 */
public class StringBuilderDemo {
  public static void main(String[] args) {
    String s1 = "Ni talar bra latin";
    s1 = s1.replace(" ", "");

    StringBuilder sb = new StringBuilder(s1);
    sb.reverse();
    String s2 = sb.toString().replace(" ", "");

    if (s1.equalsIgnoreCase(String.valueOf(s2)))
      System.out.println("Palindrome");
    else
      System.out.println("Not Palindrome!");

  }
}
