package ua.univer.javacore.Array.task33;

import ua.univer.javacore.Array.Gen1;

import java.util.Scanner;

public class A33 {
    public static void task33() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N :");
        int N = in.nextInt();
        int[] mas = new int[N];
        int[] LocMasi = new int[N+10];
        Gen1.gen(mas);
        int LocMas = 0;
        for (int i = 0; i < mas.length; i++) {

            if (i == 0) {
                if (mas[i] < mas[i + 1]) {
                    LocMasi[i] = mas[i + 1];
                }else {
                    LocMasi[i]=mas[i];
                }
            }
            if (i < 9&&i!=0) {
                if (mas[i] < mas[i - 1]) {
                    LocMasi[i] = mas[i - 1];
                } else if(mas[i]<mas[i+1]){
                    LocMasi[i] = mas[i + 1];
                }else LocMasi[i]=LocMasi[i-1];
            }
        }
        Gen1.sout(mas);
        System.out.println("----------------------------------");
        Gen1.sout(LocMasi);
    }
}
