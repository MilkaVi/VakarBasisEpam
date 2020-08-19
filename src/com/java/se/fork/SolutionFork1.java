/**
 * Milka Vakarchuk
 */
package com.java.se.fork;

public class SolutionFork1 {
    /** Determines whether a triangle exists. */
    public void triangle(double a, double b){
        if (a + b < 180 && a> 0 && b > 0){
            if(a == 90 || b == 90 || a+9 == 90){
                System.out.println("Yes, the triangle exists and it is rectangular");
            }
            System.out.println("Yes, the triangle exists");
        }
    }
}
