package ua.univer.javacore.Array.task112;

import ua.univer.javacore.Array.Gen1;

public class A112 {
    public static void task112(){
        int [] mas = new int[5];
        Gen1.gen(mas);
        Gen1.sout(mas);
        System.out.println("------------------------------------------------");
        for(int i=0 ; i< mas.length-1; i++){
            for(int j=i+1 ;j<mas.length;j++ ){
                if(mas[i]>mas[j]){
                    int t= mas[i];
                    mas[i]=mas[j];
                    mas[j]=t;
                }
            }
        }
        Gen1.sout(mas);
    }
}
