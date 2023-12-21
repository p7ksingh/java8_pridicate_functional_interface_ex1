package com.p1.java8examplehandson.pridicateex;

import java.util.function.Predicate;

public class Pridicateex1 {
    public static void m1(Predicate<Integer> p, int[] x) {

        for (int x1 : x) {
            if (p.test(x1)) {
                System.out.println(x1);
            }
        }
    }

    public static void m2(Predicate<String> p1, String[] names) {
        for (String name : names) {
            if (p1.test(name)) {
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("pridicate chaining");
        int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        // find number >5 and even number
        Predicate<Integer> p1 = dt -> dt > 5;
        Predicate<Integer> p2 = dt -> dt % 2 == 0;
        Predicate<Integer> p3 = p1.and(p2);
        Predicate<Integer> p4 = p1.or(p2);
        m1(p3, x);
        // m1(p2.negate(), x);
        m1(p4, x);
        String[] names = { "pankaj", "sreenath", "new", "delhi", "bihar" };
        Predicate<String> p5 = dt -> dt != null && dt.length() > 5;
        m2(p5, names);
        // isEqual() is static method in Pridicate interface
        Predicate<String> p6 = Predicate.isEqual("pankaj");
        System.out.println(p6.test("pankaj"));
        System.out.println();
    }

}
