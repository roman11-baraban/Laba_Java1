package org.example;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Roman!" );

        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(10.5, 4.2);
        Rectangle rect3 = new Rectangle(7.5, 7.5);
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);


        Book[] books = {
                new Book("Война и мир", "Лев Толстой", 1869),
                new Book("Преступление и наказание", "Фёдор Достоевский", 1866),
                new Book("1984", "Джордж Оруэлл", 1949),
                new Book("Мастер и Маргарита", "Михаил Булгаков", 1967),
                new Book("Гарри Поттер и философский камень", "Джоан Роулинг", 1997)
        };
        Book oldestBook = books[0];
        Book newestBook = books[0];
        for (int i = 1; i < books.length; i++) {
            if (books[i].getYear() < oldestBook.getYear()) {
                oldestBook = books[i];
            }
            if (books[i].getYear() > newestBook.getYear()) {
                newestBook = books[i];
            }
        }
        System.out.println("--- Список всех книг ---");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("\n--- Результаты поиска ---");
        System.out.println("Самая старая книга: " + oldestBook);
        System.out.println("Самая новая книга: " + newestBook);



        Person man = new Person("Алексей", 30, Gender.MALE);
        Person woman = new Person("Елена", 25, Gender.FEMALE);
        System.out.println(man);
        System.out.println(woman);
    }




}
