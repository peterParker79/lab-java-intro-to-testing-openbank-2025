package org.intro_testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
class WarriorTest {
    private Warrior warrior;

    //learning this 2 lines below
    // Permite almacenar la captura que normalmente iría a pantalla
     private final ByteArrayOutputStream byteArray = new ByteArrayOutputStream();

    //Se guarda el flujo original de System.out. Finalmente se restaura.
     private final PrintStream standardOut = System.out;



    @BeforeEach
    void setUpWarrior() {
       warrior = new Warrior(100, 10, 3, 50);
       System.setOut(new PrintStream(byteArray));
    }


    @Test
    @DisplayName("Check get force method")
    void getForceTest() {
        assertEquals(50, warrior.getForce());
    }

    @Test
    @DisplayName("Check set force method")
    void setForceTest() {
        warrior.setForce(49);
        assertEquals(49,warrior.getForce());
    }

    @Test
    @DisplayName("Check return Elf instance method convertToElf")
    void convertToElfTest() {
        assertInstanceOf(Elf.class, warrior.convertToElf());
    }

    @Test
    @DisplayName ("Test decrement live")
    void decrementLiveTest(){
        // al decrementar una vida la salud debe volver al 100
        warrior.decrementLive();
        assertEquals(2,warrior.getLives());
        assertEquals(100, warrior.getHealth());
        warrior.setLives(0);
        warrior.decrementLive();
        //Para probar si un método escribe algo en pantalla,
        //necesito redirigir temporalmente System.out a un
        //flujo que pueda comprobart con el test.
        //Se puede hacer usando System.setOut()
        String expectedStringOut ="This character is dead" + System.lineSeparator();
        assertEquals(expectedStringOut, byteArray.toString(),"Mensaje de salida correcto");
    }

    // falta profundizar comprensión aqui
    void restoreOut(){System.setOut((standardOut));}



}