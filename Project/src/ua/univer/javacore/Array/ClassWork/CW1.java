package ua.univer.javacore.Array.ClassWork;

import ua.univer.javacore.Array.Gen;

public class CW1 {
    public static void task1() {
        int[] mas = new int[10];
        int x;
        int i = 0;
        while (i < mas.length) {
            x = (int) (Math.random() * 200 - 100);
            if (x % 2 == 1) {
                mas[i] = x;
                i++;
            }
        }
        Gen.sout(mas);
    }
}
