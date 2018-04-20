package com.sda.fib;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.math.BigDecimal;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibTest {
@Test
    public void recSmallVal(){
    FibonacciRecursive f = new FibonacciRecursive();
    assertEquals(BigDecimal.valueOf(1), f.getN(1));
    assertEquals(BigDecimal.valueOf(8), f.getN(6));
    assertEquals(BigDecimal.valueOf(4181), f.getN(19));
}
@Test
    public void iterSmallVal(){
    FirbonacciIterational f = new FirbonacciIterational();
    assertEquals(BigDecimal.valueOf(1), f.getN(1));
    assertEquals(BigDecimal.valueOf(8), f.getN(6));
    assertEquals(BigDecimal.valueOf(4181), f.getN(19));
}
@Test
    public void testFactory() {
    FibonacciFactory fibonacciFactory = new FibonacciFactory();
    assertTrue(new FibonacciRecursive().getClass() == fibonacciFactory.produce(FibType.RECURSIVE).getClass());
   // assertEquals(new FirbonacciIterational(),fibonacciFactory.produce(FibType.ITERATIONAL));
    assertTrue(fibonacciFactory.produce(FibType.RECURSIVE) instanceof FibonacciRecursive);
    assertTrue(fibonacciFactory.produce(FibType.ITERATIONAL) instanceof FirbonacciIterational);
}
}
