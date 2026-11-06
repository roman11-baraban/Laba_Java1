package org.example;

public class App
{
        public static void main(String[] args) {
            // Создание объекта билета
            Ticket ticket = new Ticket("Рок-концерт", 12, 200.0);

            System.out.println(ticket);

            ticket.applyDiscount();

            System.out.println(ticket);
            System.out.println("\nНовая цена: " + ticket.getPrice() + " руб.");
        }
    }

