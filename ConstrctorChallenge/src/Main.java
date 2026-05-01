public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Tim", 1000, "tim@email.com");

        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmailAddress());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
        System.out.println(secondCustomer.getEmailAddress());

        Customer thridCustomer = new Customer("Joe", "joe@email.com");
        System.out.println(thridCustomer.getName());
        System.out.println(thridCustomer.getCreditLimit());
        System.out.println(thridCustomer.getEmailAddress());
    }
}
