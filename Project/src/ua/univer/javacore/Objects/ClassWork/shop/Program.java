package ua.univer.javacore.Objects.ClassWork.shop;
import ua.univer.javacore.Objects.ClassWork.shop.Order;
public class Program {
    public static void main(String[] args) {
        Order order = new Order();
        order.add(new Product("Golden", 0.2, 20, 1));
        order.add(new Product("Red", 0.15, 10, 1));
        order.add(new Product("Tomato", 0.1, 30, 1));
    }
}
