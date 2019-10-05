package ua.univer.javacore.Objects.ClassWork;

import ua.univer.javacore.Objects.ClassWork.Cat;

public class Objects {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Tom", 5, 7);
        cat1.print();
        cat1.eat(1.5);
        cat1.print();

        Cat cat2 = new Cat("Tomidze", 3, 10);
        cat2.print();

        Mouse mouse1 = new Mouse("Jerry", 0.5);
        mouse1.print();

        cat1.eat(mouse1);
        mouse1.print();

        Dog dog1 = new Dog("Cris",3,20,true);
        dog1.print();
        dog1.eat(3.0);
        dog1.print();
        dog1.eat(cat1);
        dog1.print();
        cat1.print();

        TaiHuman hum1= new TaiHuman(20,"Kun",70);
        hum1.print();
        hum1.eat(3.0);
        hum1.print();
        hum1.eat(dog1);
        hum1.print();

    }
}
