package se.lexikon;

import java.util.Scanner;

public class Seconds {

    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Input seconds");
        int seconds= in.nextInt();
        int n1=seconds%60;
        int n2=seconds/60;
        int n3=n2%60;
        n2=n2/60;
        System.out.println(n2+":"+n3+":"+n1);


    }






}
