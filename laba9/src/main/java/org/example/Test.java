package org.example;

public abstract class Test {
    private String name;
    private int kolvo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKolvo() {
        return kolvo;
    }

    public void setKolvo(int kolvo) {
        if (kolvo >= 0) {
            this.kolvo = kolvo;
        }
    }

    public Test(String name, int age) {
        this.name = name;
        this.kolvo = kolvo;
    }

    public abstract void make();
    //
}


