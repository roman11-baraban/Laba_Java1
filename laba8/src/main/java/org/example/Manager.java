package org.example;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int experience, int teamSize) {
        super(name, salary, experience);
        setTeamSize(teamSize);
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        if (teamSize >= 0) {
            this.teamSize = teamSize;
        }
    }

    public void work() {
        System.out.println("Управляет командой из " + teamSize + " человек");
    }

    public void holdMeeting() {
        System.out.println(getName() + " проводит совещание с командой.");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println(" Размер команды: " + teamSize + "]");
    }
}