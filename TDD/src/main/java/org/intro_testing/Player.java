package org.intro_testing;

public abstract class Player {
    protected int health;
    protected int strength;
    protected int lives;
    protected final int  initialHealth;

    public Player(int health, int strength, int lives) {
        setHealth(health);
        setStrength(strength);
        setLives(lives);
        initialHealth=health;
    }

    public int getInitialHealth() {
        return initialHealth;
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

    public void decrementLive (){
        this.lives-=1;
        this.health=this.initialHealth;
        if (lives<=0){
            System.out.println("This character is dead");
        }
    }

    public void attack (Player playerToAttack){
        playerToAttack.setHealth(playerToAttack.getHealth()-this.strength);
    }

    public void checkHealth() {
        if(this.health<=0){decrementLive();}


    }
}
