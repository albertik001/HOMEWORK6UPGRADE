package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(ConsoleColors.RED_BACKGROUND + "----DIABLO----" + ConsoleColors.RESET);

        Boss diablo = new Boss("Kisaka", "Trizubec", 777, 50);
        System.out.println(diablo.printlninfo());
        System.out.println("---------------------------");
        System.out.println(ConsoleColors.BLACK_BACKGROUND + "----SKELET----" + ConsoleColors.RESET);
        Skeleton skeleton = new Skeleton("Koncsa", "Sperm",200,22,25);
        System.out.println(skeleton.printlninfo());
        System.out.println("---------------------------");
        System.out.println(ConsoleColors.BLACK_BACKGROUND + "----SKELET2.0----" + ConsoleColors.RESET);
        Skeleton skeleton2 = new Skeleton("Anal", "Jopa", 222,66, 777);
        System.out.println(skeleton2.printlninfo());


    }
}
