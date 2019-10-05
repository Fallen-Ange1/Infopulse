package ua.univer.javacore.MinMax.task24;

import ua.univer.javacore.Series.Gen;

import java.util.Scanner;

public class MM24 {
    public static void task24() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N :");
        int N = in.nextInt();
        int[] mas = new int[N];
        int[] mas2 = new int[N - 1];
        int max;
        Gen.gen(mas);
        Gen.sout(mas);
        for (int i = 0; i < N - 1; i++) {
            mas2[i] = mas[i] + mas[i + 1];
        }
        System.out.println("-------------------------------------");
        Gen.sout(mas2);
        max = Gen.max(mas2);
        System.out.println("Max sum : " + max);


    }
}
