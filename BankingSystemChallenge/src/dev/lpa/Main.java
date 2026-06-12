package dev.lpa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    }
}

class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public Branch findBranch (String name) {
        for (Branch item : branches) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        System.out.println("Branch not found");
        return null;
    }

    public boolean addBranch (String branchName) {
        boolean hasMatchingBranch = findBranch(branchName) == null;
        if (hasMatchingBranch) {
            System.out.println("Branch already exists");
            return false;
        }
        Branch newBranch = new Branch(branchName);
        branches.add(newBranch);
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double transaction) {
        Branch targetBranch = findBranch(branchName);
        boolean branchMissing = targetBranch == null;
        if (branchMissing) {
            System.out.println("Branch (" + branchName + ") not found");
            return false;
        }
        Customer targetCus = targetBranch.findCustomer(customerName);
        boolean customerExists = targetCus != null;
        if (customerExists) {
            System.out.println("Customer (" + customerName + ") already exists");
            return false;
        }
        return targetBranch.newCustomer(customerName, transaction);
    }


}

class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch (String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public Customer findCustomer(String CustomerName) {
        for (Customer item : customers) {
            if (item.getName().equals(CustomerName)) {
                return item;
            }
        }
        System.out.println("Customer not found");
        return null;
    }

    public boolean newCustomer (String name, double initialTransaction) {
        boolean newCustomer = findCustomer(name) == null;
        if (!newCustomer) {
            System.out.println("Customer already on exist");
            return false;
        }

        Customer newCus = new Customer(name, initialTransaction);
        customers.add(newCus);
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer cus = findCustomer(name);
        if (cus == null) {
            System.out.println("Customer not found");
            return false;
        }

        cus.addTransaction(transaction);
        return true;
    }
}

class Customer {

    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions.add(initialTransaction);
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }
}