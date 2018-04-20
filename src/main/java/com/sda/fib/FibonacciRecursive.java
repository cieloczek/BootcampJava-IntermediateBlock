package com.sda.fib;

import java.math.BigDecimal;

public class FibonacciRecursive implements Fibonacci{

    public BigDecimal getN(int x) {
        return fibbonacciBig(new BigDecimal(x));
    }
    private BigDecimal fibbonacciBig(BigDecimal x){
           if(x.equals(BigDecimal.ONE)){
               return BigDecimal.ONE;
           }else if( x.equals(BigDecimal.ZERO)) {
               return BigDecimal.ZERO;
           }
           BigDecimal tempTwo = x.subtract(new BigDecimal(2));
           BigDecimal tempOne = x.subtract(BigDecimal.ONE);
            return fibbonacciBig(tempTwo).add(fibbonacciBig(tempOne));
    }

}
