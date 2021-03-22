package com.epam.intro;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class SubTask5 {
    public static void main(String[] args) {
        Long seconds = readVariable();
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat outputFormat = new SimpleDateFormat("HHч mmмин ssс");
        System.out.println(outputFormat.format(Date.from(Instant.ofEpochSecond(seconds))));
    }

    public static long readVariable() {
        System.out.println("Please input seconds: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLong();
    }
}
