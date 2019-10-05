package ua.univer.javacore.Array.task17;

import ua.univer.javacore.Array.Gen1;

import java.util.Scanner;

public class A17 {
    public static void task17() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N :");
        int N = in.nextInt();
        int[] mas = new int[N];
        int counter = 0;
        Gen1.gen(mas);
        for (int i = 0; i < mas.length - 1; ++i) {
            if (i > 0) {
                i++;
            }
            System.out.println("mas[" + i + "]" + mas[i]);
            System.out.println("mas[" + (i + 1) + "]" + mas[i + 1]);
            for (int j = 0; j < mas.length; j++) {
                counter++;
                if (counter != 1) {
                    counter++;
                }
                System.out.println("mas[" + (N - counter) + "]" + mas[N - counter]);
                System.out.println("mas[" + (N - counter - 1) + "]" + mas[N - counter - 1]);
                break;
            }
        }
    }
}
