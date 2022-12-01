package com.book;

    public class AddressBookSystemMain {
        //Default Constructor
        public AddressBookSystemMain() {
            System.out.println("Welcome to Address Book Program !!!");
        }

        public static void main(String[] args) {

            //Initialize Object
            AddressBookSystemMain obj = new AddressBookSystemMain();
            //Calling Encapsulated Class object
            AddressBook addressBook = new AddressBook("Sambit","kumar","choudwar","Cuttack",
                    "Odisha","754025","7008642521","sambit2024@gmail.com");

            System.out.print("\n"+addressBook.toString());

        }
    }


