/**
 * Milka Vakarchuk
 */
package com.java.se.cycle;

public class SolutionCycle3 {
    /** Calculates the sum of squares of the first 100 numbers. */
    public void sumFirst100squer(){
    int i = 1;
    int sum = 0;
    while (i <= 100){
        sum += i * i;
        i++;
    }
    System.out.println(sum);
}
}
