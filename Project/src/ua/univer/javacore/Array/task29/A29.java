package ua.univer.javacore.Array.task29;

import ua.univer.javacore.Array.Gen1;

import java.util.Scanner;

public class A29 {
    public static void task29() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N :");
        int N = in.nextInt();
        int[] mas = new int[N];
        Gen1.gen(mas);
        Gen1.sout(mas);
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (i % 2 != 0) {
                if (max < mas[i]) max = mas[i];
            }
        }
        System.out.println("Max :"+max);
    }
}
