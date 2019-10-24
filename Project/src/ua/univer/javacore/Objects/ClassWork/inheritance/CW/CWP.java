package ua.univer.javacore.Objects.ClassWork.inheritance.CW;

import ua.univer.javacore.Array.Array;
import ua.univer.javacore.Array.Gen1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CWP {
    public static Vechine MostExpV(Vechine[] vechines) {
        int maxp = 0;
        Vechine[] vechines1 = new Vechine[1];
        for (Vechine current : vechines) {
            if (current.getPrice() > maxp) {

                maxp = current.getPrice();
                vechines1[0] = current;
            } else break;

        }
        return vechines1[0];
    }

    public static Vechine LessExpV(Vechine[] vechines) {
        int minp = 1000000000;
        Vechine[] vechines1 = new Vechine[1];
        for (Vechine current : vechines) {
            if (current.getPrice() < minp) {
                minp = current.getPrice();
                vechines1[0] = current;
            } else break;

        }
        return vechines1[0];
    }

    public static Vechine VechinePD(Vechine[] vechines) {
        Vechine[] vechines1 = new Vechine[1];
        for (Vechine current : vechines) {
            if (current.getPrice() < 10000) {
                if (current.getDate() > 2000) vechines1[0] = current;
            }
        }
        return vechines1[0];
    }

    public static Vechine[] VechineDA(Vechine[] vechines) {
        Vechine[] vechines1 = new Vechine[3];
        for (int i = 0; i < 3; i++) {
            if (vechines[i].getDate() > 2000 && vechines[i].getDate() < 2010) {
                vechines1[i] = vechines[i];
            }
        }
        return vechines1;
    }

    public static Vechine[] VechineDS(Vechine[] vechines) {
        double percent = 0;
        int old = 0;
        double serP = 0;
        int currentY = 2019;
        Vechine[] vechines1 = new Vechine[3];
        for (Vechine currnet : vechines) {
            serP = (serP + currnet.getPrice()) / 3;
            percent = percent + ((serP / 100) * 25);

        }
        for (int i = 0; i < 3; i++) {
            if (vechines[i].getDate()>2014 && vechines[i].getPrice() < (vechines[i].getPrice() + percent) && vechines[i].getPrice() > (vechines[i].getPrice() - percent) && vechines[i].getSpeed() < 200 && vechines[i].getSpeed() > 100) {
                vechines1[i] = vechines[i];
            }
        }
        return vechines1;
    }


    public static void main(String[] args) {
        Vechine[] vechines = new Vechine[3];
        vechines[0] = new Car(1000, 120, 2001, 4, "Zhyga");
        vechines[1] = new Ship(10000, 120, 2016, 300, "Pobieda", "Port1");
        vechines[2] = new Plane(23000, 800, 2018, 150, "Samaliot", 1000);
        System.out.println("\t" + "1. Вывести на екран механизм с наибольшей ценой" + "\n" + "\t" + "2. Волучить механизм с наименьшей ценой" + "\n" + "\t" + "3. Получить механизм с ценой меньше 10000 после 2000 года" + "\n" + "\t" + "4. Получить масив механизмов год выпуска с 2000 по 2010" + "\n" + "\t" + "5. Получить масив механизмов не старше 5 лет с средней ценой(+- 20%) и скоростью в диапазоне от 100 до 200");
       dot:{
        System.out.print("Выберите вариант : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        switch (n){
            case 1 :System.out.println("Механизм с наибольшей ценой : " + MostExpV(vechines).toString());break;
            case 2 :System.out.println("Механизм с наименьшей ценой : " + LessExpV(vechines).toString());break;
            case 3 :System.out.println("Mеханизм с ценой меньше 10000 после 2000 года : " + VechinePD(vechines).toString());break;
            case 4 :Gen1.soutV(VechineDA(vechines));break;
            case 5 :Gen1.soutV(VechineDS(vechines));break;
            default:
                System.out.println("Error enter number [0-5]!");
        }
           System.out.println("Еще раз ? ");

    }}

}
