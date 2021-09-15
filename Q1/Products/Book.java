package Homework6.Products;

import Homework6.Items;
import Homework6.ProductsType.BooKType;

public class Book extends Items {
    private BooKType type;
    private String name;

    public Book(String name,BooKType type,double price) {
        super(price, 3);
        this.type = type;
        this.name = name;
    }


    public BooKType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productID=" + productID +
                "} " + super.toString();
    }
}
