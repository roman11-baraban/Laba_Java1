package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Animal> animals = new HashMap<>();

        animals.put("Рекс", new Dog("Рекс", 1, 3, "Лабрадор"));
        animals.put("Бобик", new Dog("Бобик", 2, 5, "Овчарка"));
        animals.put("Шарик", new Dog("Шарик", 3, 2, "Дворняга"));

        animals.put("Мурка", new Cat("Мурка", 4, 4, "Белый"));
        animals.put("Барсик", new Cat("Барсик", 5, 6, "Рыжий"));
        animals.put("Пушок", new Cat("Пушок", 6, 1, "Серый"));

        animals.put("Кеша", new Bird("Кеша", 7, 2, 45.5));
        animals.put("Гоша", new Bird("Гоша", 8, 3, 52.0));

        System.out.println("Все ключи и значения:");
        Iterator<Map.Entry<String, Animal>> iterator = animals.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Animal> entry = iterator.next();
            System.out.println("Ключ: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}