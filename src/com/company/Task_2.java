package com.company;

public class Task_2 {
    public static double someFunction(double x) {
        return Math.pow(x, 3.0) - Math.pow(x, 2.5) + x - 1.0;
    }

    public static void main(String[] args) {
        double number;
        double leftBorder = 0;
        double rightBorder = 0;
        double x;

        for (x = 0; x < 5; x += 0.5) {
            number = someFunction(x);

            if (number < 0) { leftBorder = x; }

            if (number > 0) {
                rightBorder = x;
                break;
            }
        }

        System.out.println("Left board:");
        System.out.println(leftBorder);
        System.out.println("Right board:");
        System.out.println(rightBorder);

        while (someFunction(x) != 0) {
            x = (leftBorder + rightBorder) / 2;

            double timeValue = someFunction(x);

            if (timeValue > 0) {
                rightBorder = x - 0.0001;
            } else if (timeValue < 0) { leftBorder = x + 0.0001; }
        }

        System.out.println("Result:");
        System.out.println(x);
    }

}
