package Homework6;


import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);

    private String name;
    private String lastName;
    private int mobilePhone;
    private String emailAddress;
    private String address;

    public Customer(String name, String lastName, int mobilePhone, String emailAddress,
                    String address) {
        this.name = name;
        this.lastName = lastName;
        this.mobilePhone = mobilePhone;
        this.emailAddress = emailAddress;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAddress() {
        return address;
    }


}
