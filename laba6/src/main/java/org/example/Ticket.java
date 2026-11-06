package org.example;

public class Ticket {
    private String event;
    private int seatNumber;
    private double price;
    private int kolvo;

    public int getKolvo(){return kolvo;}
    public void setKolvo(int kolvo){
        if(kolvo >= 0){
            this.kolvo = kolvo;
        }
    }


   public Ticket (String event, int seatNumber, double price, int kolvo){
        this(event, seatNumber, price);
        this.kolvo = kolvo;
   }
   // Ticket ticket1 = new Ticket ("Рок за бобров", 16, 120, 2);
    public String getEvent() {
        return event;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setEvent(String event){
        this.event = event;
    }


    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public Ticket(String event, int seatNumber, double price) {
        this.event = event;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void applyDiscount() {
        this.price = this.price * 0.8;
    }

    public String toString() {
        return "Билет Мероприятие: " + event +
                ", Место: " + seatNumber +
                ", Цена: " + price + " руб.";
    }
}
