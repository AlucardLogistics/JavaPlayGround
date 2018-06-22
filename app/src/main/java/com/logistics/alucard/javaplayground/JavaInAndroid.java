package com.logistics.alucard.javaplayground;

public class JavaInAndroid {

    public static void main(String[] args) {

        int lives = 3;
        Player p1 = new Player();
        Player p2 = new Player("Sadics", 2, 8, 55);

        p1.setName("Alucard");
        System.out.println(p2.getScore());
        System.out.println(p1.getName());


    }
}
