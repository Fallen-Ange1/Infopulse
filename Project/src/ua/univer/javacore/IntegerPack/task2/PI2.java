package ua.univer.javacore.IntegerPack.task2;

import java.util.Scanner;

public class PI2 {
    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight: ");
        int input = in.nextInt();
        int p;
        int k;
        if(input%1000==0)
            p=input/1000;
        else {
            k = input % 1000;
            p=(input-k)/1000;
        }
        System.out.println("T : " + p);
    }
}
