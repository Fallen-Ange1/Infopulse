package ua.univer.javacore.For.task14;

import java.util.Scanner;

public class F14 {

  public static void task14(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter digit");
        int num = in.nextInt();
        int finald=(2*num)-1;
        int kv=0;
        for(int i=1;i<=num;i++){
          kv=kv+(2*i)-1;
            System.out.println("Kvadrat "+i+" : "+kv);
        }

    }
}
