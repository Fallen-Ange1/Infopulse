package ua.univer.javacore.Case.task6;
import java.util.Scanner;

public class SP6 {
    public static void task6(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value digit");
        int i = in.nextInt();
        System.out.println("Enter count");
        double input = in.nextDouble();
        double Final=0;
        switch(i){
            case 1 : Final=input/10;break;
            case 2 : Final=input*1000;break;
            case 3 : Final=input;break;
            case 4 : Final=input/1000;break;
            case 5 : Final=input/100;break;
            default:
                System.out.println("Error");
        }
        System.out.println("Final resault : " + Final);
    }
}
