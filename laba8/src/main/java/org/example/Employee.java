package org.example;

public class Employee {
    private String name;
    private double salary;
    private int experience;

    public Employee(String name, double salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience >= 0) {
            this.experience = experience;
        }
    }

    public void work() {
        System.out.println("Выполняет работу");
    }

    public void displayInfo() {
        System.out.println("Сотрудник [Имя: " + name + ", Зарплата: " + salary + " руб., Стаж: " + experience + " лет]");
    }
}