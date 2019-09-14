package ua.univer.javacore.IfElse.task24;

import java.util.Scanner;

public class IF24 {
    public static void task24(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of x : ");
        int x = in.nextInt();
        double y=0;
        if(x>0){
            y=2*Math.sin(x);
        }else {
            if(x<=0){
                y=6-x;
            }
        }
        System.out.println("Final value of y : " + y);


}
}
