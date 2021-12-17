package com.company;

public class Skeleton extends Boss {
    private int kolstrel;

    public Skeleton(String weaponType, String weaponName, int health, int damage, int kolstrel) {
        super(weaponType, weaponName, health, damage);
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
