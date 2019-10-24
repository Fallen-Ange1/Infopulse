package ua.univer.javacore.Objects.ClassWork.inheritance.CW;

public class Plane extends Vechine {
    double height;

    public Plane(int price, int speed, int date , int pasangervechine , String name, double height) {
        super(price, speed, date , pasangervechine , name);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Plane{" +super.toString()+ " , height=" + height + '}';
    }
}
