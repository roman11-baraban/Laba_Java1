package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task5CountZeros {
    public static void main(String[] args) {
        Path path = Paths.get("f.txt");

        try {
            // Формируем файл со случайными числами (в т.ч. с нулями)
            Random random = new Random();
            List<String> numbers = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                // диапазон -10..10, чтобы нули встречались часто
                numbers.add(String.valueOf(random.nextInt(21) - 10));
            }
            Files.write(path, numbers);
            System.out.println("Содержимое файла f: " + numbers);

            // Читаем и считаем нули
            List<String> lines = Files.readAllLines(path);
            int zeroCount = 0;
            System.out.print("Числа: ");
            for (String line : lines) {
                int num = Integer.parseInt(line);
                System.out.print(num + "; ");
                if (num == 0) {
                    zeroCount++;
                }
            }
            System.out.println("\n\nКоличество чисел, равных нулю: " + zeroCount);

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: в файле не целое число.");
        }
    }
}