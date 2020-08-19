/**
 * Milka Vakarchuk
 */
package com.java.se.linear;

public class Solution5 {
    /** Outputs a value in hours minutes seconds. */
    public String problem(int a) {
        StringBuilder hours = new StringBuilder();
        StringBuilder min = new StringBuilder();
        StringBuilder sec = new StringBuilder();
        if ((a / 3600) > 0) {
            hours.append(a / 3600);
            min.append((a - Integer.parseInt(hours.toString()) * 3600) / 60);
            sec.append((a - (Integer.parseInt(hours.toString()) * 3600 + Integer.parseInt(min.toString()) * 60)));
        } else {
            hours.append("00");
            if (a / 60 > 0) {
                min.append(a / 60);
                sec.append(a - Integer.parseInt(min.toString()) * 60);
            } else {
                min.append("00");
                sec.append(a);
            }
        }
        if (hours.length() == 1)
            hours.insert(0, "0");
        if (min.length() == 1)
            min.insert(0, "0");
        if (sec.length() == 1)
            sec.insert(0, "0");
        return (hours + ":" + min + ":" + sec);
    }
}
