package org.example;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student("Алексей", 1, "ИСП-21");
        Student student2 = new Student("Мария", 2, "ИСП-22");
        Student student3 = new Student("Иван", 3, "ИСП-23");
        Student student4 = new Student("Елена", 1, "ИСП-21");
        Student student5 = new Student("Дмитрий", 4, "ИСП-24");
        Student student6 = new Student("Ольга", 2, "ИСП-22");

        Student[] students = {student1, student2, student3, student4, student5, student6};

        System.out.println("--- Список всех студентов ---");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("\nСтатистика");
        System.out.println("Всего студентов: " + Student.getTotalStudents());
        System.out.println("Средний курс всех студентов: " + Student.getAverageCourse());
    }
}