/**
 * Milka Vakarchuk
 */
package com.java.se.linear;

public class Solution6 {
    /** Checks whether the point belongs to the area.  */
    public boolean problem(double x, double y){
        if(y >= 0 && y<= 4 && x >= -2 && x<= 2) return true;

        if (y <= 0 && y >= -3 && x >= -4 && x<= 4) return true;

        return false;
    }
}
