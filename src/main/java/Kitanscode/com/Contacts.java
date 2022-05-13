package Kitanscode.com;

import java.util.HashMap;

public class Contacts implements Validation {
    public HashMap<String, String> phoneBook = new HashMap<String, String>(); // Creates a HashMap that stores our Contacts in Key/ Value pairs.
    public Contacts() { //Empty Constructor that works with instance of the class.

      }

    private void createContact(String name, String phoneNumber){

    }

    private String name;
    private String phoneNumber;



    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean numberValidate(String name, String phoneNumber) {
        if (phoneNumber.length() != 11) {
            System.out.println("Invalid PhoneNumber.");
            System.out.println("Enter PhoneNumber Again:");
            return false;
        }

        phoneBook.put(name, phoneNumber);
        System.out.println("Contact Added Successfully");
        System.out.println("""
                                        Enter 5 to Quit
                                        Enter 0 to Continue""");
        return true;
    }
}
