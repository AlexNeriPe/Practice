package com.anthual;

public class Fibonacci {

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public void printFibonacci(int count) {
        for (int i = 3; i <= count; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    
}
