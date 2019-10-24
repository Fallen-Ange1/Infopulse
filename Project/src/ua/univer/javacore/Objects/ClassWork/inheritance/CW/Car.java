package ua.univer.javacore.Objects.ClassWork.inheritance.CW;

public class Car extends Vechine {

    @Override
    public String toString() {
        return "Car{"+super.toString()+"}";
    }

    public Car(int price, int speed, int date , int pasangervechine, String name) {
        super(price, speed, date ,pasangervechine , name );

    }
}
