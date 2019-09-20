package ua.univer.javacore.For.task40;

import java.util.Scanner;

public class F40 {
    public static void task40(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A");
        int input1 = in.nextInt();
        System.out.println("Enter B");
        double res=0;
        int input2 = in.nextInt();
        for(int i = 0 ; i<input2+1;i++){

            System.out.println("res "+(i+1)+": "+res);
        }
    }
}