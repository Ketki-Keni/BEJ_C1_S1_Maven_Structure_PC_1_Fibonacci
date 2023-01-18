/*
 * Author : Ketki Keni
 * Date : 18-01-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.niit.bejp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    Fibonacci fibonacci;
    @Before
    public void setUp()  {
        fibonacci = new Fibonacci();
    }
    @Test
    public void testFibonacci(){
        int number=10;
        assertEquals(55, fibonacci.Fibonacci(10));
    }
}
