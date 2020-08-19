/**
 * Milka Vakarchuk
 */
package com.java.se.cycle;

import java.math.BigInteger;
import java.util.Scanner;

public class SolutionCycle5 {
    Scanner scanner = new Scanner(System.in);
    /** Calculates the sum of row 1/2^n + 1/3^n those >= e . */
    public void compositionRow() {
        double e = scanner.nextDouble();
        int i = 1;
        double sum = 0;
        while (Math.abs(1/Math.pow(2,i) + 1/Math.pow(3,i)) >= e) {
                sum+= 1/Math.pow(2,i) + 1/Math.pow(3,i);
                i++;
        }
        System.out.println(sum);
    }
}
