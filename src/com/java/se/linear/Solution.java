package com.java.se.linear;

public class Solution {
        public Object problem(Object a, Object b, Object c) {
            if (a instanceof Integer) {
                return ((((Integer) a - 3) * (Integer) b / 2) + (Integer) c);
            }
            if (a instanceof Double) {
                return ((((Double) a - 3) * (Double) b / 2) + (Double) c);
            }

            if (a instanceof Character) {
                String as = "" + a;
                String bs = "" + b;
                String cs = "" + c;
                int ai = strToInt(as);
                int bi = strToInt(bs);
                int ci = strToInt(cs);
                int z = (((ai - 3) * bi / 2) + ci);
                return Character.toString((char) z);
            }

            if (a instanceof String) {
                int ai = strToInt((String) a);
                int bi = strToInt((String) b);
                int ci = strToInt((String) c);
                int z = (((ai - 3) * bi / 2) + ci);
                return Character.toString((char) z);
            } else {
                return 10;
            }
        }

        static int strToInt(String str) {
            int i = 0;
            int num = 0;
            boolean isNeg = false;
            //Check for negative sign; if it's there, set the isNeg flag
            if (str.charAt(0) == '-') {
                isNeg = true;
                i = 1;
            }
            //Process each character of the string;
            while (i < str.length()) {
                num *= 10;
                num += str.charAt(i) - '0'; //Minus the ASCII code of '0' to get the value of the charAt(i++).
                i++;
            }

            if (isNeg)
                num = -num;

            return num;
        }

        static double problem1(double a, double b, double c) {
            return (((a - 3) * b / 2) + c);
        }

        static double problem2(double a, double b, double c) {
            return (((b + Math.sqrt((b * b + 4 * a * c))) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
        }

        static double problem3(double a, double b, double c) {
            return (((b + Math.sqrt((b * b + 4 * a * c))) / 2 * a)
                    - Math.pow(a, 3) * c + Math.pow(b, -2));
        }

        static double problem4(double x, double y) {
            return ((Math.sin(x) + Math.cos(y)) /
                    (Math.cos(x) - Math.sin(y)) * Math.tan(x * y));
        }

        static void problem4(double a) {
            int b = (int) a;
            String str = "" + a;
            String[] arrOfStr = str.split("\\.");
            System.out.print(arrOfStr[1] + "." + b);
        }

        static String problem5(int a) {
            StringBuilder hours = new StringBuilder();
            StringBuilder min = new StringBuilder();
            StringBuilder sec = new StringBuilder();
            if ((a / 3600) > 0) {
                hours.append(a / 3600);
                min.append((a - strToInt(hours.toString()) * 3600) / 60);
                sec.append((a - (strToInt(hours.toString()) * 3600 + strToInt(min.toString()) * 60)));
            } else {
                hours.append("00");
                if (a / 60 > 0) {
                    min.append(a / 60);
                    sec.append(a - strToInt(min.toString()) * 60);
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
