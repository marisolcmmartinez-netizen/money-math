package com.pluralsight;

import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        // three ways to store a decimal
        float floatTotal = 0;
        double doubleTotal = 0;
        BigDecimal bigDecimalTotal = BigDecimal.ZERO;

        // add ten cents 10 times
        System.out.println("Adding 10 cents, 10 times");
        for(int i =1; i <= 10; i++) {
            floatTotal = floatTotal + 0.10f;
            doubleTotal = doubleTotal +  0.10;
            bigDecimalTotal = bigDecimalTotal.add(new BigDecimal("0.10"));

            System.out.println("float: " + floatTotal + "   double: " + doubleTotal + "  BigDecimal: " + bigDecimalTotal);
        }

        floatTotal = 0;
        doubleTotal = 0;
        bigDecimalTotal = BigDecimal.ZERO;

        System.out.println("Adding 19.99, 1000 times");
        for(int i =1; i <= 1000; i++) {
            floatTotal = floatTotal + 19.99f;
            doubleTotal = doubleTotal +  19.99;
            bigDecimalTotal = bigDecimalTotal.add(new BigDecimal("19.99"));
        }
        System.out.println("float: " + floatTotal + "  double: " + doubleTotal + " BigDecimal: " + bigDecimalTotal);

        System.out.println("float equals double? " + (floatTotal == doubleTotal));

        System.out.println(" BigDecimal compared to double: " + bigDecimalTotal.compareTo(BigDecimal.valueOf(doubleTotal)));
    }
}
