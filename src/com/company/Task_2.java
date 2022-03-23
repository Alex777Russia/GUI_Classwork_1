package com.company;

public class Task_2 {
    public static double someFunction(double x) {
        return Math.pow(x, 3.0) - Math.pow(x, 2.5) + x - 33.0;
    }

    public static void main(String[] args) {
        double a = 0;
        double b = 100;

        while (someFunction(b) - someFunction(a) >= 0.0001) {
            double F_b = someFunction(b);
            double F_a = someFunction(a);

            if (F_b * F_a == 0) {
                if (F_a == 0) { System.out.println(a); break; }

                else { System.out.println(b); break; }

            } else if (F_a * F_b > 0) {
                b = (a + b) / 2;
            } else {
                a = (a + b) / 2;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
