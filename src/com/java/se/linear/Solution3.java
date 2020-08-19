/**
 * Milka Vakarchuk
 */
package com.java.se.linear;

public class Solution3 {
    /** Returns an expression of the form (sinx + cosy) / (cosx - siny) + tgxy. */
    public Object problem(Object a, Object b){
        if (a instanceof Integer){
            int ai = (Integer)a;
            int bi = (Integer)b;
            return ((Math.sin(ai) + Math.cos(bi)) / (Math.cos(ai) - Math.sin(bi)) * Math.tan(ai * bi));
        }
        if (a instanceof Double){
            double ai = (Double)a;
            double bi = (Double)b;

            return ((Math.sin(ai) + Math.cos(bi)) / (Math.cos(ai) - Math.sin(bi)) * Math.tan(ai * bi));
        }
        if (a instanceof String || a instanceof Character) {
            int ai = Integer.parseInt(""+a);
            int bi = Integer.parseInt(""+b);
            int z = (int)((Math.sin(ai) + Math.cos(bi)) / (Math.cos(ai) - Math.sin(bi)) * Math.tan(ai * bi));
            return Character.toString((char) z);
        }
        else return 0;
    }
}
