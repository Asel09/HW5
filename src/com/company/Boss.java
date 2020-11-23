package com.company;

public class Boss {
    private int health, damage;
    private String typeDefence;

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

    public String getTypeDefence() {
        return typeDefence;
    }

    public void setTypeDefence(String typeDefence) {
        this.typeDefence = typeDefence;
    }

    public Boss(int health, int damage, String typeDefence) {
        this.health = health;
        this.damage = damage;
        this.typeDefence = typeDefence;
    }

    public Boss() {
        this.health = health;
        this.damage = damage;
    }

    public Boss(String typeDefence) {
        this.typeDefence = typeDefence;
    }
}

