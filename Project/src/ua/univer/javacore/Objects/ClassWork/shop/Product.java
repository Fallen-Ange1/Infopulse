package ua.univer.javacore.Objects.ClassWork.shop;



public class Product {
    private static int id=100;
    private String name;
    private double weight;
    private double price;
    private int amount;

    public Product(String name, double weight, double price, int amount) {
        this.name = name;
        this.weight = weight;
        setPrice(price);
        this.amount = amount;
        ++id;
    }

    public void setName(String name){

        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    public void setWeight(double weight){
        this.weight=weight;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setPrice(double price) {
        this.price = price/Currency.USD;
    }

    public double getPrice() {
        return price*Currency.USD*(1.20+0.10+0.15+0.50+1.00);
    }

    public void print() {
        System.out.println("Name = " + this.name + " , Weight = " + this.weight + " , Price = " + this.getPrice() + " , Amount = " + this.amount);
    }
}

