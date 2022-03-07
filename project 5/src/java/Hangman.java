import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hangman {


    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Player 1, please enter your word:");

        try{
        String word = keyboard.nextLine();

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println("Ready for player 2");

        List<Character> playerGuesses = new ArrayList<>();
        int wrongCount = 0;
        while (true){
            printHangedMan(wrongCount);
            if(wrongCount >=6){
                System.out.println("You Lose!");
                System.out.println("The word is: " + word);
                break;
            }
            printWordState(word, playerGuesses);
            if(!getPlayerGuess(keyboard, word, playerGuesses)){
                wrongCount++;
            };
            if(printWordState(word,playerGuesses)){
                System.out.println("You Win!");
                break;
            }
            System.out.println("Please enter your guess for the word: ");
            if(keyboard.nextLine().equals(word)){
                System.out.println("You Win!");
                break;
            } else {
                System.out.println("Nope! Try again.");
            }
        }
    }
        catch (Exception e){
            System.out.println("Oops! Exception Caught: " + e.getMessage());
        }
    }

    private static void printHangedMan(int wrongCount) {
        System.out.println(" -------");
        System.out.println(" |     |");
        if(wrongCount >= 1){
            System.out.println(" 0");

        }
        if(wrongCount >= 2){
            System.out.print("\\ ");
            if (wrongCount >= 3){
                System.out.println("/");
            }
            else {
                System.out.println("");
            }
        }
        if(wrongCount >= 4){
            System.out.println(" |");
        }
        if(wrongCount >=5){
            System.out.print("/");
            if(wrongCount >=6){
                System.out.println(" \\");
            }
            else {
                System.out.println("");
            }
        }
    }

    public static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses) {

        System.out.println("Please enter a letter");
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess.charAt(0));
        return word.contains(letterGuess);
    }

    public static boolean printWordState(String word, List<Character> playerGuesses) {
        int correctCount = 0;
        for (int i = 0; i < word.length() ; i++) {
            if(playerGuesses.contains(word.charAt(i))){
                System.out.print(word.charAt(i));
                correctCount++;
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
        return (word.length() == correctCount);
    }

}
