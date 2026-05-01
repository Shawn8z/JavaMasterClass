public class BankAccount {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {

        this("56789", 2.5, "Default name", "Default address", "Default phone");
        System.out.println("Constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phone) {
        System.out.println("constructor with param called");
        accountNumber = number;
        accountBalance = balance;
        this.customerName = customerName;
        this.email = email;
        phoneNumber = phone;
    }

    public BankAccount(String phoneNumber, String email, String customerName) {
        this("99999", 100.55, customerName, email, phoneNumber);
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double num) {
        double balance = this.accountBalance;
        double newBalance = balance + num;
        this.setAccountBalance(newBalance);
    }

    public void withdrawFunds(double num) {
        double balance = this.accountBalance;
        if (num > balance) System.out.println("Insufficient funds");
        double newBalance = balance - num;
        this.setAccountBalance(newBalance);
    }
}
