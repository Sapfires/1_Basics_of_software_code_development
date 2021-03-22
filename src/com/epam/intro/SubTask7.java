package com.epam.intro;

import java.util.Scanner;

public class SubTask7 {
    public static void main(String[] args) {
        try {

            double a = readVariable("a");
            double b = readVariable("b");
            if (a + b >= 180) System.out.println("Triangle doesn't exist");
            else if (a + b == 90) System.out.println("Triangle exists, it's right");
            else System.out.println("Triangle exists, but it's not right");
        } finally {

        }
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