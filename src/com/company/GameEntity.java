package com.company;

public class GameEntity extends Weapon {
    private int health;
    private int damage;

    public GameEntity(String weaponType, String weaponName, int health, int damage) {
        super(weaponType, weaponName);
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String printlninfo(){
        return String.valueOf(ConsoleColors.RED + "HP:" + ConsoleColors.RESET + health + ConsoleColors.GREEN + "\nURON:" + ConsoleColors.RESET + damage +"\n");
    }

}
