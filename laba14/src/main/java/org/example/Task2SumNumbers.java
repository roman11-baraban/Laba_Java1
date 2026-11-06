package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2SumNumbers {
    public static void main(String[] args) {
        Path path = Paths.get("f.txt");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите 10 целых чисел:");
            List<String> numbersList = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                System.out.print("Число " + i + ": ");
                String input = scanner.nextLine();
                // проверка на корректность целого числа
                Integer.parseInt(input);
                numbersList.add(input);
            }
            Files.write(path, numbersList);

            List<String> lines = Files.readAllLines(path);
            System.out.println("\nЧисла из файла и поиск суммы:");

            long sum = 0;
            System.out.print("Прочитано: ");
            for (String line : lines) {
                int num = Integer.parseInt(line);
                System.out.print(num + "; ");
                sum += num;
            }
            System.out.println("\n\nСумма всех чисел: " + sum);

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не целое число.");
        }
    }
}