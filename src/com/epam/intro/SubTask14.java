package com.epam.intro;

import java.util.Scanner;

import static java.lang.Math.pow;

public class SubTask14 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i * i;
        }
        System.out.println("The result is: " + sum);
    }

}