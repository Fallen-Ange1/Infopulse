package ua.univer.javacore.Case.task20;

import java.util.Scanner;

public class SP20 {
    public static void task20() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter month : ");
        int input1 = in.nextInt();
        System.out.println("Enter day : ");
        int input2 = in.nextInt();
        p1 :{
            if (input1 > 12 || input1<=0) {
                System.out.println("Error");
                break p1;
            }
            if(input2>31 || input2<=0){
                System.out.println("Error");
                break p1;
            }
            if(input1==4 || input1==6 || input1==9 || input1==11){
                if(input2>30) {
                    System.out.println("Error");
                    break p1;
                }
            }
            if(input1==2){
                if(input2>29){
                    System.out.println("Error");
                    break p1;
                }
            }
            int r1=0;
            switch(input1){
                case 1 : if(input2>19){
                    System.out.println("Водолей");
                };break;
                case 2 : if(input2<18){
                    System.out.println("Водолей");
                }else {
                    System.out.println("Рыбы");
                };break;
                case 3: if(input2<19){
                    System.out.println("Рыбы");
                }else{
                    System.out.println("Овен");
                }break ;
                case 4 : if(input2<20){
                    System.out.println("Овен");
                }else {
                    System.out.println("Телец");
                }break ;
                case 5 : if(input2<19){
                    System.out.println("Телец");
                }else {
                    System.out.println("Блезнецы");
                }break ;
                case 6 : if(input2<20){
                    System.out.println("Близнецы");
                }else {
                    System.out.println("Рак");
                }break ;
                case 7 : if(input2<21){
                    System.out.println("Рак");
                }else {
                    System.out.println("Лев");
                }break ;
                case 8 : if(input2<21){
                    System.out.println("Лев");
                }else {
                    System.out.println("Дева");
                }break ;
                case 9 : if(input2<21){
                    System.out.println("Дева");
                }else{
                    System.out.println("Весы");
                }break ;
                case 10 : if(input2<21){
                    System.out.println("Весы");
                }else{
                    System.out.println("Скорпион");
                }break ;
                case 11 : if(input2<21){
                    System.out.println("Скорпион");
                }else {
                    System.out.println("Стрелец");
                }break ;
                case 12 : if(input2<20){
                    System.out.println("Стрелец");
                }else {
                    System.out.println("Козерог");
                }break ;
            }
        }
    }
}