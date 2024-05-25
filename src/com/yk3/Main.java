package com.yk3;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        double kursDollara = 3.2;

        Function<String, Double> bynToUSD = input -> {
            String inString = input.replace(" BYN", "").trim();
            Double inBYN = Double.parseDouble(inString);
            return inBYN / kursDollara;
        };
        Consumer<String> bynToUsdConsumer = inputCons -> {
            String inStringCons = inputCons.replace(" BYN", "");
            try {
                Double inBynCons = Double.parseDouble(inStringCons);
                Double inUsdCons = inBynCons / kursDollara;
                System.out.printf("Consumer:  Сумма в долларах: %.2f USD%n", inUsdCons);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: неверный формат.");
            }
        };

        String input = "100 BYN";
        double inUSD = bynToUSD.apply(input);
        System.out.printf("Function:  Сумма в долларах: %.2f USD%n", inUSD);

        String inputCons = "1000 BYN";
        bynToUsdConsumer.accept(inputCons);
    }
}

/*
Задача 3:
Используя Function реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
возвращать сумму, переведенную сразу в доллары.

Задание 4:
Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
выводить сумму, переведенную сразу в доллары.
 */
