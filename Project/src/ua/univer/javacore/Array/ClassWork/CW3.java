package ua.univer.javacore.Array.ClassWork;

import ua.univer.javacore.Array.Gen;

public class CW3 {
    public static void task3() {
        int[] mas = new int[10];
        int min = mas[0];
        int max = mas[0];
        int count1 = 0;
        int count2 = 0;
        int temp = 0;
        Gen.gen(mas);
        max=Gen.max(mas);
        min=Gen.min(mas);
        Gen.sout(mas);

        System.out.println("min :"+min);
        System.out.println("max :"+max);
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < mas.length; i++) {
            if (mas[i]==min) {
                mas[i] =max;

            } else {
                if (mas[i]==max) {
                    mas[i] = min;
                }
            }
        }
        Gen.sout(mas);
    }
}
