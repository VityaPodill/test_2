package org.example;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        System.out.println(diff(a,b));
        System.out.println(sum(a,b));
        System.out.println(mult(a,b));
        System.out.println(div(a,b));
    }
    private static int sum(int a,int b){
        return a+b;
    }
    private static int diff(int a,int b){
        return a-b;
    }
    private static int mult(int a,int b){
        return a*b;
    }
    private static int div(int a,int b){
        return a/b;
    }
}