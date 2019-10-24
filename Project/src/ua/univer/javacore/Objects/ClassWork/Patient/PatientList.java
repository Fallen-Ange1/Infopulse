package ua.univer.javacore.Objects.ClassWork.Patient;

import ua.univer.javacore.Objects.ClassWork.Customer.Customer;

public class PatientList {
    public static void PatientEqIllness(Patient[]patients){
        for (Patient current : patients){
            if(current.getIllnes().equals("Flu")){
                current.print();
            }
        }
    }
    public static void PatientMcardNEq(Patient []patients){
        for (Patient current:patients) {
            if(current.getMcardN()==123457){
                current.print();
            }
        }
    }
}
