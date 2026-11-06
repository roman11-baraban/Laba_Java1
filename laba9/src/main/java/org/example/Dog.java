package org.example;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    public void move() {
        System.out.println("Бегает на четырёх лапах");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println(" Порода: " + breed + "]");
    }
}