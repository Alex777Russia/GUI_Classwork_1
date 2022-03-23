package com.company;

import java.util.Scanner;

public class Task_1_Fibonacci {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 2 147 483 647");

        long number = in.nextInt();
        int i = 1;
        int j = 1;

        while (number > 1){
            if (number == i + j){
                System.out.println("Число " + number + " явсляется числом фиббоначи");
                break;
            } else if (number < i + j){
                System.out.println("Число " + number + " не является числом фиббоначи");
                break;
            } else {
                int a = i;
                i = i + j;
                j = a;
            }
        }

        if (number == 1) {
            System.out.println("Число " + number + " является числом фиббоначи");
        }

    }

}