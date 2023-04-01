package com.anthual;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        Fibonacci f = new Fibonacci();
        Assert.assertEquals(0, f.fib(0));
        Assert.assertEquals(1, f.fib(1));
        Assert.assertEquals(1, f.fib(2));
        Assert.assertEquals(2, f.fib(3));
        Assert.assertEquals(3, f.fib(4));
        Assert.assertEquals(5, f.fib(5));
    }
}
