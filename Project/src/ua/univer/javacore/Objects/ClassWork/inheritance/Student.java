package ua.univer.javacore.Objects.ClassWork.inheritance;

import java.util.Objects;

public class Student extends Human {

    private int group;

    public Student(int id, String name, int year, int group) {
        super(id, name, year);
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public void Sleep() {
        System.out.println("Sleep student");
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + ", group=" + group + '}';
    }
}