package ua.univer.javacore.Series.ClassWork;

import ua.univer.javacore.Series.Gen;

public class CW2 {
    public static void task2() {
        int[] mas = new int[10];
        int min = mas[0];
        int min2 = mas[0];
        int max = mas[0];
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        Gen.gen(mas);
        Gen.sout(mas);
        min = Gen.min(mas);
        max = Gen.max(mas);
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        Gen.m1(mas, min, count1, min2, count2);
    }
}
