package dev.lpa;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    @Override
    public String toString() {
        String firstLine = "Customer name: " + this.name + "%n";
        String transactionsLine = "All transactions:%n";
        for (Double item : transactions) {
            String newStr = (item > 0) ? "credit amount: " + item + "%n" : "debit amount: " + item + "%n";
            transactionsLine += newStr;

        }
        return firstLine + transactionsLine;
    }
}
