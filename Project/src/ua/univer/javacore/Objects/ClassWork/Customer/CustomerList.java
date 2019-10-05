package ua.univer.javacore.Objects.ClassWork.Customer;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CustomerList {
    public static void printAlphabetical(Customer[] customers) {
        ArrayList<String> list = new ArrayList<String>();

        for (Customer current : customers) {

            list.add(current.getFio());
        }

        Collections.sort(list);
        System.out.println("List " + list);
    }

    public static void customerCardInBondaries(Customer[] customers) {
        for (Customer current:customers) {
            if(current.getCreditcn()>212456678){
                current.print();}
        }
    }
}


