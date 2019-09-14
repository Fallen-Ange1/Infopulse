package ua.univer.javacore.IfElse.task3;

import java.util.Scanner;

public class IF3 {
    public static void task3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first name : ");
        String name1 = in.nextLine();
        System.out.println("Enter second name : ");
        String name2 = in.nextLine();
        boolean b1= name1.equals(name2);
        if (b1)
            System.out.println("Тезки");
        else
            System.out.println("Не тезки");
    }
}

