package com.epam.intro;

import java.util.Scanner;

import static java.lang.Math.*;

public class SubTask3 {public static void main(String[] args) {
    int x = readVariable("x");
    int y = readVariable("y");
    double z = (sin(x)+cos(y))/(cos(x)-sin(y))*tan(x*y);
    System.out.println("z = " + z);
}

    public static int readVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

