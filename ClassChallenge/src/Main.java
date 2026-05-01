public class Main {

    public static void main(String[] args) {

//        BankAccount account = new BankAccount("11223344", 10000, "Shawn", "test@email", "111-111-1111" );
        BankAccount account = new BankAccount();
//        account.setCustomerName("Shawn");
//        account.setAccountNumber("11223344");
//        account.setAccountBalance(10000);
//        account.setEmail("test@email");
//        account.setPhoneNumber("111-111-1111");
        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");

        System.out.println("AccountNo: " + timsAccount.getAccountNumber() + "; name " + timsAccount.getCustomerName());
        System.out.println("The account belong to " + account.getCustomerName());
        System.out.println("The account balance is " + account.getAccountBalance());

        double pay = 20000;
        account.depositFunds(pay);
        System.out.println("After depositing your peck of $" +
                pay + " dollars your current balance is $" +
                account.getAccountBalance());

        double cash = 1500;
        account.withdrawFunds(cash);
        System.out.println("After withdrawing $" + cash +
                " your current balance is $" + account.getAccountBalance());

        account.withdrawFunds(100000);
    }
}
