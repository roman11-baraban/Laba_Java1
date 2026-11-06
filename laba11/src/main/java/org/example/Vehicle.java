package org.example;

public class Vehicle {
    protected String brand;
    protected int year;
    protected double speed;

    public Vehicle(String brand, int year, double speed) {
        this.brand = brand;
        this.year = year;
        this.speed = speed;
    }

    public void move() {
        System.out.println("Транспорт движется");
    }

    public void move(int distance) {
        System.out.println("Транспорт проехал " + distance + " км");
    }

    public void move(String destination) {
        System.out.println("Транспорт едет в " + destination);
    }

    public double getSpeed() {
        return speed;
    }

    public String toString() {
        return brand + " (" + year + "), скорость=" + speed;
    }
}