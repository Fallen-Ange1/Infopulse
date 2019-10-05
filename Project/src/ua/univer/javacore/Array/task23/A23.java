package ua.univer.javacore.Array.task23;

import ua.univer.javacore.Array.Gen1;

import java.util.Scanner;

public class A23 {
    public static void task23() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N :");
        int masL = in.nextInt();
        System.out.println("Enter K :");
        int K = in.nextInt();
        System.out.println("Enter L :");
        int L = in.nextInt();
        int[] mas = new int[masL];
        Gen1.gen(mas);
        Gen1.sout(mas);
        double sum = 0;
        double sArfm = 0;
        int cou = 0;
        for (int i = 0; i < K; i++) {
            cou++;
            sum = sum + mas[i];
        }
        for (int i = K; i < L; i++) {
            sArfm = sArfm;
        }
        for (int i = L+1; i < mas.length; i++) {
            cou++;
            sum = sum + mas[i];
        }
        sArfm = sum / cou;
        System.out.println("S arfm : " + sArfm);
    }
}
