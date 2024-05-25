package com.yk1;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.print("Введите дату вашего рождения в формате 'dd.MM.yyyy' : ");
        String input = scanner.nextLine();
        try {
            LocalDate geburtsTag = LocalDate.parse(input, formatter);
            LocalDate hundertJare = geburtsTag.plusYears(100);
            System.out.println("Дата, когда вам исполнится 100 лет: " + hundertJare.format(formatter));

        } catch (DateTimeParseException e) {
            System.out.println("Неправильный формат даты. Пожалуйста, введите дату в формате 'dd.MM.yyyy'. ");

        }


    }
}

/*
Задача 1:
Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
когда пользователю исполнится 100 лет. Использовать Date/Time API.


Задача 3:
Используя Function реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
возвращать сумму, переведенную сразу в доллары.
 */