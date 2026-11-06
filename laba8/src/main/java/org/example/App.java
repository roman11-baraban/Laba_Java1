package org.example;

public class App {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Алексей", 2500.0, 5, 8);
        employees[1] = new Manager("Ирина", 3100.0, 7, 12);
        employees[2] = new Manager("Дмитрий", 2200.0, 3, 4);

        employees[3] = new Developer("Ольга", 2800.0, 4, "Java");
        employees[4] = new Developer("Максим", 3500.0, 6, "Python");
        Employee employee = new Manager("Алексей", 2500.0, 5, 8);
        Manager manager = new Manager("Алексей", 2500.0, 5, 8);
        System.out.println("Информация о сотрудниках и их работа");
        for (Employee emp : employees) {
            emp.displayInfo();
            emp.work();

            if (emp instanceof Manager) {
                ((Manager) emp).holdMeeting();
            } else if (emp instanceof Developer) {
                ((Developer) emp).debugCode();
            }

        }
    }
}