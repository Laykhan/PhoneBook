package Kitanscode.com;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {



    static Contacts contact = new Contacts(); // Creates an instance of the Contacts Class.
    static Scanner input = new Scanner(System.in); // Creates an instance of the Scanner Class to receive input from the user.


    public static void main(String[] args) {
        // Invoke a function that prints out a set of instructions to the user as the session starts.
         start();
         int selectedNumber;

         boolean Quit = false;

        do {
             System.out.println("Select a Number: ");
             selectedNumber = input.nextInt(); // This reads the Selected Number from the User.
             input.nextLine(); // This reads the \n Next line character from the enter key.

            switch(selectedNumber) {
                case 1:
                    System.out.println("Enter Contact Name: "); //Ask user to enter contact name
                    String name = input.nextLine(); // Read the input and store it in a variable name.

                    System.out.println("Enter Contact Number: "); //Ask user to enter contact number.
                    String phoneNumber = input.nextLine(); // Read the input and store it in a variable number.
                    boolean validate = contact.numberValidate(name, phoneNumber); // Validates the phone number length.

                    if (validate) {
                        createContact(name, phoneNumber); // createContact Method runs
                    } else {

                    }

                    break;

                case 2:
                    System.out.println("Search Name: ");
                    String nameSearched = input.nextLine();
                    searchContact(nameSearched);
                    System.out.println("""
                                           Enter 5 to Quit
                                           Enter 0 to Continue""");

                    break;

//                case 3:
//                    System.out.println("Search Name");
//                    String nameDelete = input.nextLine();
//                    searchContact(nameDelete);
//                    deleteContact(nameDelete);
//                    System.out.println("""
//                                        Enter 5 to Quit
//                                        Enter 0 to continue""");
//                    break;

//                case 4:
//                    System.out.println("Search Name");
//                    String nameUpdate = input.nextLine();
//                    searchContact(nameUpdate);
//                    updateContact();
//                    break;

                case 5:
                    Quit = true;

                case 0:
                    start();

                default :
                    System.out.println("Invalid Number");
            }
        } while (!Quit);
    }



    private static void start(){
        System.out.println("""
                    1. Create Contact
                    2. Search Contact
                    5. Quit
                    0. Continue""");
    }

    private static void createContact(String name, String phoneNumber) {
        contact.phoneBook.put(name, phoneNumber); // Adds name and phone number to the HashMap.
    }

    private static void searchContact(String name) {

        for(String i : contact.phoneBook.keySet()) {
            if (Objects.equals(name, i)) {
                System.out.println("Contact Exist");
                System.out.println(i + " - " + contact.phoneBook.get(i));
                break;
            } else {
                System.out.println("Contact Not Found");
            }
        }

    }

//    private static void deleteContact(String name) {
//
//        for(String i : contact.phoneBook.keySet()) {
//            if (contact.phoneBook.containsKey(name)) {
//                System.out.println(i + "-" + contact.phoneBook.remove(name));
//            } else {
//                System.out.println("Contact Doesn't Exist");
//            }
//        }
//    }

//    private static void updateContact(String oldNumber, String newNumber) {
//        if(contact.phoneBook.containsValue(oldNumber)) {
//            oldNumber = newNumber;
//            contact.phoneBook.replace(oldNumber, newNumber);
//        } else {
//            System.out.println("Contact Not Found");
//        }
//    }



}











