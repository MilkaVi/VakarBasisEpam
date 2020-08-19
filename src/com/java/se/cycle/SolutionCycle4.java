/**
 * Milka Vakarchuk
 */
package com.java.se.cycle;

import java.math.BigInteger;

public class SolutionCycle4 {
    /** Calculates the sum of squares of the first 100 numbers. */
    public void compositionFirst100squer() {
        int i = 1;
        BigInteger sum = BigInteger.valueOf(1);
        while (i <= 20) {
            sum = sum.multiply(BigInteger.valueOf(i * i));
            i++;
        }
        System.out.println(sum);
    }
}
