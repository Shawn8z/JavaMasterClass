package dev.lpa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        boolean addResult = bank.addBranch("Adelaide");
        System.out.println(addResult);
        System.out.println(bank.getBranches());

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
        System.out.println(bank.getBranches());

        bank.listCustomers("Adelaide", true);
    }
}

class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    private Branch findBranch (String name) {
        for (Branch item : branches) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public boolean addBranch (String branchName) {
        boolean hasMatchingBranch = findBranch(branchName) != null;
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
        return targetBranch.newCustomer(customerName, transaction);
    }

    public boolean addCustomerTransaction(String branch, String cusName, double transaction) {
        Branch targetBranch = findBranch(branch);
        boolean branchMissing = targetBranch == null;
        if (branchMissing) {
            System.out.println("Branch (" + branch + ") not found");
            return false;
        }
        return targetBranch.addCustomerTransaction(cusName, transaction);
    }

    public boolean listCustomers(String branchName, boolean printTransaction) {
        System.out.println(branchName);
        Branch targetBranch = findBranch(branchName);
        if (targetBranch == null) {
            System.out.println("Branch (" + branchName + ") not found");
            return false;
        }

        ArrayList<Customer> customers = targetBranch.getCustomers();
        System.out.println("Customer details for branch " + targetBranch.getName());
        for (int i = 0; i < customers.size(); i++) {
            Customer cus = customers.get(i);
            System.out.printf("Customer: %s[%d]%n", cus.getName(), i + 1);

            if (printTransaction) {
                System.out.println("Transactions");

                ArrayList<Double> transactions = cus.getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    double amount = transactions.get(j);
                    System.out.printf("[%d] Amount %.2f%n", j + 1, amount);
                }
            }
        }

        return true;
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

    private Customer findCustomer(String CustomerName) {
        for (Customer item : customers) {
            if (item.getName().equals(CustomerName)) {
                return item;
            }
        }
//        System.out.println("Customer not found");
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

    @Override
    public String toString() {
        return "Branch name [" + name + "]" + ", Customers: " + customers;
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

    @Override
    public String toString() {
        return "Customer name [" + name + "]" + ", Transactions: " + transactions;
    }
}