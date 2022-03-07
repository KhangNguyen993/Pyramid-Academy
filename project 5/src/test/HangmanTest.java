import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class HangmanTest {



    @Test
    void printWordState() {
        String word = "";
        List<Character> testList = new ArrayList<>();
        assertNotNull(Hangman.printWordState(word,testList), "Should return true or false");
    }


    @AfterEach
    void tearDown() {
    }
}