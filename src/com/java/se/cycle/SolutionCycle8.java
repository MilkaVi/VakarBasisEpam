/**
 * Milka Vakarchuk
 */
package com.java.se.cycle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SolutionCycle8{
    /** Outputs factor - word. */
    public void mapFactor() {
        System.out.println("Input two numbers");
        Scanner scanner = new Scanner(System.in);
        int mas[] = new int[2];
        mas[0]= scanner.nextInt();
        mas[1] = scanner.nextInt();
        Map <Integer, String>map = new HashMap<Integer, String>();
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        int a = 0;
        while (a < 2){
            while(mas[a] != 0){
                if(mas[a]/10 != 0)
                    System.out.println( mas[a]%10 + " = " +map.get(mas[a]%10));
                else
                    System.out.println(mas[a] + " = " +map.get(mas[a]));
                mas[a] /= 10;
            }
            System.out.println();
            a++;
        }
    }
}
