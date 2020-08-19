/**
 * Milka Vakarchuk
 */
package com.java.se.linear;
/** Swaps the decimal and integer parts. */
public class Solution4 {
    public void problem(double a){
        int b = (int) a;
        String str = "" + a;
        String[] arrOfStr = str.split("\\.");
        System.out.print(arrOfStr[1] + "." + b);
    }
}
