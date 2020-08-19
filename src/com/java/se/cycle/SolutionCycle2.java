/**
 * Milka Vakarchuk
 */
package com.java.se.cycle;

public class SolutionCycle2 {
    /** Calculates the function value. */
    public void abCut(int a, int b, int h){
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            for(int i = a; i < b; i+=h){
                if(i > 2) System.out.println("y = " + i);
                else System.out.println("y = " + -i);
            }
    }
}
