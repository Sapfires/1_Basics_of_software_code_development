package com.epam.intro;

import java.util.Scanner;

import static java.lang.Math.pow;

public class SubTask11 {
    public static void main(String[] args) {
        double x = readVariable("x");
        double f;
        if (x<=3)
            f = pow(x,2) - 3*x +9;
        else
            f = 1/(pow(x,3)+6);
        System.out.println(f);
    }

    public static double readVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
