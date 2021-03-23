package com.epam.intro;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SubTask15 {
    public static void main(String[] args) {

        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            result = result.multiply(BigInteger.valueOf(i).multiply(BigInteger.valueOf(i)));
        }
        System.out.println("The result is: " + result);
    }
}
