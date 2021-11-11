package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Boss(int health, int damage, Weapon weapon) {
        super(health, damage);
        this.weapon = weapon;
    }

    public Boss(int health, int damage) {
        super(health, damage);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printlninfo() {
        return super.printlninfo() + ConsoleColors.WHITE +"Тип Орудия:" +ConsoleColors.RESET +  weapon.getWeaponName()+ConsoleColors.WHITE_UNDERLINED +"\nМодель:" +ConsoleColors.RESET + weapon.getWeaponType();

    }
}

