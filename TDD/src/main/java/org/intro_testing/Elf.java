package org.intro_testing;

public class Elf extends Player{

    private int speed;

    public Elf(int health, int strength, int lives) {
        super(health, strength, lives);

    }
    public Elf(int health, int strength, int lives, int speed) {
        super(health, strength, lives);
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
