/**
 * Milka Vakarchuk
 */
package com.java.se.cycle;

public class SolutionCycle6 {
    /** Outputs the corresponding character-address. */
    public void hashChar() {
        String s = "Milka";
        char temp;
        for(int i = 0; i < s.length();i ++){
            temp = s.charAt(i);
            System.out.println(temp + " - " + Character.hashCode(temp));
        }
    }
    public void charAscii() {
        String s = "abc";
        for(int i =0; i < s.length(); i++){
            System.out.println(s.charAt(i) + " - " + (int)s.charAt(i));
        }
    }
}
