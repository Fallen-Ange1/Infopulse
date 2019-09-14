package ua.univer.javacore.IfElse.task14;

import java.util.Scanner;

public class IF14 {
    public static void task14(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first digit : ");
        int d1 = in.nextInt();
        System.out.println("Enter second digit : ");
        int d2 = in.nextInt();
        System.out.println("Enter third digit : ");
        int d3 = in.nextInt();
        int myMin;
        int myMax;
        myMin=Math.min(Math.min(d1,d2),d3);
        myMax=Math.max(Math.max(d1,d2),d3);
        System.out.println("Max digit : "+myMax);
        System.out.println("Min digit : "+myMin);
    }
}
