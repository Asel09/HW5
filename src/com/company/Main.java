package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(58);
        boss.setDamage(68);
        boss.setTypeDefence("doctor");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getTypeDefence());


    }
}
