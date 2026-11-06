package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4WindAverage {
    public static void main(String[] args) {
        Path path = Paths.get("wind.txt");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите 10 значений скорости ветра (м/с, например 5.4):");
            List<String> windList = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                System.out.print("Скорость " + i + ": ");
                String input = scanner.nextLine().trim().replace(',', '.');

                double value = Double.parseDouble(input);
                if (value < 0) {
                    throw new NumberFormatException("скорость не может быть отрицательной");
                }
                windList.add(input);
            }
            Files.write(path, windList);

            List<String> lines = Files.readAllLines(path);
            double sum = 0;
            System.out.print("\nЗначения из файла: ");
            for (String line : lines) {
                double v = Double.parseDouble(line);
                System.out.print(v + "; ");
                sum += v;
            }

            double average = sum / lines.size();
            System.out.printf("\n\nСредняя скорость ветра: %.2f м/с\n", average);

        } catch (IOException e) {
            System.out.println("Ошибка файла: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено некорректное вещественное число (" + e.getMessage() + ").");
        }
    }
}