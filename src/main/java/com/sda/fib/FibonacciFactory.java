package com.sda.fib;

import java.math.BigDecimal;

public class FibonacciFactory {
    public Fibonacci produce(FibType type){
        switch(type){
            case RECURSIVE:
                return new FibonacciRecursive();
            case ITERATIONAL:
                return  new FirbonacciIterational();
        }
        return null;
    }
}
