package com.genspark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("You are in a land full of dragons. In front of you,\nyou see two caves. In one cave," +
                "the dragon is friendly\nand will share his treasure with you.The other dragon\nis greedy " +
                "and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");
        Scanner scanner = new Scanner(System.in);
        int userInput = Integer.parseInt(scanner.nextLine());

        if (userInput == 1){
            System.out.println("You approach the cave...\nIt is dark and spooky...\nA large dragon jumps out in front of" +
                    " you! He opens his jaws and...\nGobbles you down in one bite!");
        } else {
            System.out.println("You approach the cave...\nIt is dark and spooky...\nA large dragon jumps out in front of" +
                    " you! He makes friend with you and...\nHe shares his treasure with you!");

        }
    }
}
