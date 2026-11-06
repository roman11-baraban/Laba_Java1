package org.example;

public interface ComparableShape extends Drawable {
    int compareTo(Object o);
    int max = 100;

    void abstractMethod();

    default void defaultMaethod(){
        System.out.println("дефолтный метод");
    }

    static boolean staticMethod(){
        System.out.println("Это статический метод");
        return false;
    }
}
