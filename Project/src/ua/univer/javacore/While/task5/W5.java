package ua.univer.javacore.While.task5;

import java.util.Scanner;

public class W5 {
    public static void task5(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter digit");
        double input1 = in.nextDouble();
        double f=0;
        double counter=0;
        while(f<input1-1){
            f=f+Math.pow(2,counter);
                    counter++;
        }
        System.out.println("Cou "+counter);

}
}
