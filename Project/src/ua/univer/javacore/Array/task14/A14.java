package ua.univer.javacore.Array.task14;

import org.w3c.dom.ls.LSOutput;
import ua.univer.javacore.Series.Gen;

import java.util.Scanner;

public class A14 {
    public static void task14(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N :");
        int N = in.nextInt();
        int[] mas = new int[N];
        Gen.gen(mas);
        for(int i=0;i<mas.length;i++){
            i++;
            System.out.println("mas[" + i + "]" + mas[i]);
        }
        for(int i=1;i<mas.length-1;i++){
            i++;
            System.out.println("mas[" + i + "]" + mas[i]);
        }
    }
}
