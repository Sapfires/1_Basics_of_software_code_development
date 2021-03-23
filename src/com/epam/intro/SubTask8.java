package com.epam.intro;

import java.util.Scanner;

public class SubTask8 {
    public static void main(String[] args) {
    double a = readVariable("a");
    double b = readVariable("b");
    double c = readVariable("c");
    double d = readVariable("d");
    System.out.println(Math.max(Math.min(a,b),Math.min(c,d)));
}

    public static double readVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
