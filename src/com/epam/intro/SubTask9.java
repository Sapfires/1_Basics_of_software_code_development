package com.epam.intro;

import java.util.Scanner;

public class SubTask9 {
    public static void main(String[] args) {

        double x1 = readVariable("x1");
        double x2 = readVariable("x2");
        double x3 = readVariable("x3");
        double y1 = readVariable("y1");
        double y2 = readVariable("y2");
        double y3 = readVariable("y3");
        if ((x3-x1)*(y2-y1)==(y3-y1)*(x2-x1)) System.out.println("Points are collinear");
        else System.out.println("Points aren't collinear");

}


    public static double readVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
