package ua.univer.javacore.BooleanPack.task16;

public class PB16 {
    public static Boolean task16(){
        int a=5;
        int counter=0;
        boolean isEven2=false;
        if(a % 2 == 0 && a>9) {
            counter++;
        }
        if(counter==1) {
            isEven2=true;
        }
        System.out.println("digit is even and bigger than nine?  "+isEven2);
        return isEven2;
    }
}