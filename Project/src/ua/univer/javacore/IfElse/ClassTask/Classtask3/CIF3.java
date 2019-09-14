package ua.univer.javacore.IfElse.ClassTask.Classtask3;

import java.util.Scanner;

public class CIF3 {
    public static void Ctask3() {
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

