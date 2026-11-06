package org.example;

public class Circle implements Drawable, Calculatable, ComparableShape {
    private String color;
    private double radius;
    private int x, y;

    public Circle(String color, double radius, int x, int y) {
        this.color = color;
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Рисую круг радиусом " + radius +
                " в точке (" + x + ", " + y + ")");
    }

    public String getColor() {
        return color;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public int compareTo(Object o) {
        Circle other = (Circle) o;
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    public void abstractMethod() {

    }




}
