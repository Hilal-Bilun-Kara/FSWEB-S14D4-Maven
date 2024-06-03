package org.example.rpg;

public class RgpMain {
    public static void main(String[] args) {
        Monster shrek = new Troll("shrek",3,5.2);

        printAttackResult(shrek);

    }
    private static void printAttackResult(Monster monster){
        System.out.println("Attack Result:" + monster.getDamage() + monster.attack());
    }
}
