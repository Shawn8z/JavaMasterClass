package dev.lpa;

public class Fruit extends ProductForSale{

    public Fruit(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("-- Product type: " + super.getType() + " -- Description: " +
                super.getDescription() + " -- Price: " + super.getPrice()
        );

    }


}
