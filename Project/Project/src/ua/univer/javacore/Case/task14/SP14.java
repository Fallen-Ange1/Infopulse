package ua.univer.javacore.Case.task14;

import java.util.Scanner;

public class SP14 {
    public static void task14(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the type digit : ");
        int input1 =  in.nextInt();
        System.out.println("Input value : ");
        double input2 = in.nextDouble();
        double Final=0;
        switch (input1){
            case 1 : Final=input2;break;
            case 2 : Final=input2*(Math.pow(3,0.5))/6;break;
            case 3 : Final=input2*(Math.pow(3,0.5))/3;break;
            case 4 : Final=Math.pow(input2,2)*Math.pow(3,0.5)/4;break;
            default:
                System.out.println("Error!");
        }
        System.out.println("Resault : "+ Final);
    }
}
