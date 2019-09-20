package ua.univer.javacore.For.task18;

import java.util.Scanner;

public class F18 {
    public static void task18(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A");
        double input1 = in.nextDouble();
        System.out.println("Enter N");
        double res=0;
        int input2 = in.nextInt();
        for(int i = 0 ; i<input2+1;i++){
            res=res+Math.pow(-1,i)*Math.pow(input1,i);
            System.out.println("res "+(i+1)+": "+res);
        }
    }
}
