package com.genspark.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {

    DragonCave dragon;

    @BeforeEach
    void setUp() {
        dragon = new DragonCave();
    }


    @Test
    void getUserInput1() {
        System.out.println(dragon.getUserInput(1));
        assertEquals("""
                        You approach the cave...
                        It is dark and spooky...
                        A large dragon jumps out in front of you! He opens his jaws and...
                        Gobbles you down in one bite!""",dragon.getUserInput(1),"Test 1 Failed");
    }
    @Test
    void getUserInput2() {
        System.out.println(dragon.getUserInput(2));
        assertEquals("""
                        You approach the cave...
                        It is dark and spooky...
                        A large dragon jumps out in front of you! He makes friend with you and...
                        He shares his treasure with you!""",dragon.getUserInput(2),"Test 2 Failed");
    }
    @AfterEach
    void tearDown() {
    }


}