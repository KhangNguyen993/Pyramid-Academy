import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberTest {
    GuessNumber guess;
    @BeforeEach
    void setUp() {
        guess = new GuessNumber();
    }



    @Test
    void playAgain() {
        assertEquals("Continue to play",guess.playAgain("y"),"Test game" );
    }


    @Test
    void playAgain1() {
        assertEquals("Stop playing game",guess.playAgain("n"),"Test game" );
    }


    @Test
    void main() {
    }
    @AfterEach
    void tearDown() {
    }
}