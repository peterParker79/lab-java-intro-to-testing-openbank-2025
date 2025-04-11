package org.intro_testing;

public abstract class Player {
    private int health;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        setHealth(health);
        setStrength(strength);
        setLives(lives);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
