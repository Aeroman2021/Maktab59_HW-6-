package Homework6.Service;

import java.util.Scanner;

public class Register {
    Scanner scanner = new Scanner(System.in);
    private String userName;
    private String password;
    private boolean isRegistered;
    private int customerID = 1;
    private int customerIndex;
    Register[] registers;

    public void registerNewCustomer(){
        System.out.println("Please enter username");
        String username = scanner.next();
        System.out.println("Please choose a password");
        String password = scanner.next();
        this.userName = username;
        this.password = password;
        this.customerID = customerID++;
        this.registers = new Register[10];
        this.isRegistered = true;
    }

    public Register[] getRegisters() {
        return registers;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void addNewRegister(Register newRegister){
        registers[customerIndex++] = newRegister;
    }
}
