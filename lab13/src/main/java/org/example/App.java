package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

    public static Product findProduct(List<Product> warehouse, String name) throws ProductNotFoundException {
        Iterator<Product> iterator = warehouse.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new ProductNotFoundException("Товар не найден на складе: " + name);
    }

    public static void main(String[] args) {
        List<Product> warehouse = new ArrayList<>();
        try {
            warehouse.add(new Product("Ноутбук", 25000.0, 10, "Электроника"));
            warehouse.add(new Product("Смартфон", 15000.0, 25, "Электроника"));
            warehouse.add(new Product("Наушники", -500.0, 5, "Аксессуары"));
        } catch (InvalidPriceException e) {
            System.err.println("Ошибка создания товара: " + e.getMessage());
        }

        System.out.println("\nТекущий склад:");
        for (Product p : warehouse) {
            System.out.println(p);
        }

        try {
            System.out.println("\nПокупка ноутбука (2 шт.):");
            Product laptop = findProduct(warehouse, "Ноутбук");
            laptop.reduceQuantity(2);
            System.out.println("После покупки: " + laptop);

            System.out.println("\nУвеличение цены смартфона на 10%:");
            Product phone = findProduct(warehouse, "Смартфон");
            phone.increasePrice(10);
            System.out.println("После обновления: " + phone);

            System.out.println("\nПопытка купить 100 смартфонов:");
            phone.reduceQuantity(100);

            System.out.println("\nПоиск несуществующего товара 'Планшет':");
            findProduct(warehouse, "Планшет");
        } catch (InvalidPriceException e) {
            System.out.println("Ошибка цены/количества: " + e.getMessage());
        } catch (OutOfStockException e) {
            System.out.println("Ошибка склада: " + e.getMessage());
            System.out.println("Запрошено: " + e.getRequested()
                    + ", доступно: " + e.getAvailable());
        } catch (ProductNotFoundException e) {
            System.out.println("Ошибка поиска: " + e.getMessage());
        } finally {
            System.out.println("\nРабота склада завершена.");
        }
    }
}