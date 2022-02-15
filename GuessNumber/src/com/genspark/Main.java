package com.genspark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean playGame = true;
        int numberGuess = 0;
        int userInputInteger;
        int maxGuess = 6;

        int min = 1;
        int max = 20;
        int guess = (int)(Math.random()*(max-min+1) + min);  // Guess random number from 1 to 20;
        String userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, What is your name?");
        
        String userName = scanner.nextLine();

        System.out.println("Well," + userName + ", I am thinking of a number between 1 and 20.");

            while (playGame) {
        try {
            System.out.println("**************");
            System.out.println("Take a guess");
            userInput = scanner.nextLine();

            userInputInteger = Integer.parseInt(userInput);

            if (userInputInteger == guess) {
                System.out.println("Good job, " + userName + "! You guessed my number in " + numberGuess + " guess(es)!");
                System.out.println("**************");
                System.out.println("Would you like to play again?(y or n)");

                String ans = scanner.nextLine();
                String y; //Yes
                String n; // No
                if (ans.equals("y")) {
                    numberGuess = 0;
                    guess = (int) (Math.random() * (max - min + 1) + min);
                } else {
                    System.out.println("Good bye, " + userName);
                    playGame = false;
                }
            } else if (userInputInteger > guess && userInputInteger < 20) {
                numberGuess++;
                System.out.println("Your guess is too high, " + numberGuess + " guess(es)!");
            } else if (userInputInteger < guess && userInputInteger > 0) {
                numberGuess++;
                System.out.println("Your guess is too low, " + numberGuess + " guess(es)!");
            } else {
                numberGuess++;
                System.out.println("Out of range! You have to guess from 1 to 20");

            }
            if (numberGuess == maxGuess) {
                System.out.println("You Lose! Good Luck next time!");
                System.out.println("Would you like to play again?(y or n)");

                String ans = scanner.nextLine();
                String y; //Yes
                String n; // No
                if (ans.equals("y")) {
                    numberGuess = 0;
                    guess = (int) (Math.random() * (max - min + 1) + min);
                } else {
                    System.out.println("Good bye, " + userName + "!");
                    playGame = false;
                }
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Please enter number from 1 to 20");
        }
            }
        }
    }

