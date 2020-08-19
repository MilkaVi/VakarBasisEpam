/**
 * Milka Vakarchuk
 */
package com.java.se.fork;

public class SolutionFork2 {
    /** Get max(min(a,b), min(c,d)). */
    public Object max4Value(Object a,Object b, Object c, Object d){
        if (a instanceof Integer ) {
            int ad = (Integer) a;
            int bd = (Integer) b;
            int cd = (Integer) c;
            int dd = (Integer) d;
            return Math.max(Math.min(ad,bd), Math.min(cd,dd));
        }
        if (a instanceof Double ) {
            double ad = (Double) a;
            double bd = (Double) b;
            double cd = (Double) c;
            double dd = (Double) d;
            return Math.max(Math.min(ad,bd), Math.min(cd,dd));
        }
        if (a instanceof String || a instanceof Character) {
            double ad = Double.parseDouble("" + a);
            double bd = Double.parseDouble("" + b);
            double cd = Double.parseDouble("" + c);
            double dd = Double.parseDouble("" + d);
            return Math.max(Math.min(ad,bd), Math.min(cd,dd));
        }
        return 0;
    }
}
