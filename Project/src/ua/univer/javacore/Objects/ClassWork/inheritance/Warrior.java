package ua.univer.javacore.Objects.ClassWork.inheritance;

public class Warrior extends Human {
    private int power;

    public Warrior(int id, String name, int year, int power) {
        super(id, name, year);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Warrior{" + super.toString() + ", power=" + power + '}';
    }
}
