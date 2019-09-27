package ua.univer.javacore.Array.task25;

import ua.univer.javacore.Array.Gen;

import java.util.Scanner;

public class A25 {
    public static void task25(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter count of digits in array : ");
        int n = in.nextInt();
        int[] mas = new int[n];
        int counter1=0;
        int counter2=0;
        int FinRes=0;
        Gen.gen(mas);
        Gen.sout(mas);
        for(int i =0; i<mas.length;i++){
            if(mas[i]==0){
                counter1=i;
                break;
            }
        }
        for(int i =counter1+1;i<mas.length;i++){
            if(mas[i]==0){
                counter2=i;
                break;
            }
        }
        if(counter1==counter2+1){
            FinRes=0;
        }else{
            for(int i = counter1;i<counter2;i++){
                FinRes=FinRes+mas[i];
            }
        }
        System.out.println("Resault : "+FinRes);
    }
}
