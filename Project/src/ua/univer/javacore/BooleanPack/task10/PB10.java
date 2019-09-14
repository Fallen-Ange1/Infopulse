package ua.univer.javacore.BooleanPack.task10;

public class PB10 {
    public static Boolean task10(){
        int a=4;
        int counter=0;
        int b=5;
        boolean isEven=false;
        if(a % 2 == 0) {
            counter++;
        }
        if(b%2 == 0 ){
            counter++;
        }
        if(counter!=2 && counter>0) {
        isEven=true;
        }
        System.out.println("Only one digit is even "+isEven);
        return isEven;
    }
}
