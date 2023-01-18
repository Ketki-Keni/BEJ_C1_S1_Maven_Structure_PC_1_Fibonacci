/*
 * Author : Ketki Keni
 * Date : 18-01-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.niit.bejp;

public class Fibonacci {

    static int Fibonacci(int number)
    {
        int num1 = 0, num2 = 1;

        int counter = 0;

        // Iterate till counter is N
        while (counter < number) {

            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        return num1;
    }
    public static void main(String args[])
    {
        int number = 10;
        Fibonacci(number);

    }
}
