package com.epam.intro;

import java.util.Scanner;

public class SubTask18 {
    public static void main(String[] args) {
        int m = readVariable("m");
        if (m<=0) {
            throw new RuntimeException("m must be > 0");
        }
        int n = readVariable("n");
        if (m>n) {
            throw new RuntimeException("n must be >= m");
        }

        for (int i=m; i<=n; i++) {
            System.out.print(i + " : ");
            String dividers = "";

            for (int j=2; j<i; j++) {
                if (i%j==0) {
                    dividers = dividers + (j + ", ");

                }
            }
            System.out.println(dividers.length()>2?dividers.substring(0,dividers.lastIndexOf(",")):dividers);
        }

    }
    public static int readVariable(String variableName) {
        System.out.println("Please input " + variableName + ">0");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
