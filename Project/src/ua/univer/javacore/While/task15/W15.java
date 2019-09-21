package ua.univer.javacore.While.task15;

import java.util.Scanner;

public class W15 {
    public static void task15(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the %");
        int input1 = in.nextInt();
        int deposit=1000;
        int FinalDeposit=1000;
        int CouMouns=0;
        while(FinalDeposit<1200){
            FinalDeposit=FinalDeposit+((deposit/100)*input1);
            System.out.println("F "+CouMouns+" "+FinalDeposit );
            CouMouns++;
        }
        System.out.println("Mouns :"+CouMouns);
    }
}
