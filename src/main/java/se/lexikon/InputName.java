package se.lexikon;

import java.util.Scanner;

public class InputName {

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello username");
        String na=sc.nextLine();
        System.out.println("You entered "+na);


    }
}
