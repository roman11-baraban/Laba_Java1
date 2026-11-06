package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3SplitNumbers {
    public static void main(String[] args) {
        Path pathF = Paths.get("f.txt");
        Path pathG = Paths.get("g.txt");
        Path pathH = Paths.get("h.txt");

        try {
            Random random = new Random();
            int count = 20;
            List<String> randomNumbers = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                randomNumbers.add(String.valueOf(random.nextInt(101))); // 0..100
            }
            Files.write(pathF, randomNumbers);
            System.out.println("Файл f сформирован: " + randomNumbers);

            List<String> lines = Files.readAllLines(pathF);
            List<String> greater = new ArrayList<>();  // > 50
            List<String> lessOrEqual = new ArrayList<>(); // <= 50

            for (String line : lines) {
                int num = Integer.parseInt(line);
                if (num > 50) {
                    greater.add(line);
                } else {
                    lessOrEqual.add(line);
                }
            }

            Files.write(pathG, greater);
            Files.write(pathH, lessOrEqual);

            System.out.println("\nЧисла > 50 (файл g):       " + greater);
            System.out.println("Числа <= 50 (файл h):      " + lessOrEqual);
            System.out.println("Всего в f: " + lines.size()
                    + ", в g: " + greater.size()
                    + ", в h: " + lessOrEqual.size());

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        }
    }
}