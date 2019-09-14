package ua.univer.javacore.IntegerPack.task13;

import java.util.Scanner;

public class PI13 {
    public static void task13(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter digit: ");
        int input = in.nextInt();
        int p;
        int k;
        int lastDigit;
        int firstDigit;
        int secondDigit;
            k = input % 100;
            firstDigit=(input-k)/100;
            lastDigit = input % 10;
            secondDigit=(k-lastDigit)/10;
            p=(lastDigit*100)+(firstDigit*10)+secondDigit;

        System.out.println("Final digit : "+p);
    }
}