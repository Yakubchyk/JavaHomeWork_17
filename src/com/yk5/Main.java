package com.yk5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(40);
        arrayList.add(43);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(2);

        Set<Integer> numSet = new HashSet<>();
        List<Integer> result = arrayList.stream()
                .filter(numSet::add)
                .filter(number -> number % 2 == 0)
                .toList();

        int sum = result.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Список уникальных элементов: " + result);
        System.out.println("Сумма уникальных элементов: " + sum);

    }
}
/*
Задача 1:
Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
Stream'ов:
- Удалить дубликаты
- Оставить только четные элементы
- Вывести сумму оставшихся элементов в стриме
 */
