package com.sda.fib;

import java.math.BigDecimal;

public class FirbonacciIterational implements Fibonacci{

    private BigDecimal fib(BigDecimal x){
        BigDecimal sum = new BigDecimal(0);
        if (x.equals(BigDecimal.ONE)){
            return BigDecimal.ONE;
        } else if (x.equals(BigDecimal.ZERO)){
            return BigDecimal.ZERO;
        }
        BigDecimal temp = new BigDecimal(0);
        BigDecimal tempTwo = new BigDecimal(1);
        for(int i=0;i<x.intValue();i++){
            sum = temp.add(tempTwo);
            tempTwo = temp;
            temp = sum;
        }
        return sum;
    }

    public BigDecimal getN(int x) {
        return fib(new BigDecimal(x));
    }
}
