package com.sda.fib;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        FibonacciGenerator gen = new FibonacciGenerator();
        System.out.println(gen.generate(FibType.RECURSIVE,15));
    }
}
