package org.example;

public class Cat extends Animal {
    private String color;

    public Cat(String name, int id, int age, String color) {
        super(name, id, age);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " Окрас: " + color;
    }
}