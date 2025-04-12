package org.intro_testing;

public class Wizard extends Player{

    public int spell;


    public Wizard(int health, int strength, int lives, int spell) {
        super(health, strength, lives);
        this.spell = spell;
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        setSpell(spell);
    }

    public Elf convertToElf(){
        return new Elf(this.health, this.strength,this.lives);
    }
}
