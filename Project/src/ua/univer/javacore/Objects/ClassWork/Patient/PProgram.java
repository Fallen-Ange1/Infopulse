package ua.univer.javacore.Objects.ClassWork.Patient;

public class PProgram {
    public static void main(String[] args) {
        Patient[] patients = new Patient[4];
        patients[0] = new Patient(1234, "Petrenlo P.P.", 38095213, 123456, "Headache");
        patients[1] = new Patient(1235, "Ivanov V.V.", 380974321, 123457, "Earache");
        patients[2] = new Patient(1236, "Stepanov S.S.", 38066666, 123458, "Bellyache");
        patients[3] = new Patient(1237, "Tarasov T.T.", 380933333, 123459, "Flu");
        for (Patient current:patients) {
            current.print();
        }
        System.out.println("-------------------------------------------");
        PatientList.PatientEqIllness(patients);
        PatientList.PatientMcardNEq(patients);
    }
}