package Homework6.Service;

import Homework6.Customer;
import Homework6.OnlineShop;
import Homework6.Service.Login;
import Homework6.Service.Register;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("===================================================================");
        System.out.println("=============Welcome to the online Sop application================");
        System.out.println("===================================================================");

        OnlineShop onlineShop = new OnlineShop();
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Please select a number : ");
            System.out.println("1) Create an account");
            System.out.println("2) Login");

            int type = input.nextInt();
            switch (type) {

                case 1 -> {
                    System.out.println("=======================================================");
                    Register register = new Register();
                    register.registerNewCustomer();
                    register.addNewRegister(register);
                    System.out.println("=======================================================");
                }

                case 2 -> {
                    System.out.println("=======================================================");
                    Login login = new Login();
                    System.out.println("Please enter username");
                    String username = input.next();
                    System.out.println("Please choose a password");
                    String password = input.next();
                    if (login.userNameAndPassChecker(username, password))
                        return;
                    else
                        System.out.println("Incorrect username or password, try again.");
                    System.out.println("=======================================================");
                }
            }
        }
        System.out.println("=======================================================");
        System.out.println("Login was successful!");
        System.out.println("=======================================================");

        System.out.println("Please Enter your name");
        String name = input.next();
        System.out.println("Please Enter your lastname");
        String lastName = input.next();
        System.out.println("Please Enter your phone number");
        int phoneNumber = input.nextInt();
        System.out.println("Please Enter your E-mail");
        String email = input.next();
        System.out.println("Please Enter your address");
        String address = input.next();

        Customer newCustomer = new Customer(name,lastName,phoneNumber,email,address);
        onlineShop.addNewCustomer(newCustomer);

        while (true) {
            System.out.println("1) Print available items in the shop");
            System.out.println("2) purchasing an item (adding item to the shopping basket)");
            System.out.println("3) Removing an item from shopping basket");
            System.out.println("4) Print shopping Basket List");
            System.out.println("5) Exit the application");

            int type = input.nextInt();

            switch (type) {

                case 1-> {
                    System.out.println("=======================================================");
                    onlineShop.printShopAvailableProducts();
                    System.out.println("=======================================================");
                }

                case 2 -> {
                    System.out.println("=======================================================");
                    onlineShop.printShopAvailableProducts();
                    onlineShop.addItemToShoppingBasket();
                    System.out.println("=======================================================");
                }

                case 3 -> {
                    System.out.println("=======================================================");
                    onlineShop.removeItemFromShoppingBasket();
                    System.out.println("=======================================================");
                }

                case 4 -> {
                    System.out.println("=======================================================");

                    System.out.println("=======================================================");
                }

                case 5 -> {
                    System.out.println("Exiting the application");
                    System.exit(0);
                }

                default -> {
                    System.out.println("Incorrect input, Please Enter a correct Number");
                }
            }
        }

    }
}
