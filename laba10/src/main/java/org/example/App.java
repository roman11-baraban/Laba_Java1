package org.example;

public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle("Красный", 5, 0, 0);
        Circle c2 = new Circle("Синий", 3, 10, 10);
        Circle c3 = new Circle("Зелёный", 7, 20, 20);
        Rectangle r1 = new Rectangle("Жёлтый", 4, 6, 5, 5);
        Rectangle r2 = new Rectangle("Чёрный", 10, 2, 15, 15);

        Drawable[] shapes = {c1, c2, c3, r1, r2};
        Calculatable[] calc = {c1, c2, c3, r1, r2};

        System.out.println(" Демонстрация фигур");

        for (int i = 0; i < shapes.length; i++) {
            Drawable d = shapes[i];
            d.draw();
            System.out.println("  Цвет: " + d.getColor());
        }

        System.out.println();

        for (int i = 0; i < calc.length; i++) {
            Calculatable c = calc[i];
            System.out.printf("Фигура %d: площадь = %.2f, периметр = %.2f%n",
                    i + 1, c.calculateArea(), c.calculatePerimeter());
        }

        Rectangle r3 = new Rectangle("Жёлтый", 4, 6, 5, 5);

        System.out.println("Сравнение кругов (по площади): " + c1.compareTo(c2));
        System.out.println("Сравнение прямоугольников (по площади): " + r1.compareTo(r2));

        System.out.println(ComparableShape.max);
        ComparableShape.staticMethod();
        r3.defaultMaethod();
        r2.abstractMethod();

    }
}
