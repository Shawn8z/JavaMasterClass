package dev.lpa;

public class Main {

    public static void main(String[] args) {

        Customer mike = new Customer("Mike");
        Customer bob = new Customer("Bob");

        Bank bigBank = new Bank("ABC Bank");

        bigBank.addCustomer(mike);
        bigBank.addCustomer(bob);

        bigBank.addTransaction(mike, 15);
        bigBank.addTransaction(mike, 20);
        bigBank.addTransaction(mike, -100);

        bigBank.addTransaction(bob, 100);
        bigBank.addTransaction(bob, 30);
        bigBank.addTransaction(bob, -11);

        bigBank.printStatement(bob);
        bigBank.printStatement(mike);
    }
}
