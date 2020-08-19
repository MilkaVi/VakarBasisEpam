/**
 * Milka Vakarchuk
 */
package com.java.se.cycle;

import java.util.Scanner;

public class SolutionCycle1 {
    Scanner scanner = new Scanner(System.in);
    int a = 1;
    /** Calculates a sequence up to A. */
    public void sumToInput(){
        a = scanner.nextInt();
        if (a <= 1)
            System.out.println(1);
        else{
            int sum = 0;
            int i = 1;
            while (i <= a){
                sum+=i;
                i++;
            }
            System.out.println(sum);
        }
    }
}

