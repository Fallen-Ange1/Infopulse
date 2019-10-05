package ua.univer.javacore.Objects.ClassWork.shop;

public class Order {
    Product[] products;
    private int size;

    public Order() {
        products = new Product[10];
        size = -1;
    }

    public void add(Product product) {
        if (size < products.length - 1) products[++size] = product;
    }

}
