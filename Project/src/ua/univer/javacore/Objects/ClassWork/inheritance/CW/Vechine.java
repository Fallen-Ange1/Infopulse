package ua.univer.javacore.Objects.ClassWork.inheritance.CW;

public abstract class Vechine {
    private  int price ;
    private  int speed;
    private int date;
    private int pasangervechine;
    private String name;

    public Vechine(int price, int speed, int date, int pasangervechine , String name) {
        this.price = price;
        this.speed = speed;
        this.date = date;
        this.pasangervechine=pasangervechine;
        this.name=name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "price=" + price + ", speed=" + speed + ", date=" + date +", name=" + name ;
    }
}
