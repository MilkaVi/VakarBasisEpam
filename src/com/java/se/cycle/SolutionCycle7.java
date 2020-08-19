/**
 * Milka Vakarchuk
 */
package com.java.se.cycle;

import java.util.Scanner;

public class SolutionCycle7{
    /** Outputs the factors of a number. */
    public void factorsNtoM() {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        if (n < m){
            int temp = n;
            n = m;
            m = temp;
        }
        int i = 2;
        while(m <= n/2){
            if (n % i == 0)
                System.out.println(i);
            i++;
            m++;
        }
    }
}
