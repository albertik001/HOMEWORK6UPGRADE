package com.company;

public class Boss extends GameEntity {


    public Boss(String weaponType, String weaponName, int health, int damage) {
        super(weaponType, weaponName, health, damage);
    }

    public String printlninfo() {
        return super.printlninfo() + ConsoleColors.WHITE +"Тип Орудия:" +ConsoleColors.RESET + getWeaponName()+ConsoleColors.WHITE_UNDERLINED +"\nМодель:" +ConsoleColors.RESET + getWeaponType();

    }
}

