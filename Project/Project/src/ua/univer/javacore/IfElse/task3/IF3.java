package ua.univer.javacore.IfElse.task3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IF3 {
    public static void task3(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter digit ");
        int num = in.nextInt();
        if(num>0)
            num+=1;
        if(num==0)
            num=10;
        if(num<0)
            num-=2;
        System.out.println("Final digit = "+num);
    }
}
