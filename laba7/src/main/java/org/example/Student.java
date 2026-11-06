package org.example;

public class Student {
    private static String name;
    private static int course;
    private static String group;

    private static int totalStudents = 0;
    private static int totalCourses = 0;

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }


    public static String printinfo() {
        return "Имя:"  + name + " Курс: " + course + " Группа: " + group + "Общее количество студентов" + totalStudents + "Общее количество курсов" + totalCourses;
    }

    public Student(String name, int course, String group) {
        this.name = name;
        this.course = course;
        this.group = group;

        totalStudents++;
        totalCourses += course;
    }

    public static double getAverageCourse() {
        if (totalStudents == 0) {
            return 0;
        }
        return (double) totalCourses / totalStudents;
    }



    public static int getTotalStudents() {
        return totalStudents;
    }

    public String toString() {
        return "Студент [Имя: " + name + ", Курс: " + course + ", Группа: " + group + "]";
    }
}
