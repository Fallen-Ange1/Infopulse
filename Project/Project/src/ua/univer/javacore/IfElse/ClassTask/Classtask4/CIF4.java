package ua.univer.javacore.IfElse.ClassTask.Classtask4;


import java.util.Scanner;

public class CIF4 {
    public static void Ctask4() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter mounth : ");
        int num1 = in.nextInt();
        switch (num1){
            case 1:
            case 12:
            case 2: System.out.println("Зима");break;
            case 3:
            case 5:
            case 4: System.out.println("Весна");break;
            case 6:
            case 8:
            case 7: System.out.println("Лето");break;
            case 9:
            case 10:
            case 11: System.out.println("Осень");break;
        }
    }
}


