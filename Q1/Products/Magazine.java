package Homework6.Products;

import Homework6.Items;

public class Magazine extends Items {

    private String name;

    public Magazine(double price, int quantity, String name) {
        super(price, quantity);
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
