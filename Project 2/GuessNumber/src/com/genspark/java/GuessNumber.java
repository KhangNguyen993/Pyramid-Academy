import java.util.Scanner;

public class GuessNumber {

	// write your code here
        public static int userInput;
        public static int numberGuess;
        public static int i;
        public static boolean playGame = true;
        public static int maxGuess = 6;
        public static String ans;
        public static Scanner scanner = new Scanner(System.in);

        public static int getRandom() {
            int min = 1;
            int max = 20;
            return (int)(Math.random()*(max-min+1) + min);

        }

        public static String getName() {
            System.out.println("Hello, What is your name?");
            String name = scanner.nextLine();
//            String name = "khang";
            return name;
        }

        public static String playAgain(String choice){
            String y;
            String n;

            try{
                if (choice.equals("y")) {
                    numberGuess = 0;
                    i = 0;
                    playGame = true;
                    return "Continue to play";
                } else if(choice.equals("n")) {
                    System.out.println("Good bye!");
                    playGame = false;
                    return "Stop playing game";
                }
                else {
                    System.out.println("Please enter either y or n");
                    System.out.println("Oops, Exception! The game stops!)");
                    playGame = false;
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Please enter either y or n");
                System.out.println("Oops, Exception! The game stops!)");
            }
            return null;
        }

        public static void main(String[] args) {

            String userName = getName();
            String prompt = "Well," + userName + ", I am thinking of a number between 1 and 20.";
            System.out.println(prompt);
            int guess = getRandom();

            while(playGame) {
                try{
                    System.out.println("Take a guess");
                    userInput = Integer.parseInt(scanner.nextLine());
                    if (userInput == guess) {
                        System.out.println("Good job, " + userName + "! You guessed my number in " + numberGuess + " guess(es)!");
                        guess = getRandom();
                        System.out.println("Would you like to play again?(y or n)");
                        ans = scanner.nextLine();
                        playAgain(ans);
                    } else if (userInput > guess && userInput < 20) {
                        numberGuess++;
                        System.out.println("Your guess is too high, " + numberGuess + " guess(es)!");
                    } else if (userInput < guess && userInput > 0) {
                        numberGuess++;
                        System.out.println("Your guess is too low, " + numberGuess + " guess(es)!");
                    } else {
                        numberGuess++;
                        System.out.println("Out of range! You have to guess from 1 to 20");
                    }
                    if (numberGuess == maxGuess) {
                        System.out.println("You Lose! Good Luck next time!");
                        guess = getRandom();
                        System.out.println("Would you like to play again?(y or n)");
                        ans = scanner.nextLine();
                        playAgain(ans);
                    }
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                    System.out.println("Please enter a number from 1 to 20");
                }
            }
        }
    }

