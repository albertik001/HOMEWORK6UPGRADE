package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ConsoleColors.RED_BACKGROUND + "----DIABLO----" + ConsoleColors.RESET);

        Boss diablo = new Boss(999, 99);
        diablo.weapon.setWeaponName("Винтовка");
        diablo.weapon.setWeaponType("Bushmaster BA50");
        System.out.println(diablo.printlninfo());
        System.out.println("---------------------------");
        System.out.println(ConsoleColors.BLACK_BACKGROUND + "----SKELET----" + ConsoleColors.RESET);
        Skeleton skeleton = new Skeleton(250, 25, 10);
        skeleton.weapon.setWeaponType("DIAMOND MEDALIST 38");
        skeleton.weapon.setWeaponName("Блочный лук");
        System.out.println(skeleton.printlninfo());
        System.out.println("---------------------------");
        System.out.println(ConsoleColors.BLACK_BACKGROUND + "----SKELET2.0----" + ConsoleColors.RESET);
        Skeleton skeleton2 = new Skeleton(150, 35, 8);
        skeleton2.weapon.setWeaponType("Sebastien Flute Optimo");
        skeleton2.weapon.setWeaponName("Древний лук");
        System.out.println(skeleton2.printlninfo());


    }
}
