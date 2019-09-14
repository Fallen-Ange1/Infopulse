package ua.univer.javacore.BooleanPack.task31;

public class PB31 {
    public static Boolean task31(){
        int a=4;
        int c=4;
        int b=5;
        Boolean triangle = false;

        if (a == b || b == c || a == c) {
        triangle=true;
        }
        System.out.println("isosceles triangle?"+triangle);
        return triangle;
    }
}
