package org.example;

public class Bird extends Animal {
    private double wingSpan;

    public Bird(String name, int age, double weight, double wingSpan) {
        super(name, age, weight);
        setWingSpan(wingSpan);
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        if (wingSpan >= 0) {
            this.wingSpan = wingSpan;
        }
    }

    public void makeSound() {
        System.out.println("Чирик-чирик!");
    }

    public void move() {
        System.out.println("Летает в небе");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println(" " + wingSpan + " м]");
    }
}