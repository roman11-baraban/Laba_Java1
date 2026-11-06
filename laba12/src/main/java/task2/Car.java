package task2;

import java.util.List;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int rating;
    private List<Integer> expertReviews;

    public Car(int id, String brand, String model, int rating, List<Integer> expertReviews) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.rating = rating;
        this.expertReviews = expertReviews;
    }

    public double getAverageReview() {
        int sum = 0;
        for (int review : expertReviews) {
            sum += review;
        }
        return (double) sum / expertReviews.size();
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Бренд: " + brand + " Модель: " + model + " Рейтинг: " + rating + " Ср.рейтинг: " + getAverageReview();
    }
}