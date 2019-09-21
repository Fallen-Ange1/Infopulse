package ua.univer.javacore.While.task10;

import java.util.Scanner;

public class W10 {
    public static void task10(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N :");
        double input1 = in.nextDouble();
        double res=0;
        double counter=0;
        while(res<input1){
            counter++;
            res=res+Math.pow(3,counter);
        }
        System.out.println("max digit :"+counter);
    }
}
