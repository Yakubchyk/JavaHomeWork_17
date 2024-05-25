package com.yk2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Predicate<Integer> isOK = num -> num > 0;

        System.out.println("Введите числа через запятую. " +
                "Пусть они будут как положительные, так и отрицательные: ");
        String input = scanner.nextLine();

        List<Integer> result = Arrays.stream(input.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .filter(isOK)
                .collect(Collectors.toList());


        result.forEach(System.out::println);

        scanner.close();
    }
}



/*
Задача 2:
Используя Predicate среди массива чисел вывести только те, которые являются
положительными.

 */
