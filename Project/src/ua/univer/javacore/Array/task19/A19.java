package ua.univer.javacore.Array.task19;

import ua.univer.javacore.Array.Gen;

import java.util.Scanner;

public class A19 {
    public static void task19(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of digits in array : ");
        int n = in.nextInt();
        int[] mas = new int[n];
        int counter=0;
        Gen.gen(mas);
        for (int i = 0; i < mas.length; i++) {
            System.out.println("mas[" + i + "]" + mas[i]);
        }
        System.out.println("-------------------------------------------------------");
        for(int i=0;i<n-1;++i){

                if (mas[i] > mas[i + 1]) {
                    System.out.println("mas[" + i + "]" + " : " + mas[i+1]);
                    counter++;
                }

        }
        System.out.println("Counter : "+counter);
    }
}
