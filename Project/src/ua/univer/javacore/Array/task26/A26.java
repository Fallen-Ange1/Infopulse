package ua.univer.javacore.Array.task26;

import java.util.Scanner;

public class A26 {
    public static void task26() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N : ");
        double n = in.nextDouble();
        System.out.println("Enter K : ");
        double k = in.nextDouble();
        double res = 1;
        double a;
        for (int i = 1; i < n; ++i) {
            a=in.nextDouble();
            for (int f = 1; f<=k; ++f) res=Math.pow(a,k);
            System.out.println("res = " + res);
        }

    }
}
