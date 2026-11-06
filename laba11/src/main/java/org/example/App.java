package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println(" 1. Демонстрация ПЕРЕГРУЗКИ (статический полиморфизм)");
        Vehicle v = new Vehicle("Generic", 2020, 50);
        v.move();
        v.move(150);
        v.move("Минск");

        System.out.println("\n 2. Демонстрация ПЕРЕОПРЕДЕЛЕНИЯ (динамический полиморфизм)");
        Vehicle[] garage = {
                new Vehicle("Generic", 2020, 50),
                new Car("BMW", 2022, 180, 4),
                new Plane("Boeing", 2018, 900, 10000)
        };

        for (Vehicle vehicle : garage) {
            System.out.println("--- " + vehicle + " ---");
            vehicle.move();
            System.out.println("Эффективная скорость: " + vehicle.getSpeed());
        }

        System.out.println("\n 3. Демонстрация instanceof и нисходящего преобразования ");
        for (Vehicle vehicle : garage) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Это машина с " + car.getDoors() + " дверями");
                car.move(300, "шоссе");
            } else if (vehicle instanceof Plane) {
                Plane plane = (Plane) vehicle;
                plane.move("Прага", 12000);
            } else {
                System.out.println("Это просто транспортное средство");
            }
        }

        System.out.println("\n 4. Сравнение статического и динамического полиморфизма ");
        Vehicle base = new Car("Audi", 2021, 200, 2);
        base.move();
        base.move(100);
        base.move("Гомель");

        Car audi = (Car) base;
        audi.move(500, "трасса");
    }
}