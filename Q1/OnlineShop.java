package Homework6;

import Homework6.Products.Book;
import Homework6.Products.GameConsole;
import Homework6.Products.Shoe;
import Homework6.Products.TV;
import Homework6.Service.Constants;

import java.util.Scanner;

public class OnlineShop {

    Scanner scanner = new Scanner(System.in);

    private Store store;

    private Object[] shoppingBasket;
    private GameConsole[][] gConsolesInShop;
    private TV[][] tvsInShop;
    private Shoe[][] shoesInShop;
    private Book[][] booksInShop;

    private Customer[] customers;

    int purchasedGConsols;
    private int purchasedTVs;
    private int purchasedBooks;
    private int purchasedShoes;

    private int purchasedItems;
    private int shoppingItemIndex;
    private int customerIndex;
    private double totalCost;

    TV[][] tvsInStore = store.getTvs();
    GameConsole[][] gameConsoleInStore = store.getGameConsoles();
    Book[][] booksInStore = store.getBooks();
    Shoe[][] shoesInStore = store.getShoes();

    public OnlineShop(){
        this.gConsolesInShop = shopGConsolList();
        this.tvsInShop = shopTVList();
        this.booksInShop = shopBookList();
        this.shoesInShop = shopShoeList();
    }

    public Store getStore() {
        return store;
    }

    public int getPurchasedItems() {
        return purchasedItems;
    }

    public int getShoppingItemIndex() {
        return shoppingItemIndex;
    }

    public int getCustomerIndex() {
        return customerIndex;
    }

    public void printShopAvailableProducts() {
        System.out.println("=======================================================");
        System.out.println("=========The available products in the shop are========");
        System.out.println("=======================================================");
        System.out.println(gConsolesInShop[0][0]);
        System.out.println(gConsolesInShop[1][0]);
        System.out.println("=======================================================");
        System.out.println(tvsInShop[0][0]);
        System.out.println(tvsInShop[0][1]);
        System.out.println("=======================================================");
        System.out.println(booksInShop[0][0]);
        System.out.println(booksInShop[0][1]);
        System.out.println("=======================================================");
        System.out.println(shoesInShop[0][0]);
        System.out.println(shoesInShop[0][1]);
        System.out.println("=======================================================");
    }

    public GameConsole[][] shopGConsolList() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                if (gConsolesInShop[i][j] == null)
                    gConsolesInShop[i][j] = gameConsoleInStore[i][j];
            }
        }
        return gameConsoleInStore;

    }

    public TV[][] shopTVList() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                if (tvsInShop[i][j] == null)
                    tvsInShop[i][j] = tvsInStore[i][j];
            }
        }
        return tvsInShop;
    }

    public Shoe[][] shopShoeList() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if (shoesInShop[i][j] == null)
                    shoesInShop[i][j] = shoesInStore[i][j];
            }
        }
        return shoesInStore;
    }

    public Book[][] shopBookList() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (booksInShop[i][j] == null)
                    booksInShop[i][j] = booksInStore[i][j];
            }
        }
        return booksInStore;
    }

    public void addItemToShoppingBasket() {
        if (isAbleToPurchase()) {
            System.out.println("Please choose a number");
            int productID = scanner.nextInt();
            System.out.println("please choose an option");
            int option = scanner.nextInt();
            switch (productID) {
                case 1 -> purchaseItem(option, gConsolesInShop, Constants.AVAILABLE_GAMECONSOLS_IN_SHOP);
                case 2 -> purchaseItem(option, tvsInShop, Constants.AVAILABLE_TV_IN_SHOP);
                case 3 -> purchaseItem(option, booksInShop, Constants.AVAILABLE_BOOKS_IN_SHOP);
                case 4 -> purchaseItem(option, shoesInShop, Constants.AVAILABLE_SHOES_IN_SHOP);
            }
        } else
            System.out.println("Sorry, you are not able to buy a new item. remove an item to continue");
    }

    public void purchaseItem(int option, Object[][] productsInShop, int availableItemShop) {

        if (option == 1) {
            for (int i = 0; i < 5; i++) {
                if (productsInShop[0][i] != null) {
                    shoppingBasket[shoppingItemIndex++] = productsInShop[0][i];
                    productsInShop[0][i] = null;
                    availableItemShop--;
                    purchasedItems--;
                }
            }
        } else if (option == 2) {
            for (int i = 0; i < 5; i++) {
                if (productsInShop[1][i] != null) {
                    shoppingBasket[shoppingItemIndex++] = productsInShop[1][i];
                    productsInShop[1][i] = null;
                    availableItemShop--;
                    purchasedItems--;
                }
            }
        } else
            System.out.println("You have entered the wrong number! Please Enter number 1 or 2.");
    }

    public void removeItemFromShoppingBasket(Object object) {
        for (int i = 0; i < shoppingBasket.length; i++) {
            if (shoppingBasket[i] != null && shoppingBasket[i].equals(object)) {
                shoppingBasket[i] = null;
            }
        }
    }

    public void addNewCustomer(Customer newCustomer) {
        if (customerIndex == customers.length) {
            Customer[] newCustomers = new Customer[2 * Constants.MAX_NUMBER_OF_CUSTOMERS];
            for (int i = 0; i < customers.length; i++) {
                newCustomers[i] = customers[i];
            }
            this.customers = newCustomers;
        } else {
            for (Customer currentCustomer : customers) {
                if (currentCustomer == null)
                    customers[customerIndex++] = newCustomer;
            }
        }
    }

    public boolean isAbleToPurchase() {
        return getPurchasedItems() < Constants.MAX_PURCHASED_ITEMS;
    }


    public void purchasedItemInformation(int product,int option) {
        System.out.println(gConsolesInShop[0][0]);

        switch (option) {
            case 1:



        }
    }


}
