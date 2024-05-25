package com.yk4;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supplier<String> supplier = () -> {
            System.out.print("Введите строку: ");
            String text = scanner.nextLine();
            return new StringBuilder(text).reverse().toString();
        };
        String reversString = supplier.get();
        System.out.println("Строка задом наперед: " + reversString);
    }
}
/*
Задача 5:
Используя Supplier написать метод, который будет возвращать введенную с консоли
строку задом наперед.
 */
