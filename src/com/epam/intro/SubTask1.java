package com.epam.intro;

import java.util.Scanner;

public class SubTask1 {

    public static void main(String[] args) {
        double a = readVariable("a");
        double b = readVariable("b");
        double c = readVariable("c");
        double z = ((a - 3) * b / 2) + c;
        System.out.println("z = " + z);
    }

    public static double readVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
