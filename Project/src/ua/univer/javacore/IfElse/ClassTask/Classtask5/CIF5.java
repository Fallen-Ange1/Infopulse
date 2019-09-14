package ua.univer.javacore.IfElse.ClassTask.Classtask5;

import java.util.Scanner;

public class CIF5 {
    public static void calc(int x,int y,String oper){
        switch(oper){
            case "+":System.out.println(x+y);break;
            case "-":System.out.println(x-y);break;
            case "*":System.out.println(x*y);break;
            case "/":System.out.println((double)x/y);break;
            default:System.out.println("Unexpected operation!");break;
                    }
    }
    public static void Ctask5() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter operation");
        String oper = in.nextLine();
        System.out.println("Enter digit 1 : ");
        int x = in.nextInt();
        System.out.println("Enter digit 2 : ");
        int y = in.nextInt();
        calc(x,y,oper);
    }
}
