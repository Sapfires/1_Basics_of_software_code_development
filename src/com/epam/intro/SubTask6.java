package com.epam.intro;

import java.util.Scanner;

public class SubTask6 {
    public static void main(String[] args) {
        double x = readVariable("x");
        double y = readVariable("y");
        if (y<=0 & y>=-3 & x<=4 & x>=-4) System.out.println("True");
        else
            if (y<=4 & y>=0 & x<=2 & x>=-2) System.out.println("True");
            else System.out.println("False");
    }

    public static double readVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}

