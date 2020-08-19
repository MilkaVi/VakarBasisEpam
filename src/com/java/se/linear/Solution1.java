/**
 * Milka Vakarchuk
 */
package com.java.se.linear;

public class Solution1 implements MyExpression{
    /** Returns an expression of the form z = ((a - 3) * b / 2) + c. */
    public Object problem(Object a, Object b, Object c) {
        if (a instanceof Integer) return ((((Integer) a - 3) * (Integer) b / 2) + (Integer) c);

        if (a instanceof Double)  return ((((Double) a - 3) * (Double) b / 2) + (Double) c);

        if (a instanceof String || a instanceof Character) {
            int ai = Integer.parseInt("" + a);
            int bi = Integer.parseInt(""+b);
            int ci = Integer.parseInt(""+c);
            return Character.toString((char) (((ai - 3) * bi / 2) + ci));
        }
        else {
            return 0;
        }
    }
}
