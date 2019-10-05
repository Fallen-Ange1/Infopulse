package ua.univer.javacore.Objects.ClassWork;

public class Dog {
    String name;
    double weight;
    double year;
    boolean ill;

    Dog(String name, int weight, int year, boolean ill) {
        this.name = name;
        this.weight = weight;
        this.year = year;
        this.ill=ill;
    }

    public void eat(double food) {
        this.weight = this.weight + food;
        System.out.println("Dog eat food :" + food + " and now weight : " + this.weight);
    }

    public void eat(Cat cat) {
        this.weight = this.weight + cat.weight;
        cat.killer = this.name;
        System.out.println("Dog eat cat ( " + cat.weight + " kg ) and now weight " + this.weight);
        cat.weight = 0;
    }

    public void print() {
        System.out.println("Name = " + this.name + ", Year= " + this.year + ", Weight= " + this.weight);
    }
}

