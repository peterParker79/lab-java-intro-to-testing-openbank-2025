package org.intro_testing;

public class Wizard extends Player{

    public int spell;


    public Elf convertToElf(){
        return new Elf(this.health, this.strength,this.lives);
    }
}
