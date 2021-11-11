package com.company;

public class Skeleton extends Boss {
    private int kolstrel;

    public Skeleton(int health, int damage, int kolstrel) {
        super(health, damage);
        this.kolstrel = kolstrel;
    }

    public int getKolstrel() {
        return kolstrel;
    }

    public void setKolstrel(int kolstrel) {
        this.kolstrel = kolstrel;
    }

    public String printlninfo() {
        return super.printlninfo() + ConsoleColors.PURPLE + "\nКол-во стрел:" + ConsoleColors.RESET + getKolstrel();
    }
}
