package org.example;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, double speed, int doors) {
        super(brand, year, speed);
        this.doors = doors;
    }

    public double getSpeed() {
        return speed * 1.0;
    }

    public void move() {
        System.out.println("Автомобиль " + brand + " едет по дороге");
    }

    public void move(int distance, String road) {
        System.out.println("Автомобиль " + brand + " проехал " + distance
                + " км по " + road);
    }

    public int getDoors() {
        return doors;
    }
}