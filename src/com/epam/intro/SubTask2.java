package com.epam.intro;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class SubTask2 {
    public static void main(String[] args) {
        int a = readVariable("a");
        int b = readVariable("b");
        int c = readVariable("c");
        double z = (b+ sqrt( pow(b, 2)+4*a*c))/(2*a)- (pow(a, 3)*c)+pow(b, -2);
        System.out.println("z = " + z);
    }

    public static int readVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

