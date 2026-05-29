package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String str) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact item = myContacts.get(i);
            if (item.getName().contains(str)) {
                return i;
            }
            if (item.getPhoneNumber().contains(str)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addNewContact(Contact contact) {
        boolean hasContact = findContact(contact.getName()) >= 0;
        if (!hasContact) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int idx = findContact(oldContact);
        if (idx >= 0) {
            myContacts.set(idx, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        boolean hasContact = findContact(contact) >= 0;
        if (hasContact) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public Contact queryContact(String str) {
        int idx = findContact(str);
        if (idx >= 0) return myContacts.get(idx);
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact item = myContacts.get(i);
            System.out.println((i + 1) + ". " + item.getName() + " -> " + item.getPhoneNumber());
        }
    }
}
