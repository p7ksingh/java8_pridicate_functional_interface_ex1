package com.p1.java8examplehandson.pridicateex;

import java.util.function.Predicate;

public class PredicatePrimativeDemo {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        Predicate<Integer> p = dt -> dt % 2 == 0;
        int sum = 0;
        for (int i : num) {
            if (p.test(i)) {
                sum = sum + i;
            }
       }
        System.out.println(sum);
        
    }
}
