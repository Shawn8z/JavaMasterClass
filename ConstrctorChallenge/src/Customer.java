public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer() {
        this("Default name", "Default address");
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer(String name, String emailAddress) {
        this(name, 3000, emailAddress);
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}
