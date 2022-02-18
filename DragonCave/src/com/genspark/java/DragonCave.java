package com.genspark.java;

import java.util.Scanner;

public class DragonCave {

    public static String getUserInput(int choice) {
        if (choice == 1){
            return """
                        You approach the cave...
                        It is dark and spooky...
                        A large dragon jumps out in front of you! He opens his jaws and...
                        Gobbles you down in one bite!""";

        } else if(choice == 2){
            return """
                        You approach the cave...
                        It is dark and spooky...
                        A large dragon jumps out in front of you! He makes friend with you and...
                        He shares his treasure with you!""";
        }
        else {
            return "Oops, Exception! You have to choose between 1 or 2";
        }

    }

    public static void main(String[] args) {
        System.out.println("""
                You are in a land full of dragons. In front of you,
                you see two caves. In one cave,the dragon is friendly
                and will share his treasure with you.The other dragon
                is greedy and hungry and will eat you on sight.""");
        System.out.println("Which cave will you go into? (1 or 2)");

        Scanner scanner = new Scanner(System.in);
        try {
            int userInput = Integer.parseInt(scanner.nextLine());
            System.out.println(getUserInput(userInput));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Oops Exception! Please enter either 1 or 2" );
        }
    }

}
