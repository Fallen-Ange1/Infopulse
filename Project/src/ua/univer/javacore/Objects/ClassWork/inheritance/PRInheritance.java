package ua.univer.javacore.Objects.ClassWork.inheritance;

import org.w3c.dom.ls.LSOutput;

public class PRInheritance {
    public static Human faceControll(Human current) {
        return current.getYear() > 20 ? current : null;
    }

    public static void main(String[] args) {
        Student ST1 = new Student(1, "Tasya", 20, 11);
        Student ST2 = new Student(2, "Vasya", 20, 11);
        Doctor doc1 = new Doctor(3, "Haus", 50, 666);
        Warrior war1 = new Warrior(4, "Conan", 30, 100);

        Human[] people = new Human[4];
        people[0] = ST1;
        people[1] = ST2;
        people[2] = doc1;
        people[3] = war1;


        for (Human current : people) {
            System.out.println(faceControll(current) != null ? current : "Go home " + current);
        }

    }
}
