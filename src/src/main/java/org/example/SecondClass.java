package org.example;

public class SecondClass {
  int a;

  public SecondClass(int a) {
    this.a = a;
  }

  public int oneMethod(int a) {
    return a * a;
  }

  private int twoMethod(int a) {
    return a + 100;
  }

  public static void main(String[] args) {
    SecondClass object = new SecondClass(15);
    System.out.println(object.oneMethod(object.a));
    System.out.println(object.twoMethod(object.a));

         System.out.println(object.twoMethod(object.a));

  }
}
