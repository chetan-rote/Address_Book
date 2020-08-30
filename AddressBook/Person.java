package com.addressBook;

public class Person {

    private String firstName; 
    private String lastName; 
    private String address;  
    private String city; 
    private String state; 
    private long phonenumber; 
    private long zipCode;  
    
    public Person(String firstName, String lastName, String address, String city, String state, long phonenumber, long zipCode) {
                this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.phonenumber=phonenumber;
        this.zipCode=zipCode;
    }

     public String getFirstName() {
                return firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    
    public String getAddress() {
        return address;
    }

    
    public String getCity() {
        return city;
    }

    
    public String getState() {
        return state;
    }

    
    public long getNumber() {
                return phonenumber;
    }

    
    public long zipCode() {
        return zipCode;
    }

    
    public void printPerson() {
                System.out.print("Name: " +firstName+" "+lastName+", Address: "+address+ ", City: " +city+", State: "+state);
                System.out.println(", Phone: " +phonenumber+ ", Pin Code: " + zipCode + ".");
    }

}
