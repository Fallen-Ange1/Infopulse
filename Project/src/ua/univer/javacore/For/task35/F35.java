package ua.univer.javacore.For.task35;

import java.util.Scanner;

public class F35 {
    public static void task35(){
        int A1=1;
        int A2=2;
        int A3=3;
        int res=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N > 2 : ");
        int input1 = in.nextInt();
        for(int i=0;i<=input1;++i){
            res=A3+A2-2*A1;
            System.out.println("res : "+res);
            A1=A2;
            A2=A3;
            A3=res;
        }
    }
}
