package dev.lpa;

import java.util.ArrayList;

public class Store {

    static ArrayList<ProductForSale> products = new ArrayList<>();
    static ArrayList<OrderItem> order = new ArrayList<>();

    public static void main(String[] args) {

        HygieneItem soap = new HygieneItem("Soap", 3.00, "A green bar soap, smells fresh");
        Fruit banana = new Fruit("Banana", 1.50, "Spotty bananas, must be sweet");

        products.add(soap);
        products.add(banana);

        OrderItem soapOrder = new OrderItem(10, products.get(0));
        addItemToOrder(soapOrder);
        showProductDetails(products.get(0));

        OrderItem bananaOrder = new OrderItem(3, products.get(1));
        addItemToOrder(bananaOrder);
        showProductDetails(products.get(1));
        printOrder();
    }

    private static void addItemToOrder(OrderItem item) {
        order.add(item);
    }

    private static void printOrder() {
        System.out.println("-".repeat(30));
        for (OrderItem item : order) {
            int itemCount = item.getQuantity();
            item.getProduct().printPricedItem(itemCount);
            System.out.println("-".repeat(30));
        }
    }

    private static void showProductDetails(ProductForSale product) {
        product.showDetails();
    }
}
