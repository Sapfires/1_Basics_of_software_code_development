package com.epam.intro;

import java.util.Scanner;

public class SubTask10 {
    public static void main(String[] args) {

        double a = readVariable("a");
        double b = readVariable("b");
        double x = readVariable("x");
        double y = readVariable("y");
        double z = readVariable("z");

        boolean x1 = x<a;
        boolean x2 = x<b;
        boolean y1 = y<a;
        boolean y2 = y<b;
        boolean z1 = z<a;
        boolean z2 = z<b;
        if ((x1&&y2)||(x2&&y1)||(x1&&z2)||(x2&&z1)||(y1&&z2)||(y2&&z1)) System.out.println("The brick will fit");
        else System.out.println("The brick won't fit");
    }

    public static double readVariable(String variableName) {
        System.out.println("Please input " + variableName + ">0");
        Scanner scanner = new Scanner(System.in);
        double response = scanner.nextDouble();
        if (response <= 0) {
            System.out.println("Variable doesn't meet requirements");
            throw new RuntimeException();
        }
        return response;
    }
}