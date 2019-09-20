package ua.univer.javacore.IntegerPack.task18;

import java.util.Scanner;

public class PI18 {
    public static void task18(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter digit: ");
        int input = in.nextInt();
        int k;
        int lastDigit;
        int semiLastDigit;
        k = input/1100;
        semiLastDigit=input-(k*1100);
        lastDigit=semiLastDigit%10;
        System.out.println("Last Digit : "+lastDigit);
    }
}

