package ua.univer.javacore.IfElse.task17;

import java.util.Scanner;

public class IF17 {
    public static void task17(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first digit : ");
        int d1 = in.nextInt();
        System.out.println("Enter second digit : ");
        int d2 = in.nextInt();
        System.out.println("Enter third digit : ");
        int d3 = in.nextInt();
        if(d1>d2 && d2>d3 || d1<d2 && d2<d3){
            d1=2*d1;
            d2=2*d2;
            d3=2*d3;
        } else {
            d1=-d1;
            d2=-d2;
            d3=-d3;
        }
        System.out.println("First digit : " + d1);
        System.out.println("Second digit : " + d2);
        System.out.println("Third digit : " + d3);
    }
}
