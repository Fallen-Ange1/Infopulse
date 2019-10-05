package ua.univer.javacore.Objects.ClassWork.shop;

public class ProgramStatic {
    public static void main(String[] args) {
        Currency.USD = 25.00;
        Product apple = new Product("Golden", 0.2, 20, 1);
        Product potato = new Product("Red", 0.15, 10, 1);
        Product banana = new Product("Yellow", 0.3, 25, 1);
        double customer_price = apple.getPrice();
        System.out.println(customer_price);
        apple.print();
        potato.print();
        banana.print();
        Currency.USD = 30;
        apple.print();
        potato.print();
        banana.print();

        System.out.println("--------------------------");

        Product[] products = new Product[4];
        products[0] = apple;
        products[1] = potato;
        products[2] = banana;
        products[3] = new Product("Bud", 0.5, 25, 2);

        Orders.maxPriceWithWeightGreater(products,0.2);
}
}
