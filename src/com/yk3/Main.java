package com.yk3;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        double kursDollara = 3.2;

        Function<String, Double> bynToUSD = input -> {
            String inString = input.replace(" BYN", "").trim();
            Double inBYN = Double.parseDouble(inString);
            return inBYN / kursDollara;
        };

        String input = "100 BYN";
        double inUSD = bynToUSD.apply(input);
        System.out.printf("Сумма в долларах: %.2f USD%n", inUSD);
    }
}

/*
Задача 3:
Используя Function реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
возвращать сумму, переведенную сразу в доллары.
 */