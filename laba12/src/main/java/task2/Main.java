package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void printCars(List<Car> cars, int rating) {
        System.out.println("Автомобили с рейтингом " + rating + ":");
        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getRating() == rating) {
                System.out.println(car);
            }
        }
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Camry", 3, Arrays.asList(5, 4, 5)));
        cars.add(new Car(2, "Lada", "Vesta", 2, Arrays.asList(2, 2, 3)));
        cars.add(new Car(3, "BMW", "M5", 3, Arrays.asList(4, 5, 4)));
        cars.add(new Car(6, "MW", "M5", 3, Arrays.asList(4, 5, 4)));
        cars.add(new Car(4, "Renault", "Logan", 1, Arrays.asList(1, 2, 2)));
        cars.add(new Car(5, "Audi", "A6", 3, Arrays.asList(4, 4, 4)));

        cars.removeIf(c -> c.getAverageReview() < 3);

        Iterator<Car> iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car car = iterator.next();
            if (car.getAverageReview() >= 4) {
                car.setRating(car.getRating() + 1);
            }
        }

        printCars(cars, 4);
        System.out.println();

        cars.sort((a, b) -> {
            int result = Double.compare(b.getAverageReview(), a.getAverageReview());
            return result != 0 ? result : b.getBrand().compareTo(a.getBrand());
        });

        System.out.println("Отсортированный список:");
        iterator = cars.iterator();
        while (iterator.hasNext()) {
            Car c = iterator.next();
            System.out.println("ID: " + c.getId() + " Бренд: " + c.getBrand() + " Ср.рейтинг: " + c.getAverageReview());
        }
    }
}