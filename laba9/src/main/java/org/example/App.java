package org.example;

public class App {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Dog("Шарик", 3, 14.5, "Овчарка");
        animals[1] = new Dog("Бобик", 5, 9.2, "Дворняжка");

        animals[2] = new Bird("Кеша", 1, 0.1, 0.25);
        animals[3] = new Bird("Чирик", 2, 0.15, 0.3);
        animals[4] = new Bird("Гоша", 4, 0.5, 0.6);

        System.out.println("Информация о животных и их поведение");
        for (Animal animal : animals) {
            animal.displayInfo();
            System.out.print("Звук: ");
            animal.makeSound();
            System.out.print("Способ передвижения: ");
            animal.move();
        }
    }
}