package org.example;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int id, int age, String breed) {
        super(name, id, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + " Порода: " + breed;
    }
}