package ua.univer.javacore.Objects.ClassWork;

public class Mouse {
    String name;
    double weight;
    String killer;

    Mouse(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void print() {
        if (this.weight > 0)
            System.out.println("Name = " + this.name + ", Weight= " + this.weight);
        else System.out.println("Name= " + this.name + " R.I.P. by : " + this.killer);
    }
}