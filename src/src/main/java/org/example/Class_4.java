package org.example;

import java.util.ArrayList;
import java.util.List;

public class Class_4 {
    public static void main(String[] args) {
        String c = "1234567";
        char[] a = new char[c.length()];
        for (int i = 0; i < c.length(); i++) {
            a[i] = c.charAt(i);
        }
        List<Character> l = new ArrayList<>();
        for (int i = c.length() - 1; i >= 0; i--) {

            l.add(a[i]);
        }
        System.out.println(l);
    }
}
