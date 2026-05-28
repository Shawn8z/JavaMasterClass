package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {

    String myNumber;
    ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        boolean hasContact = myContacts.contains(contact);
        if (!hasContact) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        boolean hasContact = myContacts.contains(oldContact);
        if (hasContact) {
            int targetIndex = myContacts.indexOf(oldContact);
            myContacts.set(targetIndex, newContact);
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        boolean hasContact = myContacts.contains(contact);
        if (hasContact) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String str) {
        for (int i = 0; i < myContacts.size() - 1; i++) {
            if (myContacts.get(i).getName().contains(str)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String str) {
        for (int i = 0; i < myContacts.size() - 1; i++) {
            if (myContacts.get(i).getName().contains(str)) {
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts() {

    }
}
