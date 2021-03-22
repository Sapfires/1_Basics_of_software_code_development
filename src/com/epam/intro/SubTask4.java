package com.epam.intro;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubTask4 {
    public static void main(String[] args) {
        String inputString = readVariable();
        Pattern pattern = Pattern.compile("\\d{3}\\.\\d{3}");
        Matcher matcher = pattern.matcher(inputString);
        if (inputString.length()==7 & matcher.find()){
            String intPart = inputString.substring(0,3);
            String realPart = inputString.substring(4);
            String outputString = realPart + "." + intPart;
            System.out.println("Result is: " + outputString);
        }else {
            System.out.println("String doesn't match provided pattern");
        }
    }

    public static String readVariable() {
        System.out.println("Please input double R in format 'nnn.ddd'");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}