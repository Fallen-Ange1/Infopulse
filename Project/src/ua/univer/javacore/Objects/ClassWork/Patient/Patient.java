package ua.univer.javacore.Objects.ClassWork.Patient;

public class Patient {
    private int id;
    private String FIO;
    private int phoneN;
    private int mcardN;
    private String illnes;

    Patient(int id, String FIO, int phoneN, int mcardN, String illnes) {
        this.id = id;
        this.FIO = FIO;
        this.phoneN = phoneN;
        this.mcardN = mcardN;
        this.illnes = illnes;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getFIO() {
        return FIO;
    }

    public void setPhoneN(int phoneN) {
        this.phoneN = phoneN;
    }

    public int getPhoneN() {
        return phoneN;
    }

    public void setMcardN(int mcardN) {
        this.mcardN = mcardN;
    }

    public int getMcardN() {
        return mcardN;
    }

    public void setIllnes(String illnes) {
        this.illnes = illnes;
    }

    public String getIllnes() {
        return illnes;
    }

    public void print(){
        System.out.println("ID : "+this.id+" FIO : "+this.FIO+" Phone Number : "+this.phoneN+" Medical card number : "+this.mcardN +" illness : "+this.illnes);
    }
}
