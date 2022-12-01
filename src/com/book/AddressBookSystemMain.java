package com.book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystemMain {
    //Default Constructor
    public AddressBookSystemMain() {
        System.out.println("Welcome to Address Book Program !!!");
    }



    private static ArrayList<String> contactDetails = new ArrayList<>();
    public static <ContactPerson> void main(String[] args) {

        //Initialize Object
        AddressBookSystemMain obj = new AddressBookSystemMain();

        //Calling Encapsulated Class object
        AddressBook a = new AddressBook("Sambit","kumar","choudwar","Cuttack",
                "Odisha","754025","7008642521","sambit2024@gmail.com");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the contact details.............");
        System.out.println("Enter the first name:");
        String firstName = scan.nextLine();
        System.out.println("Enter the last name:");
        String lastName = scan.nextLine();
        System.out.println("Enter the address:");
        String address = scan.nextLine();
        System.out.println("Enter the city:");
        String city = scan.nextLine();
        System.out.println("Enter the state:");
        String state = scan.nextLine();
        System.out.println("Enter the zip code:");
        String zip = scan.nextLine();
        System.out.println("Enter the phone no:");
        String phoneNumber = scan.nextLine();
        System.out.println("Enter the email:");
        String email = scan.nextLine();
        scan.close();
        AddressBook b = new AddressBook(firstName, lastName, address, city, state,zip,phoneNumber,email);

        //Parsing the object to create a list
        contactDetails.add(a.toString());
        contactDetails.add(b.toString());

        //Printing contact details
        a.printContact(contactDetails);
    }
}



