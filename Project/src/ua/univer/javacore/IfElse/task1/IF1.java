package ua.univer.javacore.IfElse.task1;

import java.util.Scanner;

public class IF1 {
    public static void task1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first digit : ");
        int i1 = in.nextInt();
        System.out.println("Enter second digit : ");
        int i2 = in.nextInt();
        System.out.println("Enter third digit : ");
        int i3 = in.nextInt();
        System.out.println("Enter fourth digit : ");
        int i4 = in.nextInt();
        int fewer=i1;

        if (i2 < fewer)
            fewer = i2;

        if (i3 < fewer)
            fewer = i3;

        if (i4 < fewer)
            fewer = i4;

        System.out.println("Fewer digit = " + fewer);
    }
}

