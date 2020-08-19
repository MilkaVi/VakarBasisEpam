/**
 * Milka Vakarchuk
 */
package com.java.se.fork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionFork4 {
    /** Checks whether the brick will fit. */
    public void fitAbrick(double a, double b, double x, double y, double z){
        List<Double> list = Arrays.asList(x,y,z);
        Collections.sort(list);
        if(Math.min(list.get(0), list.get(1)) <= Math.min(a,b)){
            if (Math.max(list.get(0), list.get(1)) <= Math.max(a,b)){
                System.out.println("Yes, brick will fit");
                return;
            }
        }
        System.out.println("NO");
    }
}
