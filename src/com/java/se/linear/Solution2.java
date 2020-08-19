/**
 * Milka Vakarchuk
 */
package com.java.se.linear;

public class Solution2 implements MyExpression {
    /** Returns an expression of the form (((b + sqrt((b * b + 4 * a * c))) / 2 * a) - pow(ai, 3) * c + pow(b, -2)). */
    public Object problem(Object a, Object b, Object c){
        if (a instanceof Integer){
            int ai = (Integer)a;
            int bi = (Integer)b;
            int ci = (Integer)c;
            return (((bi + Math.sqrt((bi * bi + 4 * ai * ci))) / 2 * ai) - Math.pow(ai, 3) * ci + Math.pow(bi, -2));
        }
        if (a instanceof Double){
            double ai = (Double)a;
            double bi = (Double)b;
            double ci = (Double)c;
            return (((bi + Math.sqrt((bi * bi + 4 * ai * ci))) / 2 * ai) - Math.pow(ai, 3) * ci + Math.pow(bi, -2));
        }
        if (a instanceof String || a instanceof Character) {
            int ai = Integer.parseInt(""+a);
            int bi = Integer.parseInt(""+b);
            int ci = Integer.parseInt(""+c);
            int z = (int)(((bi + Math.sqrt((bi * bi + 4 * ai * ci))) / 2*ai) - Math.pow(ai, 3) * ci + Math.pow(bi,-2));
            return Character.toString((char) z);
        }
        else return 0;
    }
}
