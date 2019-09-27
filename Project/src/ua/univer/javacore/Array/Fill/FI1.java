package ua.univer.javacore.Array.Fill;

import java.util.Scanner;

public class FI1 {
    public static void fill1() {
        Scanner in = new Scanner(System.in);
        System.out.println("1 - rectangular\n" + "2 - right triangle\n" + "3 - equilateral triangle\n" + "4 - rhombus");
        System.out.println("Enter number : ");
        int number = in.nextInt();
        if (number == 1) {
            System.out.println("--------------------------------");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        if (number == 2) {
            int counter = 10;
            System.out.println("--------------------------------");
            for (int i = 0; i < 10; i++) {
                counter--;
                for (int j = counter; j < 10; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        if (number == 3) {
            int counter = 10;
            System.out.println("--------------------------------");
            for (int i = 0; i < 10; i++) {
                counter--;
                if (counter > 0) {
                    for (int k = counter; k != 0; k--)
                        System.out.print(" ");
                }
                for (int j = counter; j < 10; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        if (number == 4) {
            int counter = 10;
            System.out.println("--------------------------------");
            for (int i = 0; i < 10; i++) {
                counter--;
                if (counter > 0) {
                    for (int k = counter; k != 0; k--)
                        System.out.print(" ");
                }
                for (int j = counter; j < 10; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i < 10; i++) {
                counter++;
                if (counter < 10) {
                    for (int k = 1; k <=counter; k++)
                        System.out.print(" ");
                }
                for (int j = 10-counter; j != 0; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}


