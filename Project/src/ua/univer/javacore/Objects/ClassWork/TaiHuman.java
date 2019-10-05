package ua.univer.javacore.Objects.ClassWork;

import java.sql.SQLOutput;

public class TaiHuman {
    int year;
    String name;
    double weight;

    TaiHuman(int year, String name, int weight) {
        this.year = year;
        this.name = name;
        this.weight = weight;
    }

    public void eat(double food) {
        this.weight = this.weight + food;
        System.out.println("Human eat food " + food + " kg and now weight :" + this.weight);
    }

    public void eat(Dog dog) {
        if (dog.ill) {
            this.weight = 0;
            System.out.println(this.name + " eat ill dog and die");
        }
        else{
            this.weight=this.weight+dog.weight;
            System.out.println(this.name+" eat "+dog.name+" "+dog.weight + " kg and now weight :"+this.weight);
        }
    }
    public void print() {
        System.out.println("Name = " + this.name + ", Year= " + this.year + ", Weight= " + this.weight);
    }
}
