package ua.univer.javacore.Series;

public class Gen {
    public static void gen(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() *10 );
        }
    }

    public static void sout(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println("mas[" + i + "]" + mas[i]);
        }
    }

    public static int min(int[] mas ) {
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        return min;
    }

    public static int max(int[] mas) {
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        return max;
    }

    public static void m1(int[] mas, int min, int count1, int min2, int count2) {
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == min) {
                count1=i;
                break;
            }
        }
        for (int i = count1+1; i < mas.length; i++) {
            if (mas[i]==min) {
                count2=i;
                break;
            }
        }
        System.out.println("min2 : "+count2);
        if (count2>0) {
            System.out.println("Mas same min digits :" + mas[count1] + " ,count : " + count1 + ";" + count2);
        }
    }

}