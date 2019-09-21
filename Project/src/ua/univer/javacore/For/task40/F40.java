package ua.univer.javacore.For.task40;

import java.util.Scanner;

public class F40 {
    public static void task40(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A");
        int input1 = in.nextInt();
        System.out.println("Enter B");
        int input2 = in.nextInt();
        int res;
        for(int i = 0 ; i<=input2-input1+1;++i){
            for(int j=1;j<=i;++j){
                res=input1+i-1;
                System.out.print(res);
            }
        }
    }
}