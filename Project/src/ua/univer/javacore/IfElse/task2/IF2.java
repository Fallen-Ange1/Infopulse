package ua.univer.javacore.IfElse.task2;



import java.util.Scanner;

public class IF2 {
    public static void findMinMaxValue(int i1, int i2, int i3, int i4, int i5) {
        int fewer;
        fewer=Math.min(Math.min(i1,i2),Math.min(i3,i4));
        fewer=Math.min(fewer,i5);
        int greater;
        greater=Math.max(Math.max(i1,i2),Math.max(i3,i4));
        greater=Math.max(greater,i5);

        System.out.println("Fewer digit = " + fewer);
        System.out.println("Greater digit = "+greater);
    }

    public static void task2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first digit : ");
        int i1 = in.nextInt();
        System.out.println("Enter second digit : ");
        int i2 = in.nextInt();
        System.out.println("Enter third digit : ");
        int i3 = in.nextInt();
        System.out.println("Enter fourth digit : ");
        int i4 = in.nextInt();
        System.out.println("Enter fifth digit : ");
        int i5=in.nextInt();
        int k;
        findMinMaxValue(i1,i2,i3,i4,i5);

    }
}

