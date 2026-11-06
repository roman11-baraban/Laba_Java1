package org.example;

public class Rectangle implements Drawable, Calculatable, ComparableShape {
    private String color;
    private double width, height;
    private int x, y;

    public Rectangle(String color, double width, double height, int x, int y) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Рисую прямоугольник " + width + "x" + height +
                " в точке (" + x + ", " + y + ")");
    }

    public String getColor() {
        return color;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public int compareTo(Object o) {
        Rectangle other = (Rectangle) o;
        return Double.compare(this.calculateArea(), other.calculateArea());
    }

    public void abstractMethod() {
        System.out.println("Это абстрактный метод ");
    }



}
