package com.addressBook;

/****************************************
 * 
 * Purpose: To create Address book where we can add, edit or delete record
 * 
 * 
 * @version 1.0
 * @since 28/08/2020
 * 
 ***************************************/

import java.util.Scanner;

public class AddressBook{

    private Person[] names; 
    private int numofPerson;

    public AddressBook() {
                names = new Person[10];
                numofPerson = 0;
    }

    public void addPerson(Person p) {
                names[numofPerson] = p;
                numofPerson++;
    }

    public void printPersons() {
                for (int i=0;i<numofPerson;i++)
                names[i].printPerson();
    }

    public int PersonCount() {
                return numofPerson;
    }

    private int havePersons(String fn, String ln) {

                for (int i=0;i<numofPerson;i++)
                if (names[i].getFirstName().equals(fn) && names[i].getLastName().equals(ln))
                                return i;
                return -1;
    }

    public void deletePersons(String fn, String ln) {

                int place = havePersons(fn,ln);
                if (place >= 0) {
                names[place] = names[numofPerson-1];
                numofPerson--;
                System.out.println("Record Deleted.");
                }
                else
                        System.out.println("Record Not Present.");
    }
    
    public static void menu() {
                System.out.println("1.To add a person, follow the prompts.");
                System.out.println("2.Delete a person detail from your address book.");
                System.out.println("3.Print the number of record you have.");
                System.out.println("4.Print information of all Record.");
                System.out.println("5.Quit.");
                System.out.println("Enter your menu choice:");
    }



    public static void main(String[] args) {

                @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);

                AddressBook person1 = new AddressBook();

                menu();
     
                int choice = sc.nextInt();


                while (choice!=5) {

                
                if (choice == 1) {

                                if (person1.PersonCount() < 10) {

                           
                                System.out.print("Enter First name: ");
                                String firstName = sc.next();
                                System.out.print("Enter Last name: ");
                                String lastName = sc.next();
                                sc.nextLine();
                                System.out.print("Enter Address: ");
                                String add = sc.nextLine();
                                System.out.print("Enter City name: ");
                                String city = sc.next();
                                System.out.print("Enter State name: ");
                                String state = sc.next();
                                System.out.print("Enter Phone number: ");
                                long pnumber = sc.nextLong();
                                System.out.print("Enter zipcode Code: ");
                                long zipcode = sc.nextLong();

                                person1.addPerson(new Person(firstName,lastName,add,city,state,pnumber,zipcode));
                                }
                                else
                                System.out.println("Person cannot be added anymore, the AddressBook is full.");
                }

                 else if (choice == 2) {
                                System.out.println("Enter first name of the record you want to delete?");
                                String firstName = sc.next();
                                System.out.println("Enter last name of the record you want to delete?");
                                String lastName = sc.next();
                                person1.deletePersons(firstName, lastName);
                }
                else if (choice == 3) {
                                System.out.println("You have " + person1.PersonCount() + " record.");
                }
                else if (choice == 4) {
                                person1.printPersons();
                }
                
                else if (choice >=5) {
                                System.out.println("Entered invalid choice try again.");
                }

                menu();
                choice = sc.nextInt();
                }

    }
}
