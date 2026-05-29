package dev.lpa;

public class Main {

    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone("iphone");
        Contact contact1 = new Contact("mike", "11223344");
        Contact contact2 = new Contact("bob", "44332211");
        boolean result1 = phone.addNewContact(contact1);
        boolean result2 = phone.addNewContact(contact2);
        boolean result3 = phone.addNewContact(contact1);
        System.out.println(result1 + "  result1");
        System.out.println(result2 + "  result2");
        System.out.println(result3 + "  result3");
        phone.printContacts();
    }
}
