package ua.univer.javacore.Objects.ClassWork.inheritance;

public class Doctor extends Human {

    private int license;

    public Doctor(int id, String name, int year, int license) {
        super(id, name, year);

        this.license = license;
    }

    public int getLicense() {
        return license;
    }

    public void setLicense(int license) {
        this.license = license;
    }

    @Override
    public void Sleep() {
        System.out.println("Sleep doctor");
    }

    public void cure() {
        System.out.println("Cure");
    }

    @Override
    public String toString() {
        return "Doctor{" + super.toString() + ", license=" + license + '}';
    }
}
