package ua.univer.javacore.Series.task35;

import java.util.Scanner;

public class A35 {
    public static void task35() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter K : ");
        int k = in.nextInt();
        int res = 1;
        int a=1;
        int step=-1;
        int s=0;
        System.out.println("---------------------------------");
        for (int i = 1; i <=k; ++i,a=1) {
            while(a!=0){
            a=in.nextInt();
            ++step;
            }
            System.out.println("Step : "+step);
            s += step;
        }
        System.out.println("s :"+s);
    }
}
