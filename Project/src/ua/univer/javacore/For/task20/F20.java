package ua.univer.javacore.For.task20;

import java.util.Scanner;

public class F20 {
    public static void task20(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N : " );
        double input1=in.nextDouble();
        double fakt=1;
        double res2=0;
        for(int i=1;i<=input1;++i){
            fakt=fakt*i;
            res2=res2+fakt;
        }
        System.out.println("res : " +res2 );
    }
}
