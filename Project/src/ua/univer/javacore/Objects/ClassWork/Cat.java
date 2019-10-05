package ua.univer.javacore.Objects.ClassWork;

public class Cat {
    int year;
    String name;
    double weight;
    String killer;

    Cat(String name, int year, double weight) {
        this.name = name;
        this.year = year;
        this.weight = weight;
    }

    public void eat(double food) {
        this.weight = this.weight + food;
        System.out.println("Cat plus " + food + " and now weight : " + this.weight);
    }

    public void eat(Mouse mouse) {
        this.weight = this.weight + mouse.weight;
        mouse.weight = 0;
        mouse.killer = this.name;
        System.out.println("Cat eat " + mouse.name + " and now weight : " + this.weight);
    }

    public void print() {
        if (weight > 0) System.out.println("Name = " + this.name + ", Year= " + this.year + ", Weight= " + this.weight);
        else System.out.println("Name= " + this.name + " R.I.P. by : " + this.killer);
    }
}
