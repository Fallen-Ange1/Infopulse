package ua.univer.javacore.Array.task13;

import ua.univer.javacore.Array.Gen;

import java.util.Scanner;

public class A13 {
    public static void task13(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of digits in array : ");
        int n = in.nextInt();
        int[] mas = new int[n];
        int counter=0;
            for (int i = 0; i < mas.length; i++) {
                mas[i] = (int) (Math.random() * 200 - 100);
                if (mas[i] == 0) {
                   break;
                }
                counter++;
            }
            Gen.sout(mas);
        System.out.println("Counter : "+counter);
        }
    }

