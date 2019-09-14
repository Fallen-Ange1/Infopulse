package ua.univer.javacore.IntegerPack.task9;

import java.util.Scanner;

public class PI9 {
    public static void task9(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter digit: ");
        int input = in.nextInt();
        int p;
        int k;
        if(input%100==0)
            p=input/100;
        else {
            k = input % 100;
            p=(input-k)/100;
        }
        System.out.println("Сотни : "+p);
    }
}

