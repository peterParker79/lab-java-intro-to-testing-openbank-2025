package org.intro_testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {
    Wizard wizard;
    Warrior enemy; //Opponent
    @BeforeEach
    void setUpPlayersTest() {
        wizard = new Wizard(100,10,3,5);
        enemy = new Warrior(100,10,3, 50);

    }


    @Test
    void getSpellTest() {
        assertEquals(5, wizard.getSpell());
    }

    @Test
    @DisplayName("Check return Elf instance method convertToElf")
    void convertToElfTest() {
        assertInstanceOf(Elf.class, wizard.convertToElf());
    }

    @Test
    @DisplayName
            ("Must decrement enemy health= warrior.health - wizard.strength")

    void attackTest(){
        wizard.attack(enemy);
        assertEquals(90,enemy.getHealth());
    }

    @Test
    @DisplayName
            ("When health=0, called checkHealth method, decrease 1 unit live and restore up health to 100")
    // 1 partition case
    void checkHealthTestWhen0(){
        wizard.setHealth(0);
        wizard.setLives(2);
        wizard.checkHealth(); // Las vidas deben pasar a ser 1
        assertEquals(1,wizard.getLives());
        assertEquals(100, wizard.getHealth());// La salud de la nueva vida será 100
    }

    @Test
    @DisplayName
            ("When health>0, called checkHealth method, do nothing")
        // 2 partition case
    void checkHealthTestWhenUp0(){
        wizard.setHealth(50);
        wizard.setLives(2);
        wizard.checkHealth(); // Las vidas deben pasar a ser 1
        assertEquals(2,wizard.getLives());
        assertEquals(50, wizard.getHealth());// La salud de la nueva vida será 100
    }

}
