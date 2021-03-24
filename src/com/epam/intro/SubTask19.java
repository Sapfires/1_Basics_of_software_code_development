package com.epam.intro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SubTask19 {
    public static void main(String[] args) {
        double a = readVariable("a");
        double b = readVariable("b");
        String aString = Double.toString(a);
        String bString = Double.toString(b);
        aString = aString.replace("-", "").replace(".", "");
        HashSet<String> duplicates = new HashSet<>();
        for (int i=0; i<=aString.length()-1; i++) {
            String element = aString.substring(i, i+1);
            if (bString.contains(element)) {
                duplicates.add(element);
            }
        }
        System.out.println(String.join(", ", duplicates));
    }
    public static double readVariable(String variableName) {
        System.out.println("Please input " + variableName + ">0");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }

}
