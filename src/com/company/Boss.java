package com.company;

public class Boss {
    private int health;
    private int damage;
    private String attackType;

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

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "health=" + health +
                ", damage=" + damage +
                ", attackType='" + attackType + '\'' +
                '}';
    }
}
