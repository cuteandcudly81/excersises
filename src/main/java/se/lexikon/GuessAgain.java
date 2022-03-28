package se.lexikon;

import java.util.Random;
import java.util.Scanner;

public class GuessAgain {

    public static void main (String[]args) {
        Scanner scan = new Scanner (System.in);
        Random rand = new Random();
        int number = rand.nextInt(  500);
        int guesses = 0;
        while (true) {
            guesses++;
            int guess = scan.nextInt();

            if(guess == number) {
                break;
            }
            if(guess > number) {
                System.out.println("Your guess is too big");
            } else {
                System.out.println("Your guess is too small");
            }
        }

        System.out.println("You won with " + guesses + " guesses. ");


    }
}
