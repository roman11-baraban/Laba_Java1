package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Task1Speciality {
    public static void main(String[] args) {
        Path path = Paths.get("speciality.txt");

        try {
            String info = "Специальность: 5-04-0612-02\n" +
                    "Название: Разработка и сопровождение программного обеспечения\n" +
                    "            информационных систем\n" +
                    "Квалификация: инженер-программист\n" +
                    "Срок обучения: 4 года\n" +
                    "Факультет: ФИТ";

            Files.writeString(path, info);

            System.out.println("=== Сведения о файле ===");
            System.out.println("Имя файла:      " + path.getFileName());
            System.out.println("Путь:           " + path.toAbsolutePath());
            System.out.println("Размер файла:   " + Files.size(path) + " байт");
            System.out.println("Файл существует: " + Files.exists(path));
            System.out.println("Доступен чтению: " + Files.isReadable(path));
            System.out.println("Доступен записи: " + Files.isWritable(path));
            System.out.println("Это каталог:     " + Files.isDirectory(path));

            System.out.println("\n=== Содержимое файла ===");
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}