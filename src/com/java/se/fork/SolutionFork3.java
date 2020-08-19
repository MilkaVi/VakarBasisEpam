/**
 * Milka Vakarchuk
 */
package com.java.se.fork;

public class SolutionFork3 {
    /** Checks whether points lie on the same straight line. */
    public void pointOnline(double x1, double x2, double x3, double y1, double y2, double y3){
        if (x1*y2+x3*y1+x2*y3-x3*y2-x2*y1-x1*y3==0) System.out.println("Yes");
        else System.out.println("No");
    }
}
