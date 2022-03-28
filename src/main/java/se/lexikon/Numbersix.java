package se.lexikon;

import java.util.Scanner;

public class Numbersix {

    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input your first number: ");
        int numberOne = scan.nextInt();
        System.out.println("Input your second number: ");
        int numberTwo = scan.nextInt();


        System.out.println("addition: " + (numberOne + numberTwo));

        System.out.println("division: " + (numberOne / numberTwo));
        System.out.println("multiplication: " + (numberOne * numberTwo));
        System.out.println("subtraction: " + (numberOne - numberTwo));
    }
}
