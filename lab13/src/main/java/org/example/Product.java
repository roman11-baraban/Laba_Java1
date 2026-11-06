package org.example;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public Product(String name, double price, int quantity, String category)
            throws InvalidPriceException {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
        setCategory(category);
    }

    public void setName(String name) throws InvalidPriceException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidPriceException("Название товара не может быть пустым: " + name);
        }
        this.name = name;
    }

    public void setPrice(double price) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("Цена товара должна быть больше 0: " + price);
        }
        this.price = price;
    }

    public void setQuantity(int quantity) throws InvalidPriceException {
        if (quantity < 0) {
            throw new InvalidPriceException("Количество товара не может быть отрицательным: " + quantity);
        }
        this.quantity = quantity;
    }

    public void setCategory(String category) throws InvalidPriceException {
        if (category == null || category.trim().isEmpty()) {
            throw new InvalidPriceException("Категория товара не может быть пустой: " + category);
        }
        this.category = category;
    }

    public void reduceQuantity(int amount) throws InvalidPriceException, OutOfStockException {
        if (amount <= 0) {
            throw new InvalidPriceException("Количество для покупки должно быть положительным: " + amount);
        }
        if (amount > quantity) {
            throw new OutOfStockException(
                    "Товар отсутствует в нужном количестве: " + name,
                    amount, quantity);
        }
        this.quantity -= amount;
    }

    public void increasePrice(double percent) throws InvalidPriceException {
        if (percent <= 0) {
            throw new InvalidPriceException("Процент увеличения цены должен быть больше 0: " + percent);
        }
        this.price = this.price * (1 + percent / 100.0);
    }

    public String getName()   { return name; }
    public double getPrice()  { return price; }
    public int getQuantity()  { return quantity; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "Товар: " + name +
                " | Категория: " + category +
                " | Цена: " + String.format("%.2f", price) +
                " | Количество: " + quantity;
    }
}