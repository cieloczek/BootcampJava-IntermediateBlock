package com.sda.fib;


import java.math.BigDecimal;

public class FibonacciGenerator {
    public BigDecimal generate(FibType type, int n) {
        FibonacciFactory factory = new FibonacciFactory();
        Fibonacci fibonacci = factory.produce(type);
        return fibonacci.getN(n);
    }
}
