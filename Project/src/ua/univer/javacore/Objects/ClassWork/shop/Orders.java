package ua.univer.javacore.Objects.ClassWork.shop;

public class Orders {
    public static Product maxPriceWithWeightGreater(Product[] products, double weight){
        Product maxPriceProduct = products[0];
        boolean isFind=false;

        for (Product current : products) {
            if (maxPriceProduct.getPrice() < current.getPrice()&& current.getWeight()>0.2) {
                isFind=true;
                maxPriceProduct = current;
            }
        }
        if(isFind) return  maxPriceProduct;
        else return null;
    }
}
