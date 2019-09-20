package ua.univer.javacore.Case.task18;

import java.util.Scanner;

public class SP18 {
    public static void task18() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the digit : ");
        int input = in.nextInt();

        int odinitsy = input % 10;
        int desiatky = (input % 100-odinitsy)/10;
        int sotny = (input - (desiatky + odinitsy))/100;
        first :{
            switch (sotny) {
            case 1:
                System.out.print("Cто ");
                break;
            case 2:
                System.out.print("Двісті ");
                break;
            case 3:
                System.out.print("Триста ");
                break;
            case 4:
                System.out.print("Чотириста ");
                break;
            case 5:
                System.out.print("П'ятсот  ");
                break;
            case 6:
                System.out.print("Шістот ");
                break;
            case 7:
                System.out.print("Сімсот ");
                break;
            case 8:
                System.out.print("Вісімсот ");
                break;
            case 9:
                System.out.print("Дев'ятсот ");
                break;
            default:
                System.out.println("Digit is bigger than 1000!");


        }
        if (desiatky < 2) {
            switch (odinitsy) {
                case 0:
                    System.out.print("десять ");
                    break;
                case 1:
                    System.out.print("одинадцять");
                    break;
                case 2:
                    System.out.print("дванадцять");
                    break;
                case 3:
                    System.out.print("тринадцять");
                    break;
                case 4:
                    System.out.print("чотирнадцять");
                    break;
                case 5:
                    System.out.print("п'ятнадцять");
                    break;
                case 6:
                    System.out.print("шістнадцять");
                    break;
                case 7:
                    System.out.print("сімнадцять");
                    break;
                case 8:
                    System.out.print("вісімнадцять");
                    break;
                case 9:
                    System.out.print("дев'ятнадцять");
                    break;

            }
break first;
        }

            switch (desiatky) {
                case 2:
                    System.out.print("двадцять ");
                    break;
                case 3:
                    System.out.print("тридцять ");
                    break;
                case 4:
                    System.out.print("сорок  ");
                    break;
                case 5:
                    System.out.print("п'ятдесят ");
                    break;
                case 6:
                    System.out.print("шістдесят ");
                    break;
                case 7:
                    System.out.print("сімдесят  ");
                    break;
                case 8:
                    System.out.print("вісімдесят ");
                    break;
                case 9:
                    System.out.print("дев'яносто ");
                    break;
            }
            switch (odinitsy) {
                case 1:
                    System.out.print("один");break;
                case 2:
                    System.out.print("два");break;
                case 3:
                    System.out.print("три");break;
                case 4:
                    System.out.print("чотири");break;
                case 5:
                    System.out.print("п'ять");break;
                case 6:
                    System.out.print("шість");break;
                case 7:
                    System.out.print("сім");break;
                case 8:
                    System.out.print("вісім");break;
                case 9:
                    System.out.print("дев'ять");break;
            }
        }
    }
}
