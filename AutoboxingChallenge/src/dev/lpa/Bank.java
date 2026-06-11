package dev.lpa;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public Bank (String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public void addCustomer(Customer newCustomer) {
        String name = newCustomer.getName();
        if (customers.contains(newCustomer)) {
            System.out.println(name + " is already a customer");
        }
        customers.add(newCustomer);
        System.out.println("New customer " + name + " added successfully");
    }

    public void addTransaction(Customer customer, double transaction) {
        if (!customers.contains(customer)) {
            System.out.println("Customer " + customer.getName() + " does not exist.");
            return;
        }

        customer.addTransaction(transaction);
        System.out.println("Transaction of " + transaction + " dollar is successful for customer " + customer.getName());
    }

    public void printStatement(Customer customer) {
        System.out.println("=".repeat(30));
        System.out.println("Statement ready:");
        System.out.printf(customer.toString());
        System.out.println("=".repeat(30));
    }
}
