package org.example;

public class Plane extends Vehicle {
    private int altitude;

    public Plane(String brand, int year, double speed, int altitude) {
        super(brand, year, speed);
        this.altitude = altitude;
    }

    public double getSpeed() {
        return speed * 2.0;
    }

    public void move() {
        System.out.println("Самолёт " + brand + " летит на высоте " + altitude + " м");
    }

    public void move(String destination, int altitude) {
        System.out.println("Самолёт " + brand + " летит в " + destination
                + " на высоте " + altitude + " м");
    }
}