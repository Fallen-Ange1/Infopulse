package ua.univer.javacore.Sort.task1;

import java.util.Arrays;

public class S1 {
    public static void task1() {
        int mas[] = {1, 2, 3, 4, 5, 5, 8, 9, 1, 2, 3};
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1 - i; j++) {
                if (mas[j] > mas[j + 1]) {
                    int t = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
