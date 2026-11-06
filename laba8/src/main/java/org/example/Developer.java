package org.example;

public class Developer extends Employee {
    private String language;

    public Developer(String name, double salary, int experience, String language) {
        super(name, salary, experience);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void work() {
        System.out.println("Пишет код на " + language);
    }

    public void debugCode() {
        System.out.println(getName() + " ищет баги в коде на " + language + ".");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Язык: " + language + "]");
    }
}