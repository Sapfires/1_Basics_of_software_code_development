package com.epam.intro;

import java.util.Scanner;

public class SubTask13 {
    public static void main(String[] args) {


        double a = readVariable("a");
        double b = readVariable("b");
        double h = readVariable("h");

        for (double x = a; x <= b; x = x + h) {
            double y;
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("x = " + x + ",y = " + y);

        }
    }

    public static double readVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}