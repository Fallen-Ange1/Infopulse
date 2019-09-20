package ua.univer.javacore.IfElse.task10;

import java.util.Scanner;

public class IF10 {
    public static void task10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter digit A : ");
        int A = in.nextInt();
        System.out.println("Enter digit B : ");
        int B = in.nextInt();
        if (A != B)
            A = B = A + B;
        else {
            if (A == B)
                A = B = 0;
        }
        {
            System.out.println("Final A : " + A);
            System.out.println("Final B : " + B);
        }
    }
}

