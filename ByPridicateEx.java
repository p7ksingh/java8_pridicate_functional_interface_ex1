package com.p1.java8examplehandson.pridicateex;

import java.util.function.BiPredicate;

public class ByPridicateEx {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> p1 = (a, b) -> (a + b) / 2 > 40;
        System.out.println(p1.test(10, 20));
    }
}
