package org.example;

public class SecondClass {
  int a;
  int b = 7;
  public SecondClass(int a) {
    this.a = a;
  }

  public int oneMethod(int a) {
    return a * a;
  }

  private int twoMethod(int a) {
    return a + 100;
  }

  private int threeMethod(int a, int b) {
    return Math.max(a, b);
  }

  public static void main(String[] args) {
    SecondClass object = new SecondClass(15);
    System.out.println(object.oneMethod(object.a));
    System.out.println(object.twoMethod(object.a));
    System.out.println(object.threeMethod(object.a, object.b));
  }
}
