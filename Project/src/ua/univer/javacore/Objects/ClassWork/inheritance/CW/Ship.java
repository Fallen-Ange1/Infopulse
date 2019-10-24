package ua.univer.javacore.Objects.ClassWork.inheritance.CW;

public class Ship extends Vechine {
    private String port;

    public Ship(int price, int speed, int date, int pasangervechine , String name , String port) {
        super(price, speed, date, pasangervechine , name);
        this.port=port;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Ship{" +super.toString()+ "port='" + port + '\'' + '}';
    }
}
