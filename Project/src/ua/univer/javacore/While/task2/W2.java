package ua.univer.javacore.While.task2;

import java.util.Scanner;

public class W2 {
    public static void task2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first digit");
        int input1 = in.nextInt();
        System.out.println("Enter second digit");
        int input2 = in.nextInt();
        int res=input1;
        int counter=0;
        while (res-input2>=0){
            res=res-input2;
            ++counter;
        }
        System.out.println("Counter : "+counter);
    }
}


