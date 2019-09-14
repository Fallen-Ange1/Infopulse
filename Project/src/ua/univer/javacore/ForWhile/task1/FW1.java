package ua.univer.javacore.ForWhile.task1;

import java.util.Scanner;

public class FW1 {
    public static void facktorial(int num){
        int facktoriald=num;
        int i=num-1;
        while (i!=0){
            facktoriald=facktoriald*i;
            i--;
        }
        System.out.println(facktoriald);
    }
  public static void task1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter digit");
        int num = in.nextInt();
        facktorial(num);
    }
}
