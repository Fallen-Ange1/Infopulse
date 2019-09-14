package ua.univer.javacore.IntegerPack.task6;


import java.util.Scanner;

public class PI6 {
    public static void task6(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter digit: ");
        int input = in.nextInt();
        int p;
        p=input%10;
        int k;
        k=(input-p)/10;
        System.out.println("десятки : "+k);
        System.out.println("единицы : "+p);
    }
}
