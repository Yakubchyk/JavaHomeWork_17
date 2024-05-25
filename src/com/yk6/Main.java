package com.yk6;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> nameID = new HashMap<>();
        nameID.put(1, "Ivanov");
        nameID.put(2, "Petrov");
        nameID.put(3, "Sidorov");
        nameID.put(4, "Davidov");
        nameID.put(5, "Brenzalov");
        nameID.put(6, "Volodarski");
        nameID.put(7, "Zaslavski");
        nameID.put(8, "Shevarnadze");
        nameID.put(9, "Stallone");
        nameID.put(10, "Popov");
        nameID.put(11, "VanDamme");
        nameID.put(12, "BruceLee");
        nameID.put(13, "Nozabaev");
        nameID.put(14, "Scholz");
        nameID.put(15, "Veslouh");

        List<Integer> validID = new ArrayList<>();
        validID.add(1);
        validID.add(2);
        validID.add(5);
        validID.add(8);
        validID.add(9);
        validID.add(13);


        List<String> result = nameID.entrySet().stream()
                .filter(num -> validID.contains(num.getKey()))
                .filter(nam -> nam.getValue().length() % 2 != 0)
                .map(res -> new StringBuilder(res.getValue()).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
/*
Задача *:
Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
Среди отобранных значений отобрать только те, которые имеют нечетное количество
букв в имени. После чего вернуть список List имен, записанных буквами задом наперед
 */
