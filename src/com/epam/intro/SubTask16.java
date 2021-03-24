package com.epam.intro;

import java.util.Scanner;

import static java.lang.Math.pow;

public class SubTask16 {
    public static void main(String[] args) {
        double e = readVariable("e");
        double sum = 0.0;
        double a = 1;

        for (int n = 1; e <= Math.abs(a); n++) {
            a = 1 / pow(2, n) + 1 / pow(3, n);
            if (Math.abs(a) >= e) sum = sum + a;
        }

        System.out.println("The result is: " + sum);


    }

    public static double readVariable(String variableName) {
        System.out.println("Please input " + variableName + ">0");
        Scanner scanner = new Scanner(System.in);
        double result = scanner.nextDouble();
        if (result <= 0) {
            throw new RuntimeException("Input doesn't meet requirements");
        }
        return result;
    }
}
