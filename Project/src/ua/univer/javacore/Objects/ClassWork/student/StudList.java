package ua.univer.javacore.Objects.ClassWork.student;

import java.util.Scanner;

public class StudList {
    public static void facultList( Student[] students ){
        for (Student current:students) {
            String fac1 = "Programing";
            if (current.getFacult().equals(fac1)) {
                current.print();
            }
        }
    }
    public static void studentAfterYearList(Student[] students){
        int year1=1995;
        for (Student current:students) {
            if(current.getDate()>year1)
                current.print();
        }
    }
    public static void studentGroupList(Student[]students){
        int group1=215;
        for (Student current:students) {
            if(current.getGroup()==group1){
                current.print();
            }
        }
    }
}
