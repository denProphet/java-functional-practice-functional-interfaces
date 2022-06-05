package com.company;

import java.util.*;
import java.util.function.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 12, 2, 5,2,1,6};
        collectionStreamTest(arr);



    }

    static void collectionStreamTest(int[] arr) {

        double sum = Arrays.stream(arr).sum();
        double aver = (arr.length != 0) ? sum / arr.length : 0d;
        System.out.println(Arrays.stream(arr).filter(x -> x > aver).count());
    }

    static void testFuncInterfaces() {
        final int i = 5;
        Supplier<Integer> elevenSupplier = () -> (i + 6);
        Consumer<String> printUpperCaseString = s -> System.out.println(s.toUpperCase());
        Function<Integer, Double> divideBy2 = num -> Double.valueOf(num) / 2;
        UnaryOperator<Double> divideBy3 = d -> d / 3;
        Predicate<Integer> isPair = v -> v % 2 == 0;
        BiPredicate<Integer, Integer> isDividingOneByAnother = (a, b) -> a % b == 0;

        System.out.println(elevenSupplier.get());
        printUpperCaseString.accept("Hello");
        System.out.println(divideBy2.apply(31));
        System.out.println(divideBy3.apply(24.0));
        System.out.println(isPair.test(24));
        System.out.println(isDividingOneByAnother.test(33, 11));
    }
}
