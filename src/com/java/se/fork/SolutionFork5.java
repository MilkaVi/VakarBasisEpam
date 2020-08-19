/**
 * Milka Vakarchuk
 */
package com.java.se.fork;

public class SolutionFork5 {
    /** Calculates the function value. */
    public double functionF(double x){
        if (x <= 3)
            return x * x - 3 * x + 9;

        else
            return 1/(Math.pow(x,3) + 6);
    }

}
