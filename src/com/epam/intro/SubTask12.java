package com.epam.intro;

import java.util.Scanner;

public class SubTask12 {
    public static void main(String[] args) {


            int n = readVariable("n");
            int sum = 0;
            for (int i=1; i<=n; i++){
                sum = sum+i;
            }
            System.out.println("The result is: " + sum);
        }

    public static int readVariable(String variableName) {
        System.out.println("Please input " + variableName + ">0");
        Scanner scanner = new Scanner(System.in);
        int response = scanner.nextInt();
        if (response <= 0) {
            System.out.println("Variable doesn't meet requirements");
            throw new RuntimeException();
        }
        return response;
    }
}